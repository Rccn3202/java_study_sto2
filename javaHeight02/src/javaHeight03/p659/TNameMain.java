package javaHeight03.p659;

import java.util.HashMap;
import java.util.Map;

public class TNameMain {

	public static void main(String[] args) {
		
		Map<String,Tvalue> tMap1=new HashMap<String,Tvalue>();
		
		TClass t1=new TClass("김", new Tvalue("3-1", 30));
		TClass t2=new TClass("이", new Tvalue("3-2", 20));
		TClass t3=new TClass("박", new Tvalue("3-3", 40));
		
		tMap1.put(t1.getName(),t1.getVa1());
		tMap1.put(t2.getName(),t2.getVa1());
		tMap1.put(t3.getName(),t3.getVa1());
		
		Tvalue valueArr = tMap1.get(t1.getName());
		System.out.println("선생님 이름: "+t1.getName());
		System.out.println("반"+valueArr.getGclass());
		System.out.println("학생수"+valueArr.getNum());
		

	}

}
