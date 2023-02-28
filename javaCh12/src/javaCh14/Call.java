package javaCh14;

public class Call  implements Runnable  {

	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			System.out.println("피자 만들기");
		}
		
	}

}
