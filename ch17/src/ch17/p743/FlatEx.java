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
		list2.stream().flatMapToInt(s->{	//s안에는 "10,20,30"    "40,50" //s는 [ ?super T ]
			
			String[] strArr = s.split(",");	//strArr 안에는 "10" "20" "30" "40" "50"
			int[] intArr = new int[strArr.length];
			for(int i=0;i<intArr.length;i++) {
				intArr[i]=Integer.parseInt(strArr[i]); //intArr안에 {10,20,30,40,50}
			}
			return Arrays.stream(intArr);	//정수형 스트림으로 만들었다. 10,20,30,40,50,
			//여기까지는 IntStream flatMapToInt에서 [ ? extends IntStream ]을 만드는 과정
			//묶음 분리-문자열을 정수형으로 변경
		}).forEach(k->System.out.println(k+" "+(k+100)));
		

		System.out.println();
		
		//방법2
	    
	      list2.stream().flatMap(s->
	      Arrays.stream(s.split(",")))
	      .mapToInt(s-> Integer.parseInt(s)).forEach(s->System.out.println(s));
	      
	   }

		
	}


