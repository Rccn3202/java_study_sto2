package javaHeight02.p644;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SalesExample {

   public static void main(String[] args) {
      // 
      List<Sales> list = new ArrayList<>();
      
      list.add(new Sales("4월3일", "BC103", "강남구", 230, 276000, "3470-1234"));
      list.add(new Sales("4월5일", "BL203", "서초구", 150, 680000, "3470-2200"));
      list.add(new Sales("4월8일", "AC103", "송파구", 270, 324000, "3470-3300"));
      list.add(new Sales("4월12일", "DU103", "용산구", 350, 420000, "3470-4321"));
      
      
      
      System.out.println("매출일자" +"\t" + "거래처코드" +"\t" + "매출지역" +"\t" + "판매량" +"\t" +"매출금액" +"\t" + "연락처");
      System.out.println("-----------------------------------------------------");
      for (int i = 0; i<list.size(); i++) {
         Sales s = list.get(i);
         
         System.out.println(s.getSaleDate() +"\t" + s.getCode() +"\t" + s.getLocation()
         + "\t" + s.getSaleAmount() +"\t" + s.getSaleMoney() +"\t" + s.getPhone());
      }
      System.out.println("------------------------------");
      System.out.println(" ");
      
      
      //매출액이 제일 높은 거래처 코드를 출력
      int max = 0; //비교해서 더 큰 값을 넣을 변수
      int maxIndex = 0; //인덱스를 기억할 변수 설정, 매출액이 제일 높은 거래처의 인덱스를 저장
      
      for (int i =0; i<list.size(); i++) {
         if (max < list.get(i).getSaleMoney()) {
            max = list.get(i).getSaleMoney();
            maxIndex = i;
         }
      }
      System.out.println("최고 매출액: " + list.get(maxIndex).getSaleMoney());
      System.out.println("거래처 코드: " + list.get(maxIndex).getCode());
      System.out.println("------------------------------");
      System.out.println(" ");
      
      
      
      //판매량이 제일 적은 매출일자, 거래처코드, 판매량을 출력
      int min = 999999999;
      int minIndex = 0;
      
      for (int i =0; i<list.size(); i++) {
         if (min > list.get(i).getSaleAmount()) {
            min = list.get(i).getSaleAmount();
            minIndex = i;
         }
      }
      System.out.println("최저 판매량: " + list.get(minIndex).getSaleAmount());
      System.out.println("매출일자: " + list.get(minIndex).getSaleDate());
      System.out.println("거래처 코드: " + list.get(minIndex).getCode());
      System.out.println("------------------------------");
      System.out.println(" ");
      
      
      
      
      
      
      
      //거래처 코드를 입력하면 매출지역과 연락처를 출력
      
      Scanner sc = new Scanner(System.in);

      boolean flag = true;
      
      while (flag) {
         
         boolean searchOk = false;

         for (int i = 0; i < list.size(); i++) {
            System.out.print("거래처 코드 입력 > ");
            String code = sc.next();
            sc.nextLine();

            if (list.get(i).getCode().equals(code)) {
               System.out.println("매출지역 : " + list.get(i).getLocation());
               System.out.println("연락처 : " + list.get(i).getPhone());
               searchOk = true;

               System.out.print("더 검색하시겠습니까?(Y/N) > ");
               String choice = sc.nextLine();
               if (choice.equalsIgnoreCase("Y"))
                  flag = true;
               else if (choice.equalsIgnoreCase("N")) {
                  System.out.println("프로그램 종료");
                  flag = false;
                  break;
               }

            }

         }
         if (!searchOk)
            System.out.println(searchOk + "코드는 없는 코드입니다.");
   
         
      }

      

   }

}