package javaCh13;

public class BaseEx01 {

	public static void main(String[] args) {
		//제네릭 좋은점: 미리 자료형 정해둠
		
		Box<String> box1=new Box<String>();
		box1.content = "사과";	//사과를 box1에 담아서 Box의 content에 넣는다
	//	box1.content = 100   //제네릭을 String으로 해놨기 때문에 에러난다
		
		Box<Integer> box2=new Box<Integer>();
		box2.content=100;
	//	box2.content="사과";
		
	}

}

class Box<T> {	//<> 안에는 대문자 A~Z 상관없음
	public T content;
	
}
