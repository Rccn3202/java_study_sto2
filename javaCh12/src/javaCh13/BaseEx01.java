package javaCh13;

public class BaseEx01 {

	public static void main(String[] args) {
		//���׸� ������: �̸� �ڷ��� ���ص�
		
		Box<String> box1=new Box<String>();
		box1.content = "���";	//����� box1�� ��Ƽ� Box�� content�� �ִ´�
	//	box1.content = 100   //���׸��� String���� �س��� ������ ��������
		
		Box<Integer> box2=new Box<Integer>();
		box2.content=100;
	//	box2.content="���";
		
	}

}

class Box<T> {	//<> �ȿ��� �빮�� A~Z �������
	public T content;
	
}
