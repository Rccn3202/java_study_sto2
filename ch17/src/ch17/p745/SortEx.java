package ch17.p745;

import java.util.Arrays;
import java.util.List;

public class SortEx {

	public static void main(String[] args) {
		List<Student> sList = Arrays.asList(new Student("홍",30),new Student("신",10),new Student("윤",20));
		sList.stream().sorted().forEach(s->System.out.println(s.getName()+" "+s.getScore()));
	
		System.out.println();
	List<Person> pList = Arrays.asList(
			new Person("김",true,10.9),
			new Person("이",true,20.9),
			new Person("박",false,30.9),
			new Person("최",true,40.9),
			new Person("정",false,50.9)
			);
	//급여순으로 정리(Person 클래스 건드릴 수 없음)
	pList.stream().sorted(new PersonComP()).forEach(p->System.out.println(p.getName()+" "+p.getPay()));
	
	System.out.println();
	
	//남자를 출력하는데 급여 역순으로 출력하기
	pList.stream().filter(s->s.isGentder())
	.sorted(new PersonComP())
	.forEach(p->System.out.println(p.getName()+" "+p.getPay()));
	
	//여자의 급여합계 출력
	pList.stream().filter(s->!s.isGentder())
	
	}
	

}
