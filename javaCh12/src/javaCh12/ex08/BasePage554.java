package javaCh12.ex08;

@An1
public class BasePage554 {

	public static void main(String[] args) {
		// @ ���� ���� �ִ� ��
		@An1(prop1="ȫ�浿")
		public String name;

	}

}

class A {
	public void aMethod() { }
}

class AA extends A {
	@Override	//@ ������̼� �������̵�:�θ𿡰� �Ȱ��� �޼ҵ尡 �ִ�. (����Ÿ�� void�� int ������� �ٲٸ� �ȵ�)
	public void aMethod() {
		// TODO Auto-generated method stub
		super.aMethod();
	}
}

