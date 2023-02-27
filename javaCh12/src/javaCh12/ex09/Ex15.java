package javaCh12.ex09;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.regex.Pattern;

public class Ex15 {

	public static void main(String[] args) {
		// ���ó�¥ ���ϰ� 2023 12 31 ���� �ļ� ��¥���� ����� until �޼ҵ� ��¥ �ΰ� ����, ����

		LocalDateTime todaydate=LocalDateTime.now();
		System.out.println(todaydate);
		
		LocalDateTime endDateTime=LocalDateTime.of(2023, 12,31,0,0);
		System.out.println(endDateTime);
		
		long remainDay = todaydate.until(endDateTime, ChronoUnit.DAYS);
		System.out.println("���� ��: "+remainDay);
		
		
		//Ex.16
		Date now = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(now));
		
		//Ex17
		String id="5Angel1004";
		String regExp="[a-zA-Z][a-zA-Z0-9]{7,11} "; //����ǥ����
		boolean isMatch=Pattern.matches(regExp, id);//����ǥ���İ� id�� ��ġ�ϴ��� üũ
		if(isMatch) {
			System.out.println("Id�� ��� ����");
		} else {
			System.out.println("id ��� �Ұ���");
		}
	}

}
