package javaHeight03.p670;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableSet;

public class TreeMapEx02 {

	public static void main(String[] args) {
		TreeMap<String,String> tm= new TreeMap<>();
		
		tm.put("������","����ȣ");
		tm.put("ȫ����","�谭��");
		tm.put("��ȹ��","�迵��");

		System.out.println("���");
		Set<Entry<String, String>> et = tm.entrySet();	//��Ʈ���� Ű�� ������ ����ִµ� Ű�� ��Ʈ��,������ ��Ƽ��
		for(Entry<String, String> e :et) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();
		
		System.out.println("���� ���");
		NavigableSet<String> ns=tm.descendingKeySet();
		for(String key : ns) {
			System.out.println(key+"-"+tm.get(key));
		}
	}

}
