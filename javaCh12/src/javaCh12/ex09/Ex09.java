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
		//바이트 배열을 스트링 객체 만들거
		//방법1. 바이트 객체에서 찾아보기->byte.메소드(byte[]):String 있는지 찾기  방법2.String 객체 찾아보기
		//방법3. 객체생성 new String()
		

	}

}
