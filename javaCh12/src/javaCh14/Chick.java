package javaCh14;

public class Chick extends Thread{
@Override
public void run() {
	for(int i=0;i<100;i++) {	
		System.out.println("치킨만들기");
		}
}
}
