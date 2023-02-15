package javaHeight03.p660;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx03 {

	public static void main(String[] args) {
		//Hashtable:������ ����
		Map<String,Data2> teacherMap=new Hashtable<String,Data2>();
		
		School sh1=new School("��",new Data2("3-1",30));
		School sh2=new School("��",new Data2("3-2",31));
		School sh3=new School("��",new Data2("3-3",32));
		
		teacherMap.put(sh1.getName(),sh1.getData1());
		teacherMap.put(sh2.getName(),sh2.getData1());
		teacherMap.put(sh3.getName(),sh3.getData1());
		
		//������ �̸��� ����ּ���
		//Ǯ��:������ �̸��� Ű���̹Ƿ� Ű���� ����
		Set<String> keys = teacherMap.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//�б� ������ �ο���?
		System.out.println(teacherMap.size());
		
		//������ �� �б� �ο��� ���
		it=keys.iterator();
		while(it.hasNext()) {
			String arr=it.next();
			Data2 mapValue=teacherMap.get(arr);	//value�� data�� ����
			System.out.println("�̸�"+arr);
			System.out.println("��"+mapValue.getGclass());
			System.out.println("�ο���"+mapValue.getNum());
		}
		

	}

}