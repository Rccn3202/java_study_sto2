package javaCh12.ex07;



public class BasePageP547 {


		public static void main(String[] args) {
			// ���÷���
	        // ��Ÿ����
			
		    Class c1 = Car.class;	
			System.out.println( c1 );
			
			Class c2;
			try {
				c2 = Class.forName("javaCh12.ex07.Car");
				System.out.println( c2.getDeclaredConstructors()  );
				System.out.println( c2.getDeclaredField("color")  );
			} catch (ClassNotFoundException | NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//���ҽ� - �̹���, ȯ�漳���� ���� ���ϵ�
			Class clazz=BasePageP547.class; //BasePage547Ŭ������ ��Ÿ������ ���� �� �ִ�.
			String photo1path=clazz.getResource("1.jpg").getPath();
			String photo2path = clazz.getResource("image/2.jpg").getPath();
			System.out.println(photo1path);
			System.out.println(photo2path);
			
		}

	}

	class Car{
		private String color;
		public Car( String color) {
			this.color = color;
		}
	}