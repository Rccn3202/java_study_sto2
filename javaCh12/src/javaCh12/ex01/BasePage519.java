package javaCh12.ex01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasePage519 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "dltnwl";
		byte[] arr1=data.getBytes("UTF-8");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println(Arrays.toString(arr1));
		
		String str1=new String(arr1);
		System.out.println(str1);

		byte[] arr2 = data.getBytes("euc-kr");
		System.out.println(Arrays.toString(arr2));
		
	    String data3 = "홍길동,이수홍&박연수 이순신-강감찬";
	    //&을 구분자로 사용해서 각각 이름을 분리해주세요
	    //방법1  String클래스 이용하기
	    String[] arr3  = data3.split(",|&| |-");
	    for(String a3  : arr3) {
	    	System.out.println( a3 );
	    }
	    
	    System.out.println( "=====================");
	    //방법2 StringTokenizer클래스 이용하기
	    String data4 = "홍길동@이수홍,박연수@이순신,강감찬";
	    StringTokenizer st4 = new StringTokenizer(data4, "@|,");
	    while( st4.hasMoreTokens()) {
	    	String token4 = st4.nextToken();
	    	System.out.println( token4);
	    }
	    
	    Integer i=100;
	    int iv=i.intValue();
	    
	    int ii=200;
	    Integer iiv=Integer.valueOf(ii);
	    
	    //언박싱 double
	    Double d=3.4;
	    double dd=d.intValue();
	    
	    //박싱 float
	    float f=1.2f;
	    Float ff=Float.valueOf(f);
	    
	    
		}
	}


