package co.edu.loop;

public class ForExample {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1 ; i <= 5; i++) { //(초기화식; 조건식; 증감식)
			
			sum = sum + 3; // 실행문
			// i = 1 => sum = 3
			// i = 2 => sum = 6
			// i = 3 => sum = 9
			// i = 4 => sum = 12
			// i = 5 => sum = 15
			// i = 6 => 조건이 만족하지않아서 for 구문 종료
		}
	
		System.out.println("sum => " + sum);
		// 3단(역순)
		for (int i = 9 ; i>=1; i--) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
		
		System.out.println("=======================");
		// 5단
		int val = 5;
		for (int i = 1; i <=9; i++) {
			System.out.println(val + " * " + i + " = " + (5 * i));
		}
		
		System.out.println("=======================");
		
		sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
		System.out.println("=======================");
		sum = 0;
		for (int i = 1; i <= 9; i+=2) {     // i += 2 == i = i + 2
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println("=======================");
		System.out.println(sum);
		System.out.println("=======================");
		
		sum = 0;
		for (int i = 2; i <= 10; i+=2) {     // i += 2 == i = i + 2
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println("=======================");
		System.out.println(sum);
		System.out.println("=======================2");
		
		sum = 0;
		for (int i = 1; i <= 10; i++) {     // i += 2 == i = i + 2
			if (i%2 == 0) {
			sum = sum + i;
			System.out.println(i);
			}
		}
		System.out.println("=======================");
		System.out.println(sum);
		System.out.println("=======================");
	
		
		
		
	}

}
