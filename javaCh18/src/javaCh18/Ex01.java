package javaCh18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class Ex01 {

	public static void main(String[] args) {

		try {
			OutputStream os=new FileOutputStream("C:/webStudyB/study/java_study2/temp/data1.txt");//파일만들어짐
		byte a=10;
		byte b=20;
		byte c=30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
		} catch (IOException e) {
		
		}
		

	}

}
