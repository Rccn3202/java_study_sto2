package javaCh14;

public class Task implements Runnable {
@Override
public void run() {
	//이곳에 동시에 처리할 코드를 넣어준다
	for(int i=0;i<500;i++) {
	System.out.println("청바지 만들어줘");
	}
}
}
