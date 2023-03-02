package javaCh14.p600;

public class BaseEx01 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		String threadName = mainThread.getName();
		System.out.println(threadName);

		PhoneThread ph=new PhoneThread();
		Thread t1=new Thread(ph);
		t1.start();
		
		Youtube you = new Youtube();	//상속받았으니까 바로 쓸 수 있음
		you.start();
		
		//스레드 이름 알기
		System.out.println("이름: "+t1.currentThread().getName());
		System.out.println("이름: "+you.currentThread().getName());
		
		t1.currentThread().setName("전화");
		System.out.println("이름: "+t1.currentThread().getName());
		you.currentThread().setName("유튜브");
		System.out.println("이름: "+you.currentThread().getName());
		
		System.out.println(t1.currentThread().getPriority());//우선순위는 1~10
		
		t1.currentThread().setPriority(1);
		System.out.println(t1.currentThread().getPriority());
		you.currentThread().setPriority(10);
		System.out.println(you.currentThread().getPriority());
		
		
	}

}
