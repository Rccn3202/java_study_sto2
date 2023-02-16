package javaHeight03.p670;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableSet;

public class TreeMapEx02 {

	public static void main(String[] args) {
		TreeMap<String,String> tm= new TreeMap<>();
		
		tm.put("영업부","강정호");
		tm.put("홍보부","김강인");
		tm.put("기획부","김영자");

		System.out.println("출력");
		Set<Entry<String, String>> et = tm.entrySet();	//엔트리에 키와 벨류가 들어있는데 키는 스트링,벨류는 인티저
		for(Entry<String, String> e :et) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();
		
		System.out.println("역순 출력");
		NavigableSet<String> ns=tm.descendingKeySet();
		for(String key : ns) {
			System.out.println(key+"-"+tm.get(key));
		}
	}

}
