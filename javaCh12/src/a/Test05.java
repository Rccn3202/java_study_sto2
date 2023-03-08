


package a;

import java.util.Scanner;

class School{
	String school = "jejuelementary";//학교명
	int grade = 6; //학년
	String school2;
	int grade2;
	
}
public class Test05 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School sch=new School();
		
		System.out.println("학교명 입력: ");
		sch.school2=sc.next();
		System.out.println("학년 입력: ");
		sch.grade2=sc.nextInt();
		
		
		System.out.println(sch.grade+" grade in "+sch.school+" School");
		System.out.println(sch.grade2+" grade in "+sch.school2+" School");
	
	}
	
		
	}


