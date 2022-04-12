package co.edu.loop;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scn = new Scanner(System.in);
		int balance = 0;

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("------------------------------");
			System.out.println("선택>>> ");
			int menu = scn.nextInt();

			if (menu == 1) { // 예금기능
				System.out.print("예금액> ");
				int money = scn.nextInt();
				balance += money; //balance = balance + money
				System.out.println(money +"원이 입금되었습니다.");
			} else if (menu == 2) { // 출금기능
				System.out.print("출금액> ");
				int money = scn.nextInt();
				if (money <= balance) {
					balance -= money; //balance = balance - money
					System.out.println(money +"원이 출금되었습니다.");
				} else if (money > balance){
					System.out.println("잔고가 부족합니다.");
				}

			} else if (menu == 3) { // 조회기능
				System.out.println("잔고> " + balance + "원");

			} else if (menu == 4) { // 종료기능
				run = false;

			} else {
				System.out.println("잘못된 입력입니다.");
			}

		} // end of while(run)

		System.out.println("프로그램 종료.");

	}

}
