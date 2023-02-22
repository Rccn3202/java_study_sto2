package javaHeight05.queue;

import java.util.LinkedList;
import java.util.Queue;

//queue�� �������̽� �̹Ƿ� new queue �̷��� ����
public class QueueEx01 {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSNS","��浿"));
		messageQueue.offer(new Message("sendKakao","�̱浿"));
		messageQueue.offer(new Message("sendFace","�ڱ浿"));
		
	
		
		while(! messageQueue.isEmpty()) {
		Message m=messageQueue.poll();
		System.out.println(m.getTo()+"���� "+m.getCommand().substring(4)+"�� �����ϴ�");
		}
		
		
	}

}
