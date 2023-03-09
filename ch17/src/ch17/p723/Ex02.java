package ch17.p723;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Ex02 {

	public static void main(String[] args) {
		List<Integer> hakbun=new ArrayList<>();
		hakbun.add(1);
		hakbun.add(2);
		hakbun.add(3);
		hakbun.add(4);
		hakbun.add(5);
		hakbun.add(4);
		
		//�̱۽�Ʈ��
		Stream<Integer> stream = hakbun.stream();
		stream.forEach(h->System.out.println(h));
		
		//�ѹ� �� ����Ϸ��� Stream�� �� �������Ѵ�
		Stream<Integer> stream2 = hakbun.stream();
		stream2.forEach(h->System.out.println(h));
		
		//parallelStream�� ������ ������� ó���ϹǷ� ������ �ٸ��� ���� �� �ִ�
		Stream<Integer> pStream=hakbun.parallelStream();
		pStream.forEach(p->System.out.print("p"+p+Thread.currentThread().getName()));
	}

}
