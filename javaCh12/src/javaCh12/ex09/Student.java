package javaCh12.ex09;

public class Student {

	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	//���ü�� �Ǵ��� �� �ִ� �޼ҵ� ������
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student t=(Studemt) obj;	//�ٿ�ĳ���� �ʿ�
			return studentNum.equals(t.studentNum);

		} return false;
			}
	

}
