package javaCh14;

public class Task implements Runnable {
@Override
public void run() {
	//�̰��� ���ÿ� ó���� �ڵ带 �־��ش�
	for(int i=0;i<500;i++) {
	System.out.println("û���� �������");
	}
}
}
