package javaCh12.ex06;

import java.util.regex.Pattern;

public class BaseP545 {

	public static void main(String[] args) {
		//����ǥ����-���ľ��
		
		String regExp1="\\d{6}\\-[1-4]\\d{6}";//�ֹε�Ϲ�ȣ ����ǥ����
		
		if(Pattern.matches(regExp1, "123456-9345679")) {
			System.out.println("�ֹε�Ϲ�ȣ ����");
		}else {
			System.out.println("Ʋ��");
		}
		
		String regExp2="=\\w+@\\w+\\.\\W+(\\.\\w+)?";//�̸��� ���� ǥ����
		if(Pattern.matches(regExp2, "ekdie@hanmail.net")) {
			System.out.println("����");
		}else System.out.println("Ʋ��");
		
		

	}

}
