package javaCh12.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BaseP537 {

	public static void main(String[] args) {
		// 대출일 - 오늘 날짜 반납일 2주후
		
		LocalDateTime now = LocalDateTime.now();
		//System.out.println(now);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("대출일"+now.format(dtf));
		
		
		LocalDateTime returnDate =  now.plusWeeks(2);
		System.out.println("반납일"+returnDate.format(dtf));
		
		//급여일 오늘부터 20일 후에
		//알람 5시간 후
		//미래 자산상태 12년 후 100억 부자
		System.out.println();
				
		LocalDateTime sal = now.plusDays(20);
		System.out.println("급여일"+sal.format(dtf));
		
		LocalDateTime sal2 = now.plusHours(5);
		System.out.println("알람"+sal2.format(dtf));
				
		LocalDateTime sal3 = now.plusYears(12);
		System.out.println("자산 100억 "+sal3.format(dtf));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime start = LocalDateTime.of(2023, 2,23,9,37,20);
		System.out.println("시작일:"+start.format(dtf2));
		
		LocalDateTime edit = LocalDateTime.of(2023, 12,31,23,59,59);
		System.out.println("종료일:"+edit.format(dtf2));
		
		System.out.println();
		//세일기간 3.1 00 00 4-31 23;59;59
		//날짜1 3 15 세일기간 2.20 3 5.3
		
		
		
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime edt = LocalDateTime.of(2023, 4,30,59,59);
		System.out.println("시작일:"+edt.format(dtf));
		LocalDateTime sdt = LocalDateTime.of(2023, 3,1,00,00);
		System.out.println("세일기간:"+sdt.format(dtf2));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 ");
		int year = sc.nextInt();
		System.out.println();
		
		System.out.print("월 ");
		int month = sc.nextInt();
		System.out.println();
		
		System.out.print("일 ");
		int day = sc.nextInt();
		System.out.println();
		
		LocalDateTime cudate = LocalDateTime.of(year, month,day,0,0);
		if(cudate.isBefore(edt) && cudate.isAfter(sdt)) {
			System.out.println("세일기간");
			
		}else if(cudate.isBefore(sdt)) {
			System.out.println("세일기간 전입니다");
		} else if(cudate.isAfter(sdt)) {
			System.out.println("세일끝남");
		}
		
		
		
		
		
	}

}
