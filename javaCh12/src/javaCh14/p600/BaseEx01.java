package javaCh14.p600;

public class BaseEx01 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		String threadName = mainThread.getName();
		System.out.println(threadName);

		PhoneThread ph=new PhoneThread();
		Thread t1=new Thread(ph);
		t1.start();
		
		Youtube you = new Youtube();	//��ӹ޾����ϱ� �ٷ� �� �� ����
		you.start();
		
		//������ �̸� �˱�
		System.out.println("�̸�: "+t1.currentThread().getName());
		System.out.println("�̸�: "+you.currentThread().getName());
		
		t1.currentThread().setName("��ȭ");
		System.out.println("�̸�: "+t1.currentThread().getName());
		you.currentThread().setName("��Ʃ��");
		System.out.println("�̸�: "+you.currentThread().getName());
		
		System.out.println(t1.currentThread().getPriority());//�켱������ 1~10
		
		t1.currentThread().setPriority(1);
		System.out.println(t1.currentThread().getPriority());
		you.currentThread().setPriority(10);
		System.out.println(you.currentThread().getPriority());
		
		
	}

}
