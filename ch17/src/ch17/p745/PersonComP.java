package ch17.p745;

import java.util.Comparator;

public class PersonComP implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		//급여순을 정렬의 기준으로
		//return Double.compare(o1.getPay(), o2.getPay()); 
		
		//급여순 역순
		return Double.compare(o2.getPay(), o1.getPay());
		
		//합계

	}

}
