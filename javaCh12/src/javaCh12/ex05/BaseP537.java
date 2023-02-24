package javaCh12.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BaseP537 {

	public static void main(String[] args) {
		// ������ - ���� ��¥ �ݳ��� 2����
		
		LocalDateTime now = LocalDateTime.now();
		//System.out.println(now);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("������"+now.format(dtf));
		
		
		LocalDateTime returnDate =  now.plusWeeks(2);
		System.out.println("�ݳ���"+returnDate.format(dtf));
		
		//�޿��� ���ú��� 20�� �Ŀ�
		//�˶� 5�ð� ��
		//�̷� �ڻ���� 12�� �� 100�� ����
		System.out.println();
				
		LocalDateTime sal = now.plusDays(20);
		System.out.println("�޿���"+sal.format(dtf));
		
		LocalDateTime sal2 = now.plusHours(5);
		System.out.println("�˶�"+sal2.format(dtf));
				
		LocalDateTime sal3 = now.plusYears(12);
		System.out.println("�ڻ� 100�� "+sal3.format(dtf));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime start = LocalDateTime.of(2023, 2,23,9,37,20);
		System.out.println("������:"+start.format(dtf2));
		
		LocalDateTime edit = LocalDateTime.of(2023, 12,31,23,59,59);
		System.out.println("������:"+edit.format(dtf2));
		
		System.out.println();
		//���ϱⰣ 3.1 00 00 4-31 23;59;59
		//��¥1 3 15 ���ϱⰣ 2.20 3 5.3
		
		
		
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime edt = LocalDateTime.of(2023, 4,30,59,59);
		System.out.println("������:"+edt.format(dtf));
		LocalDateTime sdt = LocalDateTime.of(2023, 3,1,00,00);
		System.out.println("���ϱⰣ:"+sdt.format(dtf2));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ ");
		int year = sc.nextInt();
		System.out.println();
		
		System.out.print("�� ");
		int month = sc.nextInt();
		System.out.println();
		
		System.out.print("�� ");
		int day = sc.nextInt();
		System.out.println();
		
		LocalDateTime cudate = LocalDateTime.of(year, month,day,0,0);
		if(cudate.isBefore(edt) && cudate.isAfter(sdt)) {
			System.out.println("���ϱⰣ");
			
		}else if(cudate.isBefore(sdt)) {
			System.out.println("���ϱⰣ ���Դϴ�");
		} else if(cudate.isAfter(sdt)) {
			System.out.println("���ϳ���");
		}
		
		
		
		
		
	}

}
