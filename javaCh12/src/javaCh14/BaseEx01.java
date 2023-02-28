package javaCh14;

public class BaseEx01 {

	public static void main(String[] args) {
		
		Task task1 = new Task();
		Thread thread1=new Thread(task1);
		thread1.start();// 청바지
		
		for(int i = 0; i<500 ; i++) {
			System.out.println("모자 만들어");
		}
		Task2 task2=new Task2();
		task2.start();// 티셔츠
	}

}
