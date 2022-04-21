package co.test;

import java.util.Scanner;

public class test111 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 코드 작성.
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = scn.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2 = scn.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int num3 = scn.nextInt();
		int max = num1;
				if (max<2){
				}
		
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("세 수중 가장 큰값은 " + num1 + " 입니다.");
			} else {
				System.out.println("세 수중 가장 큰값은 " + num3 + " 입니다.");
			}
		} else {
			if (num2 > num3) {
				System.out.println("세 수중 가장 큰값은 " + num2 + " 입니다.");
			} else {
				System.out.println("세 수중 가장 큰값은 " + num3 + " 입니다.");
			} 
		}
		
	}
}
