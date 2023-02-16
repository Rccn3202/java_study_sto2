package javaHeight03;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("����");
		ts.add("���");
		ts.add("���");
		ts.add("�븮");
		ts.add("�븮");
		ts.add("���");
		ts.add("����");
		ts.add("����");
		
		System.out.print("�������� ���� > ");	
		for(String s : ts) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		System.out.print("�������� > ");
		Iterator<String> dit=ts.descendingIterator();
		while(dit.hasNext()) {
			System.out.print(dit.next()+" ");
		}
		System.out.println();
		System.out.print("���ް���: ");
		System.out.println(ts.size());
		System.out.print("���� �ٷ� �Ʒ���?: ");
		System.out.println(ts.lower("����"));
		System.out.print("�븮 �ٷ� ����?: ");
		System.out.println(ts.higher("�븮"));
	}

}
