package javaHeight05.ex;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"全"));
		set.add(new Student(2,"脚"));
		set.add(new Student(1,"炼"));
		
		System.out.println("历厘等 按眉 荐: "+set.size());
		for(Student s : set) {
			System.out.println(s.studentNem+","+s.name);
		}

	}

}
