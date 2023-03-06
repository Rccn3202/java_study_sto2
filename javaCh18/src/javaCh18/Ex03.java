package javaCh18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) {
		
		
		try {
			OutputStream os = new FileOutputStream("C:/webStudyB/study/java_study2/temp/data4.txt");
			byte[] array = {'a','b','c','d','e','f','g','h'};	
			
			os.write(array);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
