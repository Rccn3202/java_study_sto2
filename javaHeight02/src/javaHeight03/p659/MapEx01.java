package javaHeight03.p659;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		// key-��ȭ��ȣ,value-������,�ּ�  /��ȭ��ȣ�� ġ�� �����Ϳ� �ּҰ� ���� �� �ְ�
		//value�� �ϳ��ۿ� �����ϱ� ������ dataŬ������ ���� �� �� �� ���� �� �ֵ��� ��
		
		Map<String,Data1> shopMap1=new HashMap<String,Data1>();
		Shop shop1=new Shop("1111", new Data1(100, "�̻絿1"));
		Shop shop2=new Shop("2222", new Data1(120, "�̻絿2"));
		Shop shop3=new Shop("3333", new Data1(140, "�̻絿3"));
		Shop shop4=new Shop("4444", new Data1(170, "�̻絿4"));
		Shop shop5=new Shop("5555", new Data1(103, "�̻絿5"));
		
		shopMap1.put(shop1.getPhone(), shop1.getData1());	//shop1.getPhone�� Ű�� ���
		shopMap1.put(shop2.getPhone(), shop2.getData1());	//shop1.getData1 �� ���´�
		shopMap1.put(shop3.getPhone(), shop3.getData1());
		shopMap1.put(shop4.getPhone(), shop4.getData1());
		shopMap1.put(shop5.getPhone(), shop5.getData1());
		
		Data1 shop1Arr=shopMap1.get(shop1.getPhone());
		System.out.println("������ȭ��ȣ "+shop1.getPhone());
		System.out.println("���� ����Ʈ "+shop1Arr.getPoint());
		System.out.println("���� �ּ� "+shop1Arr.getAddress());
		
	}

}