package javaCh12.ex06;

import java.text.DecimalFormat;

public class BaseP542 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i=0.1234567889056754654054;
		System.out.println(i);
		
		double j=10;
		
		//�Ҽ��� 3�ڸ� ���̰� �ض�
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println(df.format(i));
		System.out.println(df.format(j));
		
		df = new DecimalFormat("#.000");
		
		System.out.println(df.format(i));
		System.out.println(df.format(j));
		
		//��ȭ��ȣ
		df=new DecimalFormat()
		
		
		
	}

}
