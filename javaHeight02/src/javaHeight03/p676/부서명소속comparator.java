package javaHeight03.p676;

import java.util.Comparator;

public class �μ���Ҽ�comparator implements Comparator<�μ���Ҽ�>{
	
	@Override
	public int compare(�μ���Ҽ� o1, �μ���Ҽ� o2) {
		
		return o1.get�μ���().compareTo(o2.get�μ���());	//������ ������ ��� ����
	}

}
