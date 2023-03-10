package javaHeight03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx652 {
	public static void main(String[] args) {
		
	Set<Shop> shopSet=new HashSet<Shop>();
	shopSet.add(new Shop("이기쁨","1234",100));
	shopSet.add(new Shop("김행복","2345",90));
	shopSet.add(new Shop("박수진","1456",300));
	shopSet.add(new Shop("정기쁨","1234",100));
	shopSet.add(new Shop("최기쁨","1234",100));
	shopSet.add(new Shop("이기쁨","1234",300));
	shopSet.add(new Shop("이기쁨","1234",200));
	
	//전체출력
	Iterator<Shop> it2 = shopSet.iterator();
	while(it2.hasNext()) {
		Shop shopadd=it2.next();
		System.out.println(shopadd.getCustname()+" "+shopadd.getCustPhone()+" "+shopadd.getPoint());
	}
	
	//이름,전화번호 동등객체
	
	//이름과 전화번호 입력하면 포인트 나오게
	String searchName="김행복";
	String searchPhone="2345";
	
	it2=shopSet.iterator();
	boolean searchOk=false;
	while(it2.hasNext()) {
		Shop shopadd=it2.next();
		if(shopadd.getCustname().equals(searchName) && shopadd.getCustPhone().equals(searchPhone)) {
			System.out.println(shopadd.getCustPhone());
			searchOk=true;
		}
	}
	if(!searchOk) System.out.println(searchName+", "+searchPhone+" 없음");
	
	
	
	
	System.out.println("----------------------------");
	Set<Member> memberSet = new HashSet<Member>();

	
		Set<Animal> animalSet = new HashSet<Animal>();
		animalSet.add(new Animal("강아지",15));
		animalSet.add(new Animal("고양이",10));
		animalSet.add(new Animal("토끼",5));
		animalSet.add(new Animal("닭",3));
		animalSet.add(new Animal("강아지",15));	//번지수 다르므로 저장된다
		
		System.out.println("set 크기"+animalSet.size());
		Iterator<Animal> it = animalSet.iterator();
		while(it.hasNext()) {
			Animal animalAddr=it.next();
			System.out.println(animalAddr.getKind()+ " "+animalAddr.getLifespan());
		}
		
	}

}
