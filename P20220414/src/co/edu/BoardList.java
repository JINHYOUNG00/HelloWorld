package co.edu;

public class BoardList {
	private Board[] boards;

	// 배열크기 초기화
	public void init(int size) {
		boards = new Board[size];
	}

	// 배열에 한건 입력
	public int addBoard(Board board) {
		// 더이상 저장공간이 없을때...false
//		boolean check = false;
		int errorCase = -1;

		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1; //동일한 값이 있을 경우의 에러.
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0;
				break;
			}
	}

		return errorCase;
	} 

	// 수정: 게시글 번호로 찾아서 내용, 제목 수정
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setTitle(board.getTitle());
				boards[i].setContent(board.getContent());
				check = true;
				break;

			}
		}
		return check;
	}

	// 삭제 : 게시글 번호.
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				boards[i] = null;
				check = true;
				break;
			}
		}
		return check;
	}

	// 한건조회: 게시글 번호
	public Board searchBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == bNo) {
				boards[i].getInfo();
				return boards[i];
			}
		}
		return null;
	}
	// 작성자 조회만들기
	
//	public Board[] getWriterList(String Wname) {
//		for (int i = 0; i < boards.length; i++) {
//			if (Wname.equals(boards[i].getWriter())) {
//				boards[i].getInfo();
//				return boards;
//			}
//		}
//		return null;
//	} 내가 해본것
	public Board[] getWriterList(String Wname) {
		Board[] sBoard = new Board[5];
		for(int i=0; i<boards.length;i++) { // 찾을 대상 배열
			if(boards[i] != null && boards[i].getWriter().equals(Wname)){
				for(int j = 0; j<sBoard.length;j++) { // 이름 조회 반환 배열
					if (sBoard[j]==null) {
						sBoard[j] = boards[i];
						break;
					}
				}
						
			}
		}
		return sBoard;
	}
	

	
	
	
	
	
	
	// 게시글 목록
	public Board[] boardList() {
		return boards;
	}
}
