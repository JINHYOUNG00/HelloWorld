package co.edu.variable;

import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
//		입력값을 num1, num2, num3
		Scanner scn = new Scanner(System.in); // 임포트 단축키 컨트롤 시프트 o
		
		int num1, num2, num3;
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scn.nextInt();
		System.out.println("세번째 정수를 입력하세요.");
		num3 = scn.nextInt();
		//정수연산 => 정수. 10, 15, 15 => 40/3.0 => 13.3333
		double avg;
		avg = (num1 + num2 + num3) /3.0;
		
		String myName = "홍길동";
		int age = 20;
		
		System.out.println("입력한 세 정수는 " + num1 + ", " + num2 + ", " + num3 + "이고 평균은 " + avg + "입니다.");
		System.out.printf("이름은 %3s이고 평균은 %.2f이고 나이는 %2d", myName, avg, age); //90페이지에 설명 있음
		System.out.printf("입력한 세 정수는 %3d, %3d, %3d 이고 평균은 %.2f 입니다.", num1, num2, num3, avg);
		//결과값 : 입력한 세 정수는 10, 15, 15 이고 평균은 13.33333 입니다.
		
		
	}

}
