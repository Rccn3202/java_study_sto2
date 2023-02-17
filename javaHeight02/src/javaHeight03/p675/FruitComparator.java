package javaHeight03.p675;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	
	//o1 트리에 달고싶은 주소, o2 트리에 달려있는 자료의 주소
	@Override
	public int compare(Fruit o1, Fruit o2) {
		//이름으로 달기
		System.out.println(o1.getName());
		System.out.println(o2.getName());
		System.out.println(o1.getName().compareTo(o2.getName())+"두 개 비교한 값");
		return o1.getName().compareTo(o2.getName());
		
		/*가격으로 달기
		System.out.println(o1.getPrice());
		System.out.println(o2.getPrice());
		System.out.println(o1.getPrice().compareTo(o2.getPrice()));
		System.out.println();
		
		return o1.getPrice().compareTo(o2.getPrice());
		*/
	}

}
