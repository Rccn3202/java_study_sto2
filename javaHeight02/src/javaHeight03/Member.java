package javaHeight03;

public class Member {
private String name;
private int age;

public Member(String name, int age) {
	
	this.name = name;
	this.age = age;
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

//이름이 같고 나이가 같으면 같은사람(동등객체)이라는 것을 프로그램으로 작성하기
//1단계 hashcode()
//2단계 equals()
//hashcode() 수행과 equals() 수행은 별도로 메소드 호출하지 않아도 set 객체가 알아서 동등객체 하려고 자동 호출됨

@Override
public int hashCode() {
	// 개발자가 해쉬코드를 재정의함
	return name.hashCode()+age;	//나온 해쉬코드숫자에 나이를 더한다.
}

@Override
public boolean equals(Object obj) { 	//obj 변수에는 2번째로 set 안에 들어갈 자료의 주소가 들어있다.
	if(obj instanceof Member) {
		Member target = (Member)obj;	//다운캐스팅
		return target.name.equals(this.name) && target.age==this.age;
			//target.name은 들어갈 자료의 이름, this.name은 들어있는 자료의 주소
	}
	return false;
}





}
