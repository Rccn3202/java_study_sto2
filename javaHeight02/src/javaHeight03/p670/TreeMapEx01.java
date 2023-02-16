package javaHeight03.p670;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {
		//TreeMap 컬렉션 생성
		TreeMap<String,Integer> treeMap= new TreeMap<>();
		
		//엔트리 저장
		treeMap.put("apple",10);	//단어명, 페이지수
		treeMap.put("forever",60);
		treeMap.put("description",40);
		treeMap.put("ever",50);
		treeMap.put("zoo",80);
		treeMap.put("base",20);
		treeMap.put("guess",70);
		treeMap.put("cherry",30);
		
		//정렬된 엔트리를 하나씩 가져오기
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();	//엔트리에 키와 벨류가 들어있는데 키는 스트링,벨류는 인티저
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();
		Iterator<Entry<String,Integer>> it=entrySet.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> i=it.next();
			System.out.println(i.getKey()+" "+i.getValue());
		}
		System.out.println();
		
		//특정 키에 대한 값 가져오기
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println("제일 앞 단어: "+entry.getKey()+"-"+entry.getValue());
		entry = treeMap.lastEntry();
		System.out.println("제일 뒤 단어: "+entry.getKey()+"-"+entry.getValue());
		entry = treeMap.lowerEntry("ever");
		System.out.println("ever 앞 단어: "+entry.getKey()+"-"+entry.getValue());

		//내림차순으로 정렬하기
		NavigableMap<String,Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String,Integer>> descendingEntrySet = descendingMap.entrySet();
		for(Entry<String,Integer> e : descendingEntrySet) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		System.out.println();
		
		//범위 검색
		System.out.println("[c~h 사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
		for(Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}	
	}
}
