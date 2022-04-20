package co.edu.nested;

public class Board {
	//필드
	int postNo;
	String postName;
	String content;
	String writer;
	String writeDate;
	
	//생성자
	public Board(int postNo,String postName, String content) {
		super();
		this.postNo = postNo;
	}
	public Board(String postName, String content) {
		super();
		this.postName = postName;
		this.content = content;
	}
	public Board(String postName, String content, String writer, String writeDate) {
		super();
		this.postNo = postNo;
		this.postName = postName;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}
	
	
	//메소드 getter setter
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String contend) {
		this.content = contend;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "Board [postNo=" + postNo + ", postName=" + postName + ", content=" + content + ", writer=" + writer
				+ ", writeDate=" + writeDate + "]";
	}
	
	
	
	
	
	
	

}
