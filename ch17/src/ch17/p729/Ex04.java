package ch17.p729;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex04 {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get(Ex04.class.getResource("data.txt").toURI());
		System.out.println(path);
		Stream<String> stream=Files.lines(path, Charset.forName("UTF-8"));
		stream.forEach(d->System.out.println(d));
		stream.close();//파일 닫는것 중요
		
		Files.lines(path, Charset.defaultCharset())
			.forEach(d->System.out.println(d) );			
		

	}

}
