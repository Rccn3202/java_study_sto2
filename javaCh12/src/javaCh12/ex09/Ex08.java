package javaCh12.ex09;

public class Ex08 {

	public static void main(String[] args) {

		long startTime =System.nanoTime();
		int[] scores = new int[1000];
		for(int i=0; i<scores.length; i++) {
			scores[i]=i;
		}
		
		int sum=0;
		for(int score:scores) {
			sum += score;
		}
		
		double avg=sum/scores.length;
		System.out.println(avg);
		
		long endTime = System.nanoTime();
		System.out.println("계산할 때 걸린 시간: "+(endTime-startTime));

	}

}
