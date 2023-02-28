package javaCh13;

public class Ex03 {

	public static void main(String[] args) {
		Container3<String,String> container1 = new Container3<String, String>();
		container1.set("홍길동","도적");
		String name1=container1.getKey();
		String job=container1.getValue();
		
		Container3<String,Integer> container2 = new Container3<String,Integer>();
		container2.set("홍길동",35);
		String name2 = container2.getKey();
		int age = container2.getValue();

	}

}

class Container3<A,B> {
	private A a;
	private B b;
	
	void set(A a,B b) {
		this.a = a;//디스 에인는 위의 에이, 그냥 에이는 가로 안에 있는 에이
		this.b=b;
	}
	
	
		A getKey(){
			return a;
		}
		B getValue(){
			return b;
		}
		
	
}
