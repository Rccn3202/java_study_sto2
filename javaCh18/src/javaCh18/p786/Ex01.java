package javaCh18.p786;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {

	public static void main(String[] args) {
		//�Է½�Ʈ��
		try {
			InputStream is = new FileInputStream("C:/webStudyB/study/java_study2/temp/data4.txt");
			
			byte[] buf = new byte[50];
			
			while(1==1) {
				int data =is.read(buf);
				//������ ������ ������ ������. ���� -1 ������ EOF(end of file)
				if(data==-1) break; //System.exit(0);
				for(int i=0; i<data; i++) {
					System.out.println(buf[i]);
				}
				System.out.println(data);
			}
			is.close();
		}catch(IOException e) {
			
		}

	}

}
