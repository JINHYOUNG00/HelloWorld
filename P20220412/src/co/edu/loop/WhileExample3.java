package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		// Math.random()의 생성범위 1 ~ 10 까지가 되도록; => randomVal
		// 사용자의 입력값을 담는 변수 userVal
		
		// while 구문을 이용해서 임의의 값과 입력값이 같으면 종료.
		// 사용자 값과 랜덤값 비교... 입력값이 랜덤값 보다 크다 혹은 작다를 출력
		// 랜덤이 만들어준 값을 맞추는 게임.
		
		int randomVal = (int) (Math.random() * 10) +1;
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = true;
			
		while(isTrue) {
			System.out.println("정수를 입력하세요.");
			int userVal = scn.nextInt();
			if(randomVal == userVal) {
				System.out.println("정답입니다. 정답은 " + randomVal);
				break;
			}
			if (userVal > randomVal) {
				System.out.println("입력값이 랜덤값보다 큽니다.");
			} else if (userVal < randomVal) {
				System.out.println("입력값이 랜덤값보다 작습니다.");
			}
				
				
		}
		
		
		
		
		
		
	}

}
