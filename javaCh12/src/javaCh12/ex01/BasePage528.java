package javaCh12.ex01;

import java.util.Random;

public class BasePage528 {

	public static void main(String[] args) {
		//수학
		double v1 = Math.ceil(5.3);
		
		Math.max(1.2, 2.2);//final이므로 오버라이드 할 수 없다.
		
		//난수 얻기
		//util에 랜덤클래스
		Random r=new Random();//랜덤클래스 인스턴스화
		System.out.println(r.nextInt(100));//소프트웨어 제품번호 인증, 비밀번호 암호와/복호화

	}

}
