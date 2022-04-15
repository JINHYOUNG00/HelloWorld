package co.edu.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountApp {

	Account[] accounts = new Account[100]; // 계좌정보를 저장하기 위한 배열.

	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {
			System.out.println("1.계좌생성 2.입금 3.출금 4.목록조회 5.종료");
			System.out.print("선택>> ");

			int menu = -1;
			try {
				menu = scn.nextInt(); // 사용자 입력값을 숫자타입으로 입력
			} catch (InputMismatchException e) {
				System.out.println("잘못된 처리를 시도했습니다."); // 예외처리
			}
			scn.nextLine();
			if (menu == 1) { // 계좌생성
				createAccount();
			} else if (menu == 2) { // 입금
				deposit();
			} else if (menu == 3) { // 출금
				withdraw();
			} else if (menu == 4) { // 목록조회
				accountList();
			} else if (menu == 5) { // 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

	// 계좌생성 시 실행할 메소드
	public void createAccount() {
		System.out.println("===========================");
		System.out.println("계좌생성");
		System.out.println("===========================");
		System.out.print("계좌번호 >>");
		String accountNum = scn.nextLine();
		System.out.print("계좌주 >>");
		String owner = scn.nextLine();
		System.out.print("입금액 >>");
		int balance = scn.nextInt();
		scn.nextLine();

		for (int i = 0; i < accounts.length; i++) {
			Account a = new Account(accountNum, owner, balance);
			accounts[i] = a;
			break;
		}
		System.out.println("정상입력되었습니다.");

	}

	// 입금처리시 실행할 메소드
	public void deposit() {
		System.out.println("===========================");
		System.out.println("예금");
		System.out.println("===========================");
		System.out.print("계좌번호 >>");
		String accountNum = scn.nextLine();
		System.out.print("입금액 >>");
		int money = scn.nextInt();
		int balance = 0;
		scn.nextLine();

		for (int i = 0; i < accounts.length; i++) {
			if (accountNum.equals(accounts[i].getAccountNum())) {
				balance = accounts[i].getBalance();
				balance += money;
				accounts[i].setBalance(balance);

				System.out.println(money + "원이 입금되었습니다.");
				break;
			}

		}

	}

	// 출금처리시 실행할 메소드
	public void withdraw() {
		System.out.println("===========================");
		System.out.println("출금");
		System.out.println("===========================");
		System.out.print("계좌번호 >>");
		String accountNum = scn.nextLine();
		System.out.print("출금액 >>");
		int money = scn.nextInt();
		scn.nextLine();
		int balance = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accountNum.equals(accounts[i].getAccountNum())) {
				balance = accounts[i].getBalance();
				if (money <= balance) {
					balance -= money; // balance = balance - money
					accounts[i].setBalance(balance);
					System.out.println(money + "원이 출금되었습니다.");
				} else {
					System.out.println("잔고가 부족합니다.");
				}
			}
			break;
		}
	}

	// 전체목록 실행 메소드
	public void accountList() {
		System.out.println("===========================");
		System.out.println("계좌목록");
		System.out.println("===========================");
		for (Account account : accounts) {
			if (account != null) {
				account.showInfo();
			}
			
			
//			for (Board board : boards) {
//				if(board != null) {
//					board.getInfo();
//				}

		}
	}
}
