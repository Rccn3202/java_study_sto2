package ch17.p729;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		String[] strArray = {"홍길동", "신용권","김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item+","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream	= Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item+","));
		System.out.println();
		
	//
		double[] da= {1.1,2.2,3.3,4.4};
		Boolean[] ba= {true,false,true};
		long[] la = {1000L,2000L,-123400L};
		Float[] fa= {2.3f,3.5f,5.5f};
		
		
		
		//배열을 스트림 만들고 da 출력
		Arrays.stream(da).forEach(d->System.out.println(d+" "));
		Arrays.asList(da).stream().forEach(b->System.out.println(b+" "));
		
		System.out.println();
		
		//fa 합계를 구해서 출력
		Arrays.asList(fa).stream().forEach(f->System.out.println(f+" "));
		double c=Arrays.asList(fa).stream().mapToDouble(s->s).sum();
		System.out.println(c);
		
		//la는 평균 출력
		System.out.println(Arrays.stream(la).average().getAsDouble());
	}

}
