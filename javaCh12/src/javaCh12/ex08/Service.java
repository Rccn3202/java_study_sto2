package javaCh12.ex08;

public class Service {

	@PrintAnnotation	//default  - 15��
	public void method1() {
		System.out.println("���� ����1");
	}
	@PrintAnnotation("*")	//-��� *
	public void method2() {
		System.out.println("���� ����1");
	}
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("���� ����1");
		
	}
	public void method4() {
		System.out.println("sodyd");
	}
}
