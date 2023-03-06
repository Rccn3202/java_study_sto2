package javaCh18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/webStudyB/study/java_study2/temp/data3.txt");
	
			byte[] array = {10,20,30,40,50};
			
			os.write(array,1,3);
			
			os.flush();
			os.close();
			
			
		} catch (IOException e) {
			
		}
		
		
		
		

	}

}
