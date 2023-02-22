package javaCh12.ex01;

public class Member {

	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m=(Member) obj;
			if(id.equals(m.id)) return true;	//id는 들어있는 id/ m.id는 비교할 아이디
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode();
	}
	
	@Override
	public String toString() {		//참조변수로 찍을 때
		return "멤버클래스의 참조변수를 출력할 때 자동으로 붙는 메소드들"+id;
	}
	
	
}
