package javaCh16;

public class BaseEx01 {

	public static void main(String[] args) {
		   //���1) �������̽��� ����Ŭ������ ����� c()�߻�޼ҵ带 �������ؼ� ����Ѵ�.
		   CalcuImpl c1 = new CalcuImpl();
		   c1.c();
		   
		   //���2) �������̽��� �͸��� ����Ŭ������ ����� c() �߻�޼ҵ带 ������ �ؼ� ����Ѵ�.
		   Calculable c2= new Calculable() {
			
			@Override
			public void c() {
				System.out.println( "�͸��� ���� Ŭ���� �Դϴ�.");
				
			}
		  };
		  
		  c2.c();
		   
		  //���3) ���ٽ� ǥ���ϱ�
		  Calculable c3 = ()->  System.out.println( "���ٽ� ǥ��"); 
		  
		  c3.c();
		  
		  
		  //���2) �͸� ���� Ŭ����
		   InterEx01 i1 = new InterEx01() {
			
			@Override
			public void cc() {
				System.out.println( 3000 ); //�߻�޼ҵ忡 �ڵ� �ۼ��� ��
				
			}
		  };
		  
		
		  //�޼ҵ� ȣ��
		  i1.cc();
		  
		  //���3) ���ٽ� 
		  InterEx01 i2 =()-> { System.out.println( 5000 ); };
		  i2.cc();
		  
		  //���2) �͸��� ���� Ŭ���� �����
		  InterEx02 ie1=new InterEx02() {
			
			@Override
			public void a(int a1, double a2) {
			System.out.println(a1+" "+a2);	
			}
		};
		
		ie1.a(100, 2.5);
		
		//���3) ���ٽ����� �����
	//	InterEx02 ie2 =(int a1, double a2)-> {
	//		System.out.println(a1+" "+a2);
	//	};
		InterEx02 ie2 =(a, b)-> System.out.println(a+" "+b);
		
		ie2.a(200, 4.5);  
		  
	}
	
	
	
	
	
	

}

