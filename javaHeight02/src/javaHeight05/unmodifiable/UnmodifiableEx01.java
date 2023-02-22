package javaHeight05.unmodifiable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UnmodifiableEx01 {

	public static void main(String[] args) {
		List<String> immutableList1 = List.of("a","b","c","a");
		
		//immutableList1.add("d");   추가할 수 없음
		//immutableList1.remove("b"); 삭제할 수 없음
		
		System.out.println(immutableList1.size());
		for(String i:immutableList1) {
			System.out.println(i);
		}
		
		
		Set<String> is=Set.of("1","2","3");
		System.out.println(is.size());	//요소 중복되면 오류
		if(is.contains("2")) {
			System.out.println("2 있음");
		}
		
		//list는 같은 요소 넣을 수 있으나 set은 중복 안됨
		
		Map<Integer,String> mof=Map.of(1,"a",2,"b",3,"c");
		//키만 구하기
		Set<Integer> keys=mof.keySet();
		Iterator<Integer> k=keys.iterator();
		while(k.hasNext()) {
			Integer k1=k.next();
			System.out.println(k1+"-"+mof.get(k1));
		}
		
		// mof.put(4."d");  Map.of로 넣으면 추가 수정 안된다.
		
		
		Map<String, Integer> studentMap =new HashMap<String, Integer>();
		//map은 인터페이스므로 new map 안됨
		
		studentMap.put("이순신", 100);
		studentMap.put("이순신2", 50);
		studentMap.put("이순신3", 70);
		studentMap.put("이순신4", 80);
		
		studentMap.remove("이순신");
		//고정 맵 - 변경안되는 맵으로 만들기
		Map<String,Integer> imMap2 = Map.copyOf(studentMap);	//studentMap 고정됨
		
		// imMap2.remove("이순신"); 지울 수 없다
		
		//entrySet으로 전체 출력하기
		//키와 벨류 둘 다 출력
		 for (Entry<String, Integer> entrySet : imMap2.entrySet()) {
	            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
	        }
		//set은 순서가 유지되지 않는다.
		
	}

}
