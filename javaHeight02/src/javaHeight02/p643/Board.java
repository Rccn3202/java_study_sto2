package javaHeight02.p643;

public class Board {
	//필드
	private String subject; //게시판 제목
	private String content; //게시판 내용
	private String writer; //게시판 글쓴이
	private String joindate; //게시 날짜
	
	//생성자 한꺼번에 생성
	public Board(String subject, String content, String writer, String joindate) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.joindate = joindate;
	}
	
	//게터세터
	public String getSubject() { return subject; }
	public void setSubject(String subject) {this.subject = subject; }
	public String getContent() { return content; }
	public void setContent(String content) {this.content = content;}
	public String getWriter() {	return writer;	}
	public void setWriter(String writer) {	this.writer = writer;	}
	public String getJoindate() {	return joindate;	}
	public void setJoindate(String joindate) {	this.joindate = joindate;
	}
	
}
