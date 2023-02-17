package javaHeight03.p675;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Map.Entry;
import java.util.TreeMap;

import javaHeight03.p659.TClass;
import javaHeight03.p659.Tvalue;
import javaHeight03.p672.Person;



public class SaleDMain {

	public static void main(String[] args) {
		// 부서명이 키, 매장위치,판매실적 소속이 벨류
		TreeMap<String,DepartValue> tMap=new TreeMap<String,DepartValue>();
		
		Dname d1=new Dname("강북", new DepartValue("서울","백화점",4460));
		Dname d2=new Dname("강서", new DepartValue("서울","쇼핑몰",4460));
		Dname d3=new Dname("강동", new DepartValue("서울","백화점",4460));
		Dname d4=new Dname("강남", new DepartValue("서울","쇼핑몰",4460));
		
		
		tMap.put(d1.getDe(),d1.getDv());
		tMap.put(d2.getDe(),d2.getDv());
		tMap.put(d3.getDe(),d3.getDv());
		tMap.put(d4.getDe(),d4.getDv());
		
		for (Entry<String, DepartValue> entry : tMap.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		System.out.println("역순 출력");
		NavigableSet<String> ns=tMap.descendingKeySet();
		for(String key : ns) {
			System.out.println(key+"-"+tMap.get(key));
		}
		
		
	}

}
