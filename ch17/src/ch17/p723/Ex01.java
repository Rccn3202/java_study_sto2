package ch17.p723;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("ȫ");
		set.add("��");
		set.add("��");
		
		
	/*	Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
 */
		//��Ʈ�� ���-������ ������ ������ ��� �־��ش�, ������ �ܰ���� �ڵ尡 �־�� ������ ����
		Stream<String> stream = set.stream();
		stream.forEach(name->System.out.println(name));//name�� ���ٿ��� ������ �Ű�����
	}
		
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
