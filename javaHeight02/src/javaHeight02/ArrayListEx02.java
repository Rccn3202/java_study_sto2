package javaHeight02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {

	public static void main(String[] args) {
		
		List list2 =new ArrayList<Integer>();
		
		//1~10 �ֱ�
		for(int i=1;i<=10;i++) {
		list2.add(i);
		}
		
		//4�� �ε����� ���� 50���� �ٲ۴�
		list2.set(4, 50);
		
		//��ü�� ����ϱ�
		for(int i=0;i<=9;i++) {
			System.out.print(list2.get(i)+" ");
			}
		

	}

}
