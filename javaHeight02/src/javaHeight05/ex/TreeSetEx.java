package javaHeight05.ex;

import java.util.TreeSet;



public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student2("blue",96));
		treeSet.add(new Student2("hong",86));
		treeSet.add(new Student2("white",92));
		
		Student2 student = treeSet.last();
		System.out.println("�ְ� ����: "+student.score);
		System.out.println("�ְ� ������ ���� ���̵�: "+student.id);

	}

}
