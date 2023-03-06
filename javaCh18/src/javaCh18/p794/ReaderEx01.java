package javaCh18.p794;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx01 {

	public static void main(String[] args) {
		// C:\webStudyB\study\java_study2\temp\메모.txt

		try {
			Reader reader=new FileReader("C:\\webStudyB\\study\\java_study2\\temp\\메모.txt");
			Writer writer = new FileWriter("C:\\webStudyB\\study\\java_study2\\temp\\copy메모.txt");
			while(true) {
				int data = reader.read();
				if(data ==-1)break;
				System.out.print((char)data);
				writer.write(data);
			}

			reader.close();

			Reader reader1=new FileReader("C:\\webStudyB\\study\\java_study2\\temp\\메모.txt");
			Writer writer1=new FileWriter("C:\\webStudyB\\study\\java_study2\\temp\\copy메모2.txt");
			
			char[] data = new char[100];
			while(true) {
				int data1 = reader1.read(data);
				if(data1 ==-1) break;
				for(int i=0;i<data1 ;i++) {
				System.out.print((char)data1);
			}
				writer1.write(data);
				}
			writer1.flush();
			writer1.close();

			reader1.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
