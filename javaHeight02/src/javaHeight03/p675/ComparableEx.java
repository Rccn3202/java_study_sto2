package javaHeight03.p675;

import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		TreeSet<Fruit> fruit=new TreeSet<Fruit>(new FruitComparator());
		
		fruit.add(new Fruit("����",3000));
		fruit.add(new Fruit("����",10000));
		fruit.add(new Fruit("����",6000));
		fruit.add(new Fruit("��",3000));
		fruit.add(new Fruit("����",8000));

		System.out.println("Ʈ���� �޷��ִ� ��� ����"+fruit.size());
	}

}