package javaHeight03.p676;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class 영업부서별실적표 {

	public static void main(String[] args) {
		TreeMap<부서명소속, 소속매장위치판매실적> tm=new TreeMap<부서명소속, 소속매장위치판매실적>(new 부서명소속comparator());
		
		tm.put(new 부서명소속("서울","강북"),new 소속매장위치판매실적("서울", "백화점",1));
		tm.put(new 부서명소속("경인","강서"),new 소속매장위치판매실적("서울", "쇼핑몰",2));
		tm.put(new 부서명소속("강원","강남"),new 소속매장위치판매실적("서울", "백화점",3));
		tm.put(new 부서명소속("제주","강동"),new 소속매장위치판매실적("서울", "쇼핑몰",4));
		
		//정렬의 기준은 강북,강서..로 삼는다(키)
		
		//전체출력
		Set<부서명소속> a1 = tm.keySet();
		for(부서명소속 a : a1) {
			System.out.println(a.get부서명()+" "+a.get소속()+tm.get(a).get소속()+" "+tm.get(a).get매장위치()+" "+tm.get(a).get판매실적());
		}
		
		
	}

}
