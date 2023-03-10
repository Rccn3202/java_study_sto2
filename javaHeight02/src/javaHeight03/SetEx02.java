package javaHeight03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		//
		//set 데이터 넣기
		Set<String> set2=new HashSet();
		set2.add("사과");
		set2.add("배");
		set2.add("바나나");
		set2.add("귤");
		set2.add("배"); //중목된 것은 안받음.사이즈 4, 배도 한번만 나옴
		set2.add("배");
		
		//전체출력
		Iterator<String> it2=set2.iterator();		//순서가 없으므로 이터레이터로 출력해야함, 순서 때마다 다르게 나옴
		while(it2.hasNext()) {			
			String fruit=it2.next();
			System.out.println(fruit);
		}
		
		//크기
		System.out.println("크기 "+set2.size());
		
		//참외 있는지 검색
		if(set2.contains("참외")) System.out.println("참외 있음");
		else System.out.println("참외 없음");

	}

}
