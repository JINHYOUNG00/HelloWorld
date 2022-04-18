package co.edu.friend;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int intAry[] = new int[5];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) ((Math.random() * 5) + 1);

			for (int j = 0; j < i; j++) {
				if (intAry[i] == intAry[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.println("값을 입력하세요");
			int input = scn.nextInt();
			scn.nextLine();
			if (input == i + 1) {
				if (intAry[i] == 5) {
					System.out.println("정답입니다.");
				} else {
					System.out.println("오답입니다.");
				}
				break;
			}
		}
	}
}
