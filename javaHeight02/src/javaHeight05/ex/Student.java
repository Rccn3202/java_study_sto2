package javaHeight05.ex;

public class Student {

	public int studentNem;
	public String name;
	public Student(int studentNem, String name) {
		super();
		this.studentNem = studentNem;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
			return studentNem;
			
	}

	@Override
	public boolean equals(Object obj) {
			}
}
