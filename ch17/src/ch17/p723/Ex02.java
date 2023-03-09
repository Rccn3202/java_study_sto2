package ch17.p723;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Ex02 {

	public static void main(String[] args) {
		List<Integer> hakbun=new ArrayList<>();
		hakbun.add(1);
		hakbun.add(2);
		hakbun.add(3);
		hakbun.add(4);
		hakbun.add(5);
		hakbun.add(4);
		
		//싱글스트림
		Stream<Integer> stream = hakbun.stream();
		stream.forEach(h->System.out.println(h));
		
		//한번 더 출력하려면 Stream을 또 만들어야한다
		Stream<Integer> stream2 = hakbun.stream();
		stream2.forEach(h->System.out.println(h));
		
		//parallelStream은 스레드 방식으로 처리하므로 순서가 바르지 않을 수 있다
		Stream<Integer> pStream=hakbun.parallelStream();
		pStream.forEach(p->System.out.print("p"+p+Thread.currentThread().getName()));
	}

}
