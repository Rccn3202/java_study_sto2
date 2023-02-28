package javaCh14;

public class BaseEx03 {

	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<100;i++) {
					System.out.println("Call");
				}
				
			}
			
		};
			
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(new Runnable()) {
			@Override
			public void run() {
				for(int i=0; i<100;i++) {
					System.out.println("Youtube");
				}
				
			}
		} );
		
		t2.start();

	}

}
