package co.edu.condition;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = scn.nextInt();
		
		// 2의 배수인지 3의 배수인지 2와 3의 공통배수인지 체크하는 프로그램
		
		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println(num+"은(는) 2와 3의 공통배수입니다.");
		}else if (num % 2 == 0) {
			System.out.println(num+"은(는) 2의 배수입니다.");
		}else if(num % 3 == 0) {
			System.out.println(num+"은(는) 3의 배수입니다.");
		}else {
			System.out.println(num+"은(는) 2와 3의 배수가 아닙니다.");
		}
		
//		if (num % 6 == 0) {
//			System.out.println("2와 3의 공통배수입니다.");
//		}else if (num % 2 == 0) {
//			System.out.println("2의 배수입니다.");
//		}else if(num % 3 == 0) {
//		System.out.println("3의 배수입니다.");
//		}else {
//			System.out.println("2와 3의 배수가 아닙니다.");
//		}	
		
	}

}
