package javaCh12.ex09;

import java.util.HashSet;

public class StudentEx {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));

		System.out.println("����� Student �� : "+hashSet.size());
	}

}
