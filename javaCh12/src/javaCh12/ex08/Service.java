package javaCh12.ex08;

public class Service {

	@PrintAnnotation	//default  - 15개
	public void method1() {
		System.out.println("실행 내용1");
	}
	@PrintAnnotation("*")	//-대신 *
	public void method2() {
		System.out.println("실행 내용1");
	}
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용1");
		
	}
	public void method4() {
		System.out.println("sodyd");
	}
}
