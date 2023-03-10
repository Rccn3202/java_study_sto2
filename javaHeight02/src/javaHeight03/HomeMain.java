package javaHeight03;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HomeMain {

	public static void main(String[] args) {
		Set<Home> homeSet = new HashSet<>();
		
		homeSet.add(new Home("502",1,423,25000));
		homeSet.add(new Home("303",7,724,35000));
		homeSet.add(new Home("403",2,222,40000));
		homeSet.add(new Home("503",2,438,25000));
		homeSet.add(new Home("503",3,171,35000));
		
		//호수 같으면 동등객체
		System.out.println("전체명단");
		Iterator<Home> it = homeSet.iterator();
		while(it.hasNext()) {
			Home homeadd=it.next();
			System.out.println(homeadd.getNum()+" "+homeadd.getFam()+" "+homeadd.getElec()+" "+homeadd.getFee());
		}
		
		//호수 입력하면 전기사용량 나오게 출력
		String searchNum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("호수입력> ");
		String hnum=sc.next();
		it=homeSet.iterator();
		boolean searchOk=false;
		while(it.hasNext()) {
			Home homeadd=it.next();
			if(homeadd.getNum().equals(hnum)) {
				System.out.println("전기사용료: " +homeadd.getElec());
				searchOk=true;
			}
		} if(!searchOk) System.out.println("해당 호수 없음");
		
		//전기사용량이 제일 많은 가구/호수와 가족수 출력
		it=homeSet.iterator();
		int max=0;
		Home maxAdd=null;
		while(it.hasNext()) {
			Home add=it.next();
			if(max<add.getFee()) {
				max=add.getFee();
				maxAdd=add; //전기사용량이 제일 큰 객체의 주소를 넣어준다
			}
		}
		System.out.println("우리 아파트에서 전기 제일 많이 쓰는 호수 : ");
		System.out.println(maxAdd.getNum()+"호"+maxAdd.getFam()+"명");
		
		it=homeSet.iterator();
		Home[] minAdd=new Home[10];
		int min=999999;
		int index=0; //관리비 배열의 인덱스 변수
		while(it.hasNext()) {
			Home add=it.next();
			
			if(min>add.getFee()){
				min=add.getFee();
				minAdd[index++]=add;	//midAdd[0]에 35000에 대한 주소 들어감
			}else if(min==add.getFee()) {
				index++;
				minAdd[index]=add;	
			}
		}
		for(int i=0;i<minAdd.length;i++) {
			if(minAdd[i]==null) break;
			minAdd[i].setFee(minAdd[i].getFee()+500);
		}
		System.out.println("전체명단");
		Iterator<Home> it4 = homeSet.iterator();
		while(it4.hasNext()) {
			Home homeadd=it4.next();
			System.out.println(homeadd.getNum()+" "+homeadd.getFam()+" "+homeadd.getElec()+" "+homeadd.getFee());
		}
		
		
		it=homeSet.iterator();
		int sumElec=0;
		int sumFee=0;
		while(it.hasNext()) {
			Home add=it.next();
			sumElec+=add.getFee();
			sumFee+=add.getFee();
		}
		System.out.println("전기사용량 평균"+(sumElec/homeSet.size()));
		System.out.println("전체 공동요금 평균"+(sumFee/homeSet.size()));
/*max 다른 방법
 * int max=0;
	Home maxAdd=null;
 int min
 * for
 * 
 * 
 */


	}

}
