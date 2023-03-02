package javaCh14.p600;

public class SleepEx02 {

	public static void main(String[] args) {
		
		//스레드B
		Thread t2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for(int i=2;i<20;i++) {
							for(int j=1; j<=20;j++) {
								System.out.println(i+"X"+j+"="+i*j+"\t");
							}
							System.out.println();
						}
						
					}
				});
				
		
		
		//스레드A
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<20; i++) {
					System.out.println("-");
					
					
					}try {
						t2.start();
						t2.join();
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					}
								
			}
		} );


		
		t1.start();
		
		
	}

}
