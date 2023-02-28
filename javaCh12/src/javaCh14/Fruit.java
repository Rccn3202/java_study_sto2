package javaCh14;

public class Fruit extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {	
			System.out.println("과일만들기");
			}
	}
	

}
