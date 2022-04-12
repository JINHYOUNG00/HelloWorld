package co.edu.loop;

public class ForExample3 {

	public static void main(String[] args) {
//			1~100 반복
//			최초로 1000보다 큰 값이 되면 출력
		int sum = 0;
		int cnt = 0; // 1000을 넘어설때 순번을 저장하는 변수
		for (int i = 1; i <=100; i++) {
			sum += i;
			if (sum >= 1000) {
				cnt = i;
				break;
			}
		}
		System.out.println("1000보다 큰 최초의 값은 " + sum + " 순번: " + cnt);
					
//		for (int i = 1; i <=100; i++) {
//			sum += i;
//			if (sum >= 1000) {
//				System.out.println("1000보다 큰 최초의 값은 " + sum + " 순번: " + i);
//				break;
//			}
//		}
		// 1~10번을 반복
		// sum = sum * 1;
		sum = 1;		
		for (int i = 1; i<=10; i++) {
			sum = sum * i;
		}
		System.out.println("1 ~ 10까지 곱한 결과 => " + sum);
		
		// 숫자 100의 약수를 출력하도록.
		for (int i = 1; i <= 100; i++) {
			if (100 % i == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}

}
