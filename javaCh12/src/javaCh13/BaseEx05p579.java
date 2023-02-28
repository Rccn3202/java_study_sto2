package javaCh13;

public class BaseEx05p579 {

	public static void main(String[] args) {
		//제네릭 메소드
		Box3<String> box=new Box3<String>();
		box.setT("홍길동");
		System.out.println(box.getT());

		Box2<String, Integer> box2=new Box2<String,Integer>("이순신",100);
		System.out.println(box2.getS()+" "+box2.getT());
		
		Box2<Boolean, Box3> box3=new Box2<Boolean,Box3>(true,new Box3<String>("신검대상")); //남자 신검대상
		System.out.println( (box3.getS() ? "남자":"여자")+" "+box3.getT().getT());
		
	}

	public <A, B> void gM() {
		
	}
}



class Box3<T> {
	private T t;

	
	public Box3() {	//기본생성자
		
	
	}

	public Box3(T t) {
		
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public T play() {
		return t;
	}
	
}



class Box2<S,T> {

	private S s;	//true
	private T t;	//Box3 주소
	
	public Box2(S s, T t) { //명시적 생성자가 있으면 기본생성자를 만들 수 없다
		super();			//Box2<String, Integer> box2=new Box2<String,Integer>();   box.setT("홍길동");
		this.s = s;			//말고 바로 Box2<String, Integer> box2=new Box2<String,Integer>("이순진",100); 이렇게 넣어야함
		this.t = t;
	}
	
	public S getS() {
		return s;
	}
	public void setS(S s) {
		this.s = s;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	
}



