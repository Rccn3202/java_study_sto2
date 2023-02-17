package javaHeight03.p676;

import java.util.Comparator;

public class 부서명소속comparator implements Comparator<부서명소속>{
	
	@Override
	public int compare(부서명소속 o1, 부서명소속 o2) {
		
		return o1.get부서명().compareTo(o2.get부서명());	//정렬의 기준을 어떻게 할지
	}

}
