package ch17.p723;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		// 컬렉션, 배열->오리지널스틤->중간브트림(생략가능)->최종스트림
		List<Student> list=new ArrayList<>();
		list.add(new Student("홍",10));
		list.add(new Student("김",20));
		list.add(new Student("박",30));
		
		List list1=Arrays.asList(new Student("홍",10),new Student("김",20)
		,new Student("박",30));
		
		//오리지널 스트림
		Stream<Student> stream=list.stream();
		IntStream is=stream.mapToInt(s->s.getScores());
		OptionalDouble od=is.average();
		double avg=od.getAsDouble();
		
		System.out.println(avg);
		
		
		//코드 줄이기
		double avg1 = list.stream()//Student 클래스의 객체참조변수들이 들어있음
				.mapToDouble(s->s.getScores())//10,20,30
				.average() //평균 수함
				.getAsDouble(); //기본형 더블타입으로 바꿔준다
		
		System.out.println(avg1);
		
		OptionalDouble avg2 = list.stream()
				.mapToDouble(s->s.getScores())
				.average(); 
				 
		System.out.println(avg2);
		
		
		
		
		double add = list.stream()
				.mapToDouble(s->s.getScores())
				.sum();		 
		System.out.println(add);
		
		Stream<Student> stream1= list1.stream();
		IntStream is1=stream1.mapToInt(s->s.getScores());
		OptionalInt oi1=is1.max();
		int max=oi1.getAsInt();
		System.out.println("최대값"+max);
		
	}

}
