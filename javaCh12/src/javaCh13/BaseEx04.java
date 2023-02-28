package javaCh13;

public class BaseEx04 {

	public static void main(String[] args) {
		A<String> a=new A<String>();
		AA<Integer, Boolean> aa=new AA<Integer,Boolean>();

	}

}

class A<I>{
	
}

class AA<I,J> extends A<I> {
	
}

class AAA<I,J,K> extends AA<I,J>{ //제네릭은 자식이 부모것 포함 가지고있어야한다
	
}
