package ch1.p741;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MapEx {

	public static void main(String[] args) {
		int[] intArray= {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(d->System.out.println(d));
		
		//long 배열 만들고
		long[] longArr = {1L,2L,3L,4L};
		LongStream longStream = Arrays.stream(longArr);
		longStream.asDoubleStream().map(d->d*3.14).forEach(d->System.out.println(d));
		
		double[] doubleArr= {1.1,2.2,3.3};
		DoubleStream doubleStream=Arrays.stream(doubleArr);
		doubleStream.boxed().forEach(s->System.out.println(s.SIZE));
		

	}

}
