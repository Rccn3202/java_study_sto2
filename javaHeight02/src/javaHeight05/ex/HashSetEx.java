package javaHeight05.ex;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"ȫ"));
		set.add(new Student(2,"��"));
		set.add(new Student(1,"��"));
		
		System.out.println("����� ��ü ��: "+set.size());
		for(Student s : set) {
			System.out.println(s.studentNem+","+s.name);
		}

	}

}
