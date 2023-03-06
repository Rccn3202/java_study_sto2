package javaCh18.p791;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx {

	public static void main(String[] args) {
		// C:/webStudyB/7.jpg
		
		try {
			InputStream is = new FileInputStream("C:/webStudyB/12.jpg");
			OutputStream os = new FileOutputStream("C:/webStudyB/study/java_study2/temp/copy.jpg");
			
			byte[] by=new byte[1024];
			while(true) {
				int num= is.read(by);
				if(num==-1) break;
				
				os.write(by,0,num);
			}
			
			os.flush();
			os.close();
			is.close();	//is°¡ ¸ÕÀú ½ÇÇàµÊ(¹Ù±ù¹®). os¸ÕÀú ´Ý°í is ´Ý´Â´Ù
			
		} catch (IOException e) {
			
		}
		
		
		

	}

}
