package javaCh12.ex09;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	//동등객체를 판단할 수 있는 메소드 재정의
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student t=(Studemt) obj;	//다운캐스팅 필요
			return studentNum.equals(t.studentNum);

		} return false;
			}
	

}
