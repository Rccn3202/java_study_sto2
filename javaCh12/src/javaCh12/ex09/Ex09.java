package javaCh12.ex09;

import java.io.UnsupportedEncodingException;

public class Ex09 {

	public static void main(String[] args) {
		byte[] bytes= {-20,-107,-120,-21,-123,-107};
		String str;
		try {
			str = new String(bytes, "UTF-8");
			System.out.println("str :"+str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����Ʈ �迭�� ��Ʈ�� ��ü �����
		//���1. ����Ʈ ��ü���� ã�ƺ���->byte.�޼ҵ�(byte[]):String �ִ��� ã��  ���2.String ��ü ã�ƺ���
		//���3. ��ü���� new String()
		

	}

}
