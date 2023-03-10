package javaHeight03.p660;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx03 {

	public static void main(String[] args) {
		//Hashtable:스레드 적용
		Map<String,Data2> teacherMap=new Hashtable<String,Data2>();
		
		School sh1=new School("정",new Data2("3-1",30));
		School sh2=new School("김",new Data2("3-2",31));
		School sh3=new School("박",new Data2("3-3",32));
		
		teacherMap.put(sh1.getName(),sh1.getData1());
		teacherMap.put(sh2.getName(),sh2.getData1());
		teacherMap.put(sh3.getName(),sh3.getData1());
		
		//선생님 이름만 찍어주세요
		//풀이:선생님 이름은 키값이므로 키값을 추출
		Set<String> keys = teacherMap.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//학교 선생님 인원수?
		System.out.println(teacherMap.size());
		
		//선생님 별 학급 인원수 출력
		it=keys.iterator();
		while(it.hasNext()) {
			String arr=it.next();
			Data2 mapValue=teacherMap.get(arr);	//value인 data가 찍힘
			System.out.println("이름"+arr);
			System.out.println("반"+mapValue.getGclass());
			System.out.println("인원수"+mapValue.getNum());
		}
		

	}

}
