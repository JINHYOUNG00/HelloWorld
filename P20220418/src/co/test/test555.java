package co.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test555 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		test444[] members = new test444[10];
		while (true) {
			System.out.println("=================================================");
			System.out.println("1.추가 2.수정(이름,연락처) 3.삭제(이름) 4.조회(이름) 5.종료");
			System.out.println("=================================================");
			System.out.print("선택>> ");
			int menu = -1;
			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 처리를 시도했습니다."); // 예외처리
			}
			scn.nextLine();
			if (menu == 1) {
				System.out.println("=========================");
				System.out.println("친구 추가");
				System.out.println("=========================");
				System.out.print("입력할 이름 입력 >>>");
				String name = scn.nextLine();
				System.out.print("생일 입력 >>>");
				String birth = scn.nextLine();
				System.out.print("연락처 입력 >>>");
				String phone = scn.nextLine();
				test444 mem = new test444(name, birth, phone);

				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = mem;
						break;
					}
				}

			} else if (menu == 2) {
				System.out.println("=========================");
				System.out.println("수정");
				System.out.println("=========================");
				System.out.print("이름 입력 >>>");
				String name = scn.nextLine();
				System.out.print("연락처 입력 >>>");
				String phone = scn.nextLine();
				System.out.print("수정할 이름 입력 >>>");
				String name2 = scn.nextLine();
				System.out.print("수정할 이름 입력 >>>");
				String phone2 = scn.nextLine();

				for (int i = 0; i < members.length; i++) {
					if (members[i] !=null && members[i].getName().equals(name) && members[i].getPhone().equals(phone)) {
						members[i].setName(name2);
						members[i].setPhone(phone2);
					}
				}

			} else if (menu == 3) {
				System.out.println("삭제할 이름 입력 >>>");
				String name = scn.nextLine();

				for (int i = 0; i < members.length; i++) {
					if (members[i] !=null && members[i].getName().equals(name))
						members[i].setName(null);
				}

			} else if (menu == 4) {
				System.out.println("조회할 이름 입력 >>>");
				String name = scn.nextLine();

				for (int i = 0; i < members.length; i++) {
					if (members[i] !=null && members[i].getName().equals(name)) {

						System.out.println(members[i].toString());
					}
				}

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog.");

	}

}
