package javaHeight02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("ȫ�浿");
		list1.add("�̼���");
		list1.add("������");
		list1.add(1, "�ֿ�"); //1���ε����� �ֿ��� �ִ´�-�̼����� �ڷ� �и�
		
		for(int i=0;i<list1.size();i++) {
		System.out.println(list1.get(i));
		}
		
		//�츮�ݿ� ȫ�浿 ����?
		System.out.println(list1.contains("ȫ�浿"));
		
		//���а� �ֿ� ����
		list1.remove("�ֿ�");
		System.out.println("------�ֿ�-------");
		System.out.println(list1.contains("�ֿ�"));
		
		list1.remove("������");

		System.out.println("------������-------");
		System.out.println(list1.contains("������"));
		
		list1.clear();
		System.out.println("-------Ŭ����empty------");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
			}
		System.out.println(list1.isEmpty());
	}

}
