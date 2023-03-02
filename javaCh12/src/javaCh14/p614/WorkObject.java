package javaCh14.p614;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadA methodA() 작업 실행");
		notify(); //실행하기
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB methodB() 작업 실행");
		notify(); //실행하기
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
