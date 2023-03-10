package ch17.p745;

public class Student implements Comparable<Student>	 {
	private String name;
	private int score;
	
	public Student(String name,int score) {
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);// �̸� ������ �����ϱ�
		//return o.name.compareTo(name);//�̸� �������� ����
	//return Integer.compare(score, o.score);
	}

	
}