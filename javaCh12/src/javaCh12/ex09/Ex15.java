package javaCh12.ex09;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.regex.Pattern;

public class Ex15 {

	public static void main(String[] args) {
		// 오늘날짜 구하고 2023 12 31 숫자 쳐서 날짜형식 만들기 until 메소드 날짜 두개 쓰기, 빼기

		LocalDateTime todaydate=LocalDateTime.now();
		System.out.println(todaydate);
		
		LocalDateTime endDateTime=LocalDateTime.of(2023, 12,31,0,0);
		System.out.println(endDateTime);
		
		long remainDay = todaydate.until(endDateTime, ChronoUnit.DAYS);
		System.out.println("남은 일: "+remainDay);
		
		
		//Ex.16
		Date now = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
		
		//Ex17
		String id="5Angel1004";
		String regExp="[a-zA-Z][a-zA-Z0-9]{7,11} "; //정규표현식
		boolean isMatch=Pattern.matches(regExp, id);//정규표현식과 id가 일치하는지 체크
		if(isMatch) {
			System.out.println("Id를 사용 가능");
		} else {
			System.out.println("id 사용 불가능");
		}
	}

}
