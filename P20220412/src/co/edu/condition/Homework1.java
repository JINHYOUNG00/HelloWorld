package co.edu.condition;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("1 ~ 6 사이 숫자 하나를 입력하시오");
		int input = scn.nextInt();
		int randomVal = (int) (Math.random() * 6) + 1;

		if (input == randomVal) {
			System.out.println("입력한 숫자 " + input + " 정답입니다.");
		} else {
			System.out.println("입력한 숫자: " + input + " 주사위 숫자: " + randomVal + " 오답입니다.");
		}
	}

}
