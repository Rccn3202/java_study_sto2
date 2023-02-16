package javaHeight03;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		
		ts1.add(4);
		ts1.add(7);
		ts1.add(4);
		ts1.add(0);
		ts1.add(8);
		ts1.add(9);
		ts1.add(2);
		
		System.out.println("트리 노드의 갯수 : "+ts1.size());
		System.out.println("제일 낮은 객체 : "+ts1.first());
		System.out.println("제일 높은(큰) 객체 : "+ts1.last());
		System.out.println("7의 바로 아래: "+ts1.lower(7));
		System.out.println("7의 바로 아래: "+ts1.lower(0));
		System.out.println("7의 바로 위: "+ts1.higher(7));
		System.out.println("4와 동등한 객체/아니면 바로 아래: "+ts1.floor(5));
		
		System.out.println("내림차순 정렬" +ts1.descendingIterator());
		
		System.out.println("제일 낮은 객체 꺼내고 제거: "+ts1.pollFirst());
		System.out.println("제일 낮은 객체 : "+ts1.first());
		
		//모든 노드 다 출력
		System.out.println("전체출력1");
		Iterator<Integer>it =ts1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("전체출력2");
		for(Integer i:ts1) {
			System.out.println(i);
		}
		
		//내림차순 iterator
		System.out.println("내림차순");
		Iterator<Integer> dit=ts1.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		System.out.println("navi로 정렬됨");
		NavigableSet<Integer> ns=ts1.descendingSet();
		for(Integer n : ns) {
			System.out.println(n);
		}
		System.out.println("8보다 적은 노드 전부 출력");
		SortedSet<Integer> ss=ts1.headSet(8,false);
		for(Integer s : ss) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("4보다 큰 노드 전부 출력");
		SortedSet<Integer> ss2=ts1.tailSet(4,false);
		for(Integer s : ss2) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("4보다 크고 7보다 작은 노드 전부 출력");
		SortedSet<Integer> ss3=ts1.subSet(4,true,7,true);
		for(Integer s : ss3) {
			System.out.print(s+" ");
		}
		

	}

}
