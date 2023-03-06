package javaCh18.p799;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;





public class Ex01 {

	public static void main(String[] args) throws IOException {
		write("문자 변환 스트림 사용");
		
		StringBuilder data=read();
		System.out.println(data);

	}
	

	private static StringBuilder read() throws IOException {
		InputStream is=new FileInputStream("C:\\webStudyB\\study\\java_study2\\temp\\메모.txt");
		Reader reader=new InputStreamReader(is,"UTF-8");
		char[] c = new char[1024];
		StringBuilder sb = new StringBuilder();
		while(true) {
			int num=reader.read(c);
			if(num==-1) break;
			for(int i=0;i<num;i++) {
				String str=new String(c,0,num);
				sb.append(str);
			}
		}
		reader.close();
		is.close();
		return sb;
	}


	private static void write(String str) throws IOException {
		//OutputStream os = new FileOutputStream("");//주스트림
		
		//주스트림에 있는 것을 보조에 끼우기
		Writer writer = new OutputStreamWriter(new FileOutputStream("C:\\webStudyB\\study\\java_study2\\temp\\text10.txt"), "UTF-8");
		
		writer.write(str);
		writer.flush();
		writer.close();
		
	}
}
