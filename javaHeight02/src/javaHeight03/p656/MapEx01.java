package javaHeight03.p656;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map1=new HashMap<String,Integer>();
		map1.put("컴퓨터", 200);
		map1.put("프린터", 50);
		map1.put("아이폰", 210);
		map1.put("탭", 170);
		
		System.out.println(map1.get("컴퓨터")); //키값 넣음
		System.out.println(map1.get("아이폰"));
		
		//매장에 냉장고 있는지 검색
		if(map1.containsKey("냉장고")) System.out.println("있습니다");
		else System.out.println("없습니다");
	
		
		//금액이 150만원 이상인 품목 출력-모든 키를 집어 넣어 금액을 구현후 조건문으로 비교, 조건 만족하면 키값을 출력
		System.out.println("------150-------");
		Set<String> keys=map1.keySet();//모든 키 모아줌keySet
		//키를 구해서 출력
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//키를 넣어서 금액을 구한다
		System.out.println("--키를 넣어서 금액을 구한다--");
		it=keys.iterator();
		while(it.hasNext()) {
			Integer value=map1.get(it.next());
			System.out.println("값은? "+value);
		}
		//금액에 150만원 이상인지 판단
		System.out.println("--150이상 ---");
		it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			if(map1.get(it.next())>=150) {
				System.out.println(key+" " +map1.get(key));
			}
		}
		
		//금색이 170만원 품목이 있습니까
		System.out.println("---170----");
		if(map1.containsValue(170)) System.out.println("있습니다");
		else System.out.println("없습니다.");
		

	}

}
