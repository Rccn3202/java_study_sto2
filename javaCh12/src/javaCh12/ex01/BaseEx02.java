package javaCh12.ex01;

public class BaseEx02 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long startMiTime=System.currentTimeMillis();
		//1/1000초
		System.out.println(startTime+" "+startMiTime);
		
		int sum=0;
		for(long i=1;i<10000000L;i++) {
			sum+=i;
		}
		long endTime=System.nanoTime();
		long endMiTime=System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("1~100000000까지의 함을 구하는데 걸린 시간은?"+(endTime-startTime));
		System.out.println("1~100000000까지의 함을 구하는데 걸린 시간은?"+(endMiTime-startMiTime));
	}

}
