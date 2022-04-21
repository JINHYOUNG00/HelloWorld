package co.edu.board;

import java.util.Scanner;

public interface BoardService {
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int LIST = 5;
	

	
	
	//글등록, 글수정, 글삭제, 글조회, 전체글목록
	
	Scanner scn = new Scanner(System.in);
	public void addPost(Board post);
	public void modPost(Board post);
	public void delPost(int postNo);
	public Board findPost(int postNo);
	public Board List();
	
	
}
