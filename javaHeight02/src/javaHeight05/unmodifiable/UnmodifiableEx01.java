package javaHeight05.unmodifiable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UnmodifiableEx01 {

	public static void main(String[] args) {
		List<String> immutableList1 = List.of("a","b","c","a");
		
		//immutableList1.add("d");   �߰��� �� ����
		//immutableList1.remove("b"); ������ �� ����
		
		System.out.println(immutableList1.size());
		for(String i:immutableList1) {
			System.out.println(i);
		}
		
		
		Set<String> is=Set.of("1","2","3");
		System.out.println(is.size());	//��� �ߺ��Ǹ� ����
		if(is.contains("2")) {
			System.out.println("2 ����");
		}
		
		//list�� ���� ��� ���� �� ������ set�� �ߺ� �ȵ�
		
		Map<Integer,String> mof=Map.of(1,"a",2,"b",3,"c");
		//Ű�� ���ϱ�
		Set<Integer> keys=mof.keySet();
		Iterator<Integer> k=keys.iterator();
		while(k.hasNext()) {
			Integer k1=k.next();
			System.out.println(k1+"-"+mof.get(k1));
		}
		
		// mof.put(4."d");  Map.of�� ������ �߰� ���� �ȵȴ�.
		
		
		Map<String, Integer> studentMap =new HashMap<String, Integer>();
		//map�� �������̽��Ƿ� new map �ȵ�
		
		studentMap.put("�̼���", 100);
		studentMap.put("�̼���2", 50);
		studentMap.put("�̼���3", 70);
		studentMap.put("�̼���4", 80);
		
		studentMap.remove("�̼���");
		//���� �� - ����ȵǴ� ������ �����
		Map<String,Integer> imMap2 = Map.copyOf(studentMap);	//studentMap ������
		
		// imMap2.remove("�̼���"); ���� �� ����
		
		//entrySet���� ��ü ����ϱ�
		//Ű�� ���� �� �� ���
		 for (Entry<String, Integer> entrySet : imMap2.entrySet()) {
	            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
	        }
		//set�� ������ �������� �ʴ´�.
		
	}

}
