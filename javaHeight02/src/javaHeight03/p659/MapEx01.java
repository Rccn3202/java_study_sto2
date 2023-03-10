package javaHeight03.p659;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		// key-전화번호,value-포인터,주소  /전화번호를 치면 포인터와 주소가 나올 수 있게
		//value는 하나밖에 못정하기 때문에 data클래스를 만들어서 값 두 개 나올 수 있도록 함
		
		Map<String,Data1> shopMap1=new HashMap<String,Data1>();
		Shop shop1=new Shop("1111", new Data1(100, "미사동1"));
		Shop shop2=new Shop("2222", new Data1(120, "미사동2"));
		Shop shop3=new Shop("3333", new Data1(140, "미사동3"));
		Shop shop4=new Shop("4444", new Data1(170, "미사동4"));
		Shop shop5=new Shop("5555", new Data1(103, "미사동5"));
		
		shopMap1.put(shop1.getPhone(), shop1.getData1());	//shop1.getPhone을 키로 사용
		shopMap1.put(shop2.getPhone(), shop2.getData1());	//shop1.getData1 이 나온다
		shopMap1.put(shop3.getPhone(), shop3.getData1());
		shopMap1.put(shop4.getPhone(), shop4.getData1());
		shopMap1.put(shop5.getPhone(), shop5.getData1());
		
		Data1 shop1Arr=shopMap1.get(shop1.getPhone());
		System.out.println("고객전화번호 "+shop1.getPhone());
		System.out.println("고객 포인트 "+shop1Arr.getPoint());
		System.out.println("고객 주소 "+shop1Arr.getAddress());
		
	}

}
