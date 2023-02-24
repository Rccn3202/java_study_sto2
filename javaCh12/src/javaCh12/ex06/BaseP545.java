package javaCh12.ex06;

import java.util.regex.Pattern;

public class BaseP545 {

	public static void main(String[] args) {
		//정규표현식-형식언어
		
		String regExp1="\\d{6}\\-[1-4]\\d{6}";//주민등록번호 정규표현식
		
		if(Pattern.matches(regExp1, "123456-9345679")) {
			System.out.println("주민등록번호 맞음");
		}else {
			System.out.println("틀림");
		}
		
		String regExp2="=\\w+@\\w+\\.\\W+(\\.\\w+)?";//이메일 정규 표현식
		if(Pattern.matches(regExp2, "ekdie@hanmail.net")) {
			System.out.println("맞음");
		}else System.out.println("틀림");
		
		

	}

}
