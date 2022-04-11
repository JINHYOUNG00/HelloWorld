package co.edu.variable;

import java.util.Scanner;
// java.lang
public class IfExample3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scn.nextInt(); //사용자가 입력한 값을 읽고 int형 타입으로 반환하는 기능.
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scn.nextInt(); //사용자가 입력한 값을 읽고 int형 타입으로 반환하는 기능.
		
		// 큰 수에서 작은 수를 뺀 결과값을 result에 저장
		// result를 출력.
		int result;
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		System.out.println("큰 수와 작은 수의 차이는 "+ result);
		
		
		System.out.println("첫번째 입력값은 " + num1 + "입니다.");
		System.out.println("두번째 입력값은 " + num2 + "입니다.");
	}

}
