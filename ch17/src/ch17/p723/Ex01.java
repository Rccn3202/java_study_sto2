package ch17.p723;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("홍");
		set.add("김");
		set.add("박");
		
		
	/*	Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
 */
		//스트림 얻기-데이터 넣으면 끝까지 모두 넣어준다, 마지막 단계까지 코드가 있어야 에러가 없다
		Stream<String> stream = set.stream();
		stream.forEach(name->System.out.println(name));//name은 람다에서 나오는 매개변수
	}
		
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
