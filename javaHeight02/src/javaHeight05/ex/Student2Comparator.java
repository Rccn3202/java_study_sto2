package javaHeight05.ex;

import java.util.Comparator;

public class Student2Comparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		return o1.getScore() - o2.getScore();
	}
}
