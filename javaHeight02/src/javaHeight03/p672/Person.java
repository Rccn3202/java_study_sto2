package javaHeight03.p672;



public class Person implements Comparable<Person> {
	public String name;
	public int age;
	private Double score;//여시것 더블은 클래스 더블임
	
	public Person(String name, int age, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

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

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override

	public int compareTo(Person o) {
		//나이순
//		if(age<o.age) return -1;
//		else if(age==o.age) return 0;
//		else return 1;
		
		//이름순
	//	return name.compareTo(o.name);	//지금 들어온 name이랑 o.name 비교String 클래스에 있는 메소드를 호출함. 그래서 알아서 0,-1,1을 구해줌
		
		//이름 역순으로 하기
		// o.name.compareTo(name);]
		
		//나이 역순으로 출력하기
//		if(o.age<age) return -1;
//		else if(age==o.age) return 0;
//		else return 1;
		
		//점수 순서대로 정렬
		//return score.compareTo(o.score);
		//점수 역순으로 정렬하기
		return o.score.compareTo(score); 
	}
}
//만약 퍼슨 클래스를 고칠 수 없는 경우 퍼슨 클래스를 비교하는 클래스를 만들어 사용한다. comparatable