package co.edu.loop;

public class ForExample2 {

	public static void main(String[] args) {
//			1~100 반복..
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i == 31) {
				break; //반복문 종료
			}
			if (i % 2 == 0) {
				System.out.println("현재 i 값 -> " +i);
				continue; // 구문 아래 코드 실행 없음
			}
			sum = sum + i;
		}
		System.out.println("sum => " + sum);
		
	}

}
