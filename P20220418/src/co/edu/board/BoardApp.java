package co.edu.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp implements BoardService {
	Scanner scn = new Scanner(System.in);
	ArrayList <Board> posts = new ArrayList<Board>();
	
	
	@Override
	public void addPost(Board post) {
		posts.add(post);
		
	}
	@Override
	public void modPost(Board post) {
		System.out.println("수정될 글제목 >>>");
		String textname = scn.nextLine();
		System.out.println("수정될 글내용 >>>");
		String textcontent = scn.nextLine();
		Board modBoard = new Board(textname,textcontent);
		
		for(int i=0; i<posts.size();i++) {
			if(posts.get(i).getPostNo() == post.getPostNo()) {
				posts.set(i, modBoard);
				
			}
			System.out.println("수정 완료");
			System.out.println();
		}
	}
	@Override
	public void delPost(int postNo) {
		Board delPost = new Board(postNo,null,null);
		for(int i=0;i<posts.size();i++) {
			if(posts.get(i).getPostNo() == postNo) {
				posts.remove(i);
			}
		}
	}
	@Override
	public Board findPost(int postNo) {
		
		for(int i=0;i<posts.size();i++) {
			if(posts.get(i).getPostNo() == postNo) {
				return posts.get(i);
			}
		}
		return null;
		
	}
	@Override
	public Board List() {
		for(int i=0;i<posts.size();i++) {
			posts.get(i).toString();
		}
		
		
		return null;
	}

}
