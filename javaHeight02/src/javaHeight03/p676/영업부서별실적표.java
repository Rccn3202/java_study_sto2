package javaHeight03.p676;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class �����μ�������ǥ {

	public static void main(String[] args) {
		TreeMap<�μ���Ҽ�, �ҼӸ�����ġ�ǸŽ���> tm=new TreeMap<�μ���Ҽ�, �ҼӸ�����ġ�ǸŽ���>(new �μ���Ҽ�comparator());
		
		tm.put(new �μ���Ҽ�("����","����"),new �ҼӸ�����ġ�ǸŽ���("����", "��ȭ��",1));
		tm.put(new �μ���Ҽ�("����","����"),new �ҼӸ�����ġ�ǸŽ���("����", "���θ�",2));
		tm.put(new �μ���Ҽ�("����","����"),new �ҼӸ�����ġ�ǸŽ���("����", "��ȭ��",3));
		tm.put(new �μ���Ҽ�("����","����"),new �ҼӸ�����ġ�ǸŽ���("����", "���θ�",4));
		
		//������ ������ ����,����..�� ��´�(Ű)
		
		//��ü���
		Set<�μ���Ҽ�> a1 = tm.keySet();
		for(�μ���Ҽ� a : a1) {
			System.out.println(a.get�μ���()+" "+a.get�Ҽ�()+tm.get(a).get�Ҽ�()+" "+tm.get(a).get������ġ()+" "+tm.get(a).get�ǸŽ���());
		}
		
		
	}

}
