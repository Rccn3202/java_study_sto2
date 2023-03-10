package ch17.p743;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("this is java");
		list.add("i am a best developer");
		
		System.out.println();
		
		list.stream().flatMap(w->Arrays.stream(w.split(" "))).forEach(w->System.out.println(w));
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("10,20,30","40,50");
		list2.stream().flatMapToInt(s->{	//s�ȿ��� "10,20,30"    "40,50" //s�� [ ?super T ]
			
			String[] strArr = s.split(",");	//strArr �ȿ��� "10" "20" "30" "40" "50"
			int[] intArr = new int[strArr.length];
			for(int i=0;i<intArr.length;i++) {
				intArr[i]=Integer.parseInt(strArr[i]); //intArr�ȿ� {10,20,30,40,50}
			}
			return Arrays.stream(intArr);	//������ ��Ʈ������ �������. 10,20,30,40,50,
			//��������� IntStream flatMapToInt���� [ ? extends IntStream ]�� ����� ����
			//���� �и�-���ڿ��� ���������� ����
		}).forEach(k->System.out.println(k+" "+(k+100)));
		

		System.out.println();
		
		//���2
	    
	      list2.stream().flatMap(s->
	      Arrays.stream(s.split(",")))
	      .mapToInt(s-> Integer.parseInt(s)).forEach(s->System.out.println(s));
	      
	   }

		
	}


