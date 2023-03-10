package ch17.p736;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;



public class FilterEx {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("È«");
		list.add("±è");
		list.add("¹Ú");
		list.add("¹Ú");
		list.add("Á¤");
		list.add("È«È«");
		list.add("±è±è");
		
		list.stream().distinct().forEach(n->System.out.println(n));
		
		System.out.println();
		
		list.stream().filter(n->n.startsWith("±è")).forEach(n->System.out.println(n));
		
		System.out.println();
		
		list.stream().distinct().filter(n->n.startsWith("È«")).forEach(n->System.out.println(n));
		
		System.out.println();
		
		IntStream.rangeClosed(1, 100).filter(nu->nu%2==0).forEach(nu->System.out.print(nu+" "));
		
		System.out.println();
		
		List<Student> stu = Arrays.asList(
				new Student("½Å±æµ¿1",10),
				new Student("±è±æµ¿2",15),
				new Student("±è±æµ¿3",20),
				new Student("¹Ú±æµ¿4",25),
				new Student("½Å±æµ¿1",30));
		stu.stream().filter(s->s.getAge()<20).forEach(s->System.out.println(s.getName()+" "));
		
		System.out.println();
		stu.stream().filter(ss->ss.getName().startsWith("±è")&&ss.getAge()==20).forEach(ss->System.out.println(ss.getName()+" "+ss.getAge()));
	}

}

class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	
	
}
