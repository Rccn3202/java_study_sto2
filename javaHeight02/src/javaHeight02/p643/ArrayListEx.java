package javaHeight02.p643;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<Board> boardList1=new ArrayList<Board>();//<Borad라는 클래스를 담겠다>
		//제네릭 생략 가능한데 왜 안되지?
		boardList1.add(new Board("날씨","비가 와요","홍길동","0220"));
		boardList1.add(new Board("요일","금","김김동","0120"));
		boardList1.add(new Board("ㄴㄹㅇㄹㄴ","ㅣㅏ","ㄹㄴㄷ","dfsa"));
		
		for(int i=0;i<boardList1.size();i++) {
			System.out.println(boardList1.get(i).getSubject());
		}

		
		System.out.println("-------------------------");
		//게시판 제목에 "요일"이라는 것을 쓴 사람의 이름과 작성일 검색
		for(int i=0;i<boardList1.size();i++) {
	    	
			if(boardList1.get(i).getSubject().equals("요일")) {
				System.out.println(boardList1.get(i).getWriter());
				System.out.println(boardList1.get(i).getJoindate());
			};
		}
		System.out.println("--작성일이 0220 것의 게시글 제목과 내용----");
		for(int j=0;j<boardList1.size();j++){
			if(boardList1.get(j).getJoindate().equals("0220")) {
				System.out.println(boardList1.get(j).getSubject());
				System.out.println(boardList1.get(j).getContent());
			}
		}
	
}
}

