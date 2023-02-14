package javaHeight03.p656;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map1=new HashMap<String,Integer>();
		map1.put("��ǻ��", 200);
		map1.put("������", 50);
		map1.put("������", 210);
		map1.put("��", 170);
		
		System.out.println(map1.get("��ǻ��")); //Ű�� ����
		System.out.println(map1.get("������"));
		
		//���忡 ����� �ִ��� �˻�
		if(map1.containsKey("�����")) System.out.println("�ֽ��ϴ�");
		else System.out.println("�����ϴ�");
	
		
		//�ݾ��� 150���� �̻��� ǰ�� ���-��� Ű�� ���� �־� �ݾ��� ������ ���ǹ����� ��, ���� �����ϸ� Ű���� ���
		System.out.println("------150-------");
		Set<String> keys=map1.keySet();//��� Ű �����keySet
		//Ű�� ���ؼ� ���
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Ű�� �־ �ݾ��� ���Ѵ�
		System.out.println("--Ű�� �־ �ݾ��� ���Ѵ�--");
		it=keys.iterator();
		while(it.hasNext()) {
			Integer value=map1.get(it.next());
			System.out.println("����? "+value);
		}
		//�ݾ׿� 150���� �̻����� �Ǵ�
		System.out.println("--150�̻� ---");
		it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			if(map1.get(it.next())>=150) {
				System.out.println(key+" " +map1.get(key));
			}
		}
		
		//�ݻ��� 170���� ǰ���� �ֽ��ϱ�
		System.out.println("---170----");
		if(map1.containsValue(170)) System.out.println("�ֽ��ϴ�");
		else System.out.println("�����ϴ�.");
		

	}

}