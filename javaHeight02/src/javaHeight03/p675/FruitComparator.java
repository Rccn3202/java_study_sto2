package javaHeight03.p675;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	
	//o1 Ʈ���� �ް���� �ּ�, o2 Ʈ���� �޷��ִ� �ڷ��� �ּ�
	@Override
	public int compare(Fruit o1, Fruit o2) {
		//�̸����� �ޱ�
		System.out.println(o1.getName());
		System.out.println(o2.getName());
		System.out.println(o1.getName().compareTo(o2.getName())+"�� �� ���� ��");
		return o1.getName().compareTo(o2.getName());
		
		/*�������� �ޱ�
		System.out.println(o1.getPrice());
		System.out.println(o2.getPrice());
		System.out.println(o1.getPrice().compareTo(o2.getPrice()));
		System.out.println();
		
		return o1.getPrice().compareTo(o2.getPrice());
		*/
	}

}
