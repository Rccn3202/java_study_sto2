package javaCh16.p706;

public class BaseEx02 {

	public static void main(String[] args) {
		Person person = new Person();
		
		//정적메소드일 경우 
		//익명형 구현 클래스인 경우로 매개변수 처리 
		person.action( new InterEx01() {
			
			@Override
			public double c(double x, double y) {
				// TODO Auto-generated method stub
				return Computer.sM(x, y);
			}
		});
        //람다식으로  1차로
		person.action(  (double x, double y) -> { return Computer.sM(x, y); }  );
		
		//람다식으로  2차로
		person.action(  ( x,  y) ->   Computer.sM(x, y) );  
		
		//메소드 참조로 표현함 
		person.action(  Computer::sM  );
		
		
	}

}
