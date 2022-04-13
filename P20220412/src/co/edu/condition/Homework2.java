package co.edu.condition;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int computer = (int) ((Math.random() * 3) + 1);
		System.out.println("1:가위, 2:바위, 3:보");
		String input = scn.nextLine();
		
		int user = 0;
		if (input.equals("가위")) {
			user = 1;
		} else if (input.equals("바위")) {
			user = 2;
		} else if (input.equals("보")) {
			user = 3;
		}
		String command = "";
		if (computer == 1) {
			command = "가위";
		} else if (computer == 2) {
			command = "바위";
		} else if (computer == 3) {
			command = "보";
		}
		if (user == 1) {
			if (computer == 3) {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("You win.");
			} else if (computer == 1) {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("drow");
			} else {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("You lose.");
			}
		} else if (user == 2) {
			if (computer == 1) {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("You win.");
			} else if (computer == 2) {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("drow");
			} else {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("You lose.");
			}
		} else if (user == 3) {
			if (computer == 2) {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("You win.");
			} else if (computer == 3) {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("drow");
			} else {
				System.out.println("나 => " + input + " pc => " + command);
				System.out.println("You lose.");
			}
		} else {
			System.out.println("잘못 입력하였습니다.");
		}

	}
}
