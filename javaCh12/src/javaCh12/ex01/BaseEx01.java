package javaCh12.ex01;

import java.io.IOException;

public class BaseEx01 {

	public static void main(String[] args) {

		try {
			System.out.println("출력할 내용");
			System.err.println("에러나면 빨간색 출력");
			int val =Integer.parseInt("100");
			while(true ) {
				
				
				int readData = System.in.read();
				System.out.println(readData);
				if(readData ==78 || readData ==110); {
					System.out.println("프로세스 종료");
					System.exit(0);
				}
				System.out.println("출력할 내용");
			}//end while
		} catch(NumberFormatException | IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
