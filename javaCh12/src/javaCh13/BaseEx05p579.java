package javaCh13;

public class BaseEx05p579 {

	public static void main(String[] args) {
		//���׸� �޼ҵ�
		Box3<String> box=new Box3<String>();
		box.setT("ȫ�浿");
		System.out.println(box.getT());

		Box2<String, Integer> box2=new Box2<String,Integer>("�̼���",100);
		System.out.println(box2.getS()+" "+box2.getT());
		
		Box2<Boolean, Box3> box3=new Box2<Boolean,Box3>(true,new Box3<String>("�Ű˴��")); //���� �Ű˴��
		System.out.println( (box3.getS() ? "����":"����")+" "+box3.getT().getT());
		
	}

	public <A, B> void gM() {
		
	}
}



class Box3<T> {
	private T t;

	
	public Box3() {	//�⺻������
		
	
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
	private T t;	//Box3 �ּ�
	
	public Box2(S s, T t) { //����� �����ڰ� ������ �⺻�����ڸ� ���� �� ����
		super();			//Box2<String, Integer> box2=new Box2<String,Integer>();   box.setT("ȫ�浿");
		this.s = s;			//���� �ٷ� Box2<String, Integer> box2=new Box2<String,Integer>("�̼���",100); �̷��� �־����
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



