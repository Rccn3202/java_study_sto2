package javaHeight03.p659;

import java.util.HashMap;
import java.util.Map;

public class TNameMain {

	public static void main(String[] args) {
		
		Map<String,Tvalue> tMap1=new HashMap<String,Tvalue>();
		
		TClass t1=new TClass("��", new Tvalue("3-1", 30));
		TClass t2=new TClass("��", new Tvalue("3-2", 20));
		TClass t3=new TClass("��", new Tvalue("3-3", 40));
		
		tMap1.put(t1.getName(),t1.getVa1());
		tMap1.put(t2.getName(),t2.getVa1());
		tMap1.put(t3.getName(),t3.getVa1());
		
		Tvalue valueArr = tMap1.get(t1.getName());
		System.out.println("������ �̸�: "+t1.getName());
		System.out.println("��"+valueArr.getGclass());
		System.out.println("�л���"+valueArr.getNum());
		

	}

}
