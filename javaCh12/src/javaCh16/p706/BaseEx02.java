package javaCh16.p706;

public class BaseEx02 {

	public static void main(String[] args) {
		Person person = new Person();
		
		//�����޼ҵ��� ��� 
		//�͸��� ���� Ŭ������ ���� �Ű����� ó�� 
		person.action( new InterEx01() {
			
			@Override
			public double c(double x, double y) {
				// TODO Auto-generated method stub
				return Computer.sM(x, y);
			}
		});
        //���ٽ�����  1����
		person.action(  (double x, double y) -> { return Computer.sM(x, y); }  );
		
		//���ٽ�����  2����
		person.action(  ( x,  y) ->   Computer.sM(x, y) );  
		
		//�޼ҵ� ������ ǥ���� 
		person.action(  Computer::sM  );
		
		
	}

}
