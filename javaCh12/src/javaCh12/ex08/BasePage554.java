package javaCh12.ex08;

@An1
public class BasePage554 {

	public static void main(String[] args) {
		// @ 실행 정보 주는 것
		@An1(prop1="홍길동")
		public String name;

	}

}

class A {
	public void aMethod() { }
}

class AA extends A {
	@Override	//@ 어노테이션 오버라이드:부모에게 똑같은 메소드가 있다. (리턴타입 void를 int 등등으로 바꾸면 안됨)
	public void aMethod() {
		// TODO Auto-generated method stub
		super.aMethod();
	}
}

