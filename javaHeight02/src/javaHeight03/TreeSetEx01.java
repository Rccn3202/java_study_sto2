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
		
		System.out.println("Ʈ�� ����� ���� : "+ts1.size());
		System.out.println("���� ���� ��ü : "+ts1.first());
		System.out.println("���� ����(ū) ��ü : "+ts1.last());
		System.out.println("7�� �ٷ� �Ʒ�: "+ts1.lower(7));
		System.out.println("7�� �ٷ� �Ʒ�: "+ts1.lower(0));
		System.out.println("7�� �ٷ� ��: "+ts1.higher(7));
		System.out.println("4�� ������ ��ü/�ƴϸ� �ٷ� �Ʒ�: "+ts1.floor(5));
		
		System.out.println("�������� ����" +ts1.descendingIterator());
		
		System.out.println("���� ���� ��ü ������ ����: "+ts1.pollFirst());
		System.out.println("���� ���� ��ü : "+ts1.first());
		
		//��� ��� �� ���
		System.out.println("��ü���1");
		Iterator<Integer>it =ts1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("��ü���2");
		for(Integer i:ts1) {
			System.out.println(i);
		}
		
		//�������� iterator
		System.out.println("��������");
		Iterator<Integer> dit=ts1.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		System.out.println("navi�� ���ĵ�");
		NavigableSet<Integer> ns=ts1.descendingSet();
		for(Integer n : ns) {
			System.out.println(n);
		}
		System.out.println("8���� ���� ��� ���� ���");
		SortedSet<Integer> ss=ts1.headSet(8,false);
		for(Integer s : ss) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("4���� ū ��� ���� ���");
		SortedSet<Integer> ss2=ts1.tailSet(4,false);
		for(Integer s : ss2) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("4���� ũ�� 7���� ���� ��� ���� ���");
		SortedSet<Integer> ss3=ts1.subSet(4,true,7,true);
		for(Integer s : ss3) {
			System.out.print(s+" ");
		}
		

	}

}
