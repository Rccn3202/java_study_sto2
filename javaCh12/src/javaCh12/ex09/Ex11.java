package javaCh12.ex09;

import java.util.StringTokenizer;

public class Ex11 {

	public static void main(String[] args) {
		String stdata="아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(stdata,",");
		while(st.hasMoreTokens()) {
			String t =st.nextToken();
			System.out.println(t);
		}
		//String 클래스의 split(",")
		String[] s=stdata.split(",");
		for(String s1:s) {
			System.out.println(s1);
		}

	}

}
