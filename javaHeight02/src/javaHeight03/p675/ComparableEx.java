package javaHeight03.p675;

import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		TreeSet<Fruit> fruit=new TreeSet<Fruit>(new FruitComparator());
		
		fruit.add(new Fruit("포도",3000));
		fruit.add(new Fruit("수박",10000));
		fruit.add(new Fruit("딸기",6000));
		fruit.add(new Fruit("배",3000));
		fruit.add(new Fruit("샤인",8000));

		System.out.println("트리에 달려있는 노드 갯수"+fruit.size());
	}

}
