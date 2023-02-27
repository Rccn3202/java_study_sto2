package javaCh12.ex09;

public class IntegerCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println( obj1 == obj2 );
		System.out.println( obj3.equals(obj4) );


		//이유 : 값의 범위가 -128~127까지는 값으로 비교함. 이 범위 이외에는 번지로 비교한다

		System.out.println(Math.ceil(5.3));
		System.out.println(Math.floor(5.3));
		System.out.println(Math.max(5.3, 2.5));
		System.out.println(Math.round(5.7));
		
								
		
		
		
		
	
	}

}
