package co.edu;

public class OperatorExample3 {

	public static void main(String[] args) {
		// 비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 20;
		
		if (num1 == num2) {
			System.out.println("두 수는 같습니다.");
		}
		
		if (num1 != num2) {
			System.out.println("두 수는 같지않습니다.");
		}		
		
		if (num1 >= num2) {
			System.out.println(num1 +"이 "+ num2 +"보다 큽니다.");
		}		
		
		num1 = 10;
		num2 = 20;
		
		if ((++num1 % 2 == 0) & (num2++ % 2 == 0)) { // && == AND, 하나의 값으로 답이 나오면 나머지값을 계산하지않는다. // & 값이 나와도 두개의 수 모두 계산함
			System.out.println("두수는 짝수입니다.");
		} else {
			System.out.println("두수가 모두 짝수는 아닙니다.");
			
		}
		
		System.out.println(num1 + ", " + num2);
		
		if ((++num1 % 2 == 0) || (num2++ % 2 == 0)) { // || == OR
			System.out.println("두수 중 하나는 짝수입니다.");
		} else {
			System.out.println("두수 모두 홀수입니다.");
			
		}
		
		System.out.println(num1 + ", " + num2);
	
		System.out.println("end of prog");
		
	}

}
