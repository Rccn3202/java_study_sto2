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
		
		//ȣ�� ������ ���ü
		System.out.println("��ü����");
		Iterator<Home> it = homeSet.iterator();
		while(it.hasNext()) {
			Home homeadd=it.next();
			System.out.println(homeadd.getNum()+" "+homeadd.getFam()+" "+homeadd.getElec()+" "+homeadd.getFee());
		}
		
		//ȣ�� �Է��ϸ� �����뷮 ������ ���
		String searchNum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ȣ���Է�> ");
		String hnum=sc.next();
		it=homeSet.iterator();
		boolean searchOk=false;
		while(it.hasNext()) {
			Home homeadd=it.next();
			if(homeadd.getNum().equals(hnum)) {
				System.out.println("�������: " +homeadd.getElec());
				searchOk=true;
			}
		} if(!searchOk) System.out.println("�ش� ȣ�� ����");
		
		//�����뷮�� ���� ���� ����/ȣ���� ������ ���
		it=homeSet.iterator();
		int max=0;
		Home maxAdd=null;
		while(it.hasNext()) {
			Home add=it.next();
			if(max<add.getFee()) {
				max=add.getFee();
				maxAdd=add; //�����뷮�� ���� ū ��ü�� �ּҸ� �־��ش�
			}
		}
		System.out.println("�츮 ����Ʈ���� ���� ���� ���� ���� ȣ�� : ");
		System.out.println(maxAdd.getNum()+"ȣ"+maxAdd.getFam()+"��");
		
		it=homeSet.iterator();
		Home[] minAdd=new Home[10];
		int min=999999;
		int index=0; //������ �迭�� �ε��� ����
		while(it.hasNext()) {
			Home add=it.next();
			
			if(min>add.getFee()){
				min=add.getFee();
				minAdd[index++]=add;	//midAdd[0]�� 35000�� ���� �ּ� ��
			}else if(min==add.getFee()) {
				index++;
				minAdd[index]=add;	
			}
		}
		for(int i=0;i<minAdd.length;i++) {
			if(minAdd[i]==null) break;
			minAdd[i].setFee(minAdd[i].getFee()+500);
		}
		System.out.println("��ü����");
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
		System.out.println("�����뷮 ���"+(sumElec/homeSet.size()));
		System.out.println("��ü ������� ���"+(sumFee/homeSet.size()));
/*max �ٸ� ���
 * int max=0;
	Home maxAdd=null;
 int min
 * for
 * 
 * 
 */


	}

}