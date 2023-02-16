package javaHeight03;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("과장");
		ts.add("사원");
		ts.add("사원");
		ts.add("대리");
		ts.add("대리");
		ts.add("사원");
		ts.add("과장");
		ts.add("부장");
		
		System.out.print("오름차순 정렬 > ");	
		for(String s : ts) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		System.out.print("내림차순 > ");
		Iterator<String> dit=ts.descendingIterator();
		while(dit.hasNext()) {
			System.out.print(dit.next()+" ");
		}
		System.out.println();
		System.out.print("직급갯수: ");
		System.out.println(ts.size());
		System.out.print("부장 바로 아래는?: ");
		System.out.println(ts.lower("부장"));
		System.out.print("대리 바로 위는?: ");
		System.out.println(ts.higher("대리"));
	}

}
