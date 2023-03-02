package javaCh16;

public class BaseEx01 {

	public static void main(String[] args) {
		   //방법1) 인터페이스를 구현클래스로 만들고 c()추상메소드를 재정의해서 사용한다.
		   CalcuImpl c1 = new CalcuImpl();
		   c1.c();
		   
		   //방법2) 인터페이스를 익명형 구현클래스로 만들고 c() 추상메소드를 재정의 해서 사용한다.
		   Calculable c2= new Calculable() {
			
			@Override
			public void c() {
				System.out.println( "익명형 구현 클래스 입니다.");
				
			}
		  };
		  
		  c2.c();
		   
		  //방법3) 람다식 표현하기
		  Calculable c3 = ()->  System.out.println( "람다식 표현"); 
		  
		  c3.c();
		  
		  
		  //방법2) 익명 구현 클래스
		   InterEx01 i1 = new InterEx01() {
			
			@Override
			public void cc() {
				System.out.println( 3000 ); //추상메소드에 코드 작성한 것
				
			}
		  };
		  
		
		  //메소드 호출
		  i1.cc();
		  
		  //방법3) 람다식 
		  InterEx01 i2 =()-> { System.out.println( 5000 ); };
		  i2.cc();
		  
		  //방법2) 익명형 구현 클래스 만들기
		  InterEx02 ie1=new InterEx02() {
			
			@Override
			public void a(int a1, double a2) {
			System.out.println(a1+" "+a2);	
			}
		};
		
		ie1.a(100, 2.5);
		
		//방법3) 람다식으로 만들기
	//	InterEx02 ie2 =(int a1, double a2)-> {
	//		System.out.println(a1+" "+a2);
	//	};
		InterEx02 ie2 =(a, b)-> System.out.println(a+" "+b);
		
		ie2.a(200, 4.5);  
		  
	}
	
	
	
	
	
	

}

