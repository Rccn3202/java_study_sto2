package javaHeight02.p644;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 매출현황메인클래스 {

	public static void main(String[] args) {
		 List<매출현황클래스> list1 =new ArrayList<매출현황클래스>();

		 list1.add(new 매출현황클래스("4월3일", "BC103", "강남구", 230, 276000, "3470-1234"));
		 list1.add(new 매출현황클래스("4월5일", "BL203", "서초구", 150, 180000, "3470-2200"));
		 list1.add(new 매출현황클래스("4월8일", "AC205", "송파구", 270, 324000, "3470-3300"));
		 list1.add(new 매출현황클래스("4월12일", "DU103", "용산구", 350, 420000, "3470-4321"));
		 
		 for(int i=0;i<list1.size(); i++) {
			 System.out.println( list1.get(i));
		 }
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.print("거래처코드는? ");
		 String searchCode = sc.next();
		 boolean searchCodeOk=false;
		 
		 for(int i=0; i<list1.size(); i++) {
			 if( list1.get(i).get거래처코드().equals(searchCode)) {
				 System.out.println("매출 지역은 " + list1.get(i).get매출지역() );
				 System.out.println("연락처는 " + list1.get(i).get연락처() );
				 searchCodeOk = true;
			 }
		 }
		 if( !searchCodeOk ) System.out.println( searchCode + " 거래처 코드는 없는 코드입니다. "); 
		 
		 //4. 매출액이 제일 높은 거래처 코드를 출력
		 System.out.println( "=== 매출액이 제일 높은 거래처 코드 === ");
		 
		 int max = 0; //매출액이 제일 높은 금액을 넣을 변수
		 int maxIndex = 0; //매출액 제일 높은 거래처 인덱스를 넣을 변수 
		 for( int i=0; i< list1.size() ; i++) {
			 if( max < list1.get(i).get매출금액() ) {
				 max = list1.get(i).get매출금액();
				 maxIndex = i;
			 }
		 }
		 System.out.println( "매출액 제일 높은 거래처코드는 " + list1.get( maxIndex ).get거래처코드() );
		 System.out.println( "매출액 제일 높은 매출액은 " + list1.get( maxIndex ).get매출금액() );
		 
		 System.out.println( "=== 판매량이 제일 적은 매출일자, 거래처코드, 판매량 === ");
		 int min=999999999;
		 int minIndex=0;
		 for(int i=0; i<list1.size(); i++) {
			 if( min > list1.get(i).get판매량() ) {
				 min = list1.get(i).get판매량();
				 minIndex = i;
			 }
		 }
		 
		 System.out.println( "판매량이 제일 적은 매출일자 " + list1.get(minIndex).get매출일자() );
		 System.out.println( "판매량이 제일 적은 거래처코드 " + list1.get(minIndex).get거래처코드() );
		 System.out.println( "판매량이 제일 적은 판매량 " + list1.get(minIndex).get판매량() );
		 
	}

}
