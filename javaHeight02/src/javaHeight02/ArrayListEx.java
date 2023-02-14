package javaHeight02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("홍길동");
		list1.add("이순신");
		list1.add("김유신");
		list1.add(1, "최영"); //1번인덱스에 최영을 넣는다-이순신은 뒤로 밀림
		
		for(int i=0;i<list1.size();i++) {
		System.out.println(list1.get(i));
		}
		
		//우리반에 홍길동 있음?
		System.out.println(list1.contains("홍길동"));
		
		//전학간 최영 삭제
		list1.remove("최영");
		System.out.println("------최영-------");
		System.out.println(list1.contains("최영"));
		
		list1.remove("김유신");

		System.out.println("------김유신-------");
		System.out.println(list1.contains("김유신"));
		
		list1.clear();
		System.out.println("-------클래스empty------");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
			}
		System.out.println(list1.isEmpty());
	}

}
