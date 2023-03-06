package javaCh18.p791;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream is = new FileInputStream("C:/webStudyB/study/java_study2/temp/data4.txt");
			OutputStream os = new FileOutputStream("C:\\webStudyB\\study\\java_study2\\temp\\copydata4.txt");
			
			byte[] b = new byte[1024];
			while(true) {
				int num = is.read();
				if(num==-1)break;
				
				os.write(b,0,num);
			}
			
			os.flush();
			os.close();
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
