package javaHeight05.queue;

import java.util.LinkedList;
import java.util.Queue;

//queue는 인터페이스 이므로 new queue 이런거 없음
public class QueueEx01 {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSNS","김길동"));
		messageQueue.offer(new Message("sendKakao","이길동"));
		messageQueue.offer(new Message("sendFace","박길동"));
		
	
		
		while(! messageQueue.isEmpty()) {
		Message m=messageQueue.poll();
		System.out.println(m.getTo()+"에게 "+m.getCommand().substring(4)+"를 보냅니다");
		}
		
		
	}

}
