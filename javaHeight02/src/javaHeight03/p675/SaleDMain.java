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
		// �μ����� Ű, ������ġ,�ǸŽ��� �Ҽ��� ����
		TreeMap<String,DepartValue> tMap=new TreeMap<String,DepartValue>();
		
		Dname d1=new Dname("����", new DepartValue("����","��ȭ��",4460));
		Dname d2=new Dname("����", new DepartValue("����","���θ�",4460));
		Dname d3=new Dname("����", new DepartValue("����","��ȭ��",4460));
		Dname d4=new Dname("����", new DepartValue("����","���θ�",4460));
		
		
		tMap.put(d1.getDe(),d1.getDv());
		tMap.put(d2.getDe(),d2.getDv());
		tMap.put(d3.getDe(),d3.getDv());
		tMap.put(d4.getDe(),d4.getDv());
		
		for (Entry<String, DepartValue> entry : tMap.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		System.out.println("���� ���");
		NavigableSet<String> ns=tMap.descendingKeySet();
		for(String key : ns) {
			System.out.println(key+"-"+tMap.get(key));
		}
		
		
	}

}
