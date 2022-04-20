package co.edu.nested;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		BoardService service = new BoardApp();

		
		while (true) {
			System.out.println("1.글등록 2.글수정 3.글삭제 4.글조회(작성자 기준) 5.전체글목록 6.종료");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == BoardService.ADD) {
				System.out.println("글번호 입력 >>>");
				int postNo = scn.nextInt();
				scn.nextLine();
				System.out.print("글제목 입력 >>>");
				String postName = scn.nextLine();
				System.out.println();
				System.out.print("글내용 입력 >>>");
				String content = scn.nextLine();

				Board newpost = new Board(postNo, postName, content);
				service.addPost(newpost);
				

			} else if (menu == BoardService.MOD) {
				System.out.println("수정할 글번호 >>>");
				int postNo= scn.nextInt();
				scn.nextLine();
				
				Board modpost = new Board(postNo,null,null);
				service.modPost(modpost);

			} else if (menu == BoardService.DEL) {
				System.out.println("삭제할 글번호 >>>");
				int postNo = scn.nextInt();
				scn.nextLine();
				
				service.delPost(postNo);

			} else if (menu == BoardService.SEARCH) {
				System.out.println("조회할 글번호 >>>");
				int postNo = scn.nextInt();
				scn.nextLine();
				
				service.findPost(menu);
			} else if (menu == BoardService.LIST) {
				service.List();
			} else {
				System.out.println("프로그램을 종료합니다.");
			break;
			}
		}
	}

}
