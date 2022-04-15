package co.test;

import java.util.InputMismatchException;
import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리. 이름찾아서 연락처 수정 이름찾아서 이름을 삭제
public class Exam5 {
	public static void main(String[] args) {
		
		Exam4 [] friends = new Exam4[100];
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1.추가 2.수정(이름,연락처) 3.삭제(이름) 4.조회(이름) 5.종료");
			System.out.print("선택>> ");
			int menu = -1;
			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 처리를 시도했습니다."); // 예외처리
			}
			scn.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				System.out.println("수정할 이름 입력>>>");
				 

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("end of prog.");
		}

	}
	public void createMember() {
		System.out.println("===========================");
		System.out.println("친구 추가");
		System.out.println("===========================");
		System.out.printf("친구 이름 입력>> ");
		String fName = scn.nextLine();  
		System.out.printf("친구 연락처 입력>> ");
		String fPhone = scn.nextLine();  
		System.out.printf("친구 생일 입력>> ");
		String fBirth = scn.nextLine();
		
		for(int i = 0; i < friends.length;i++)
		Exam4 a = new Exam4(name, phone, birth);
	}
	
	
	
}
