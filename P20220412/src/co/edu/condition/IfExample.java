package co.edu.condition;

public class IfExample {

	public static void main(String[] args) {

		// 90점 보다 크면 A 80보다 크면 B 70보다 크면 C 나머지는 F
		int score = 85;

		if(score >= 90) {
			System.out.println("A학점.");
		} else if(score >= 80) {
			System.out.println("B학점.");
		} else if(score >= 70) {
			System.out.println("C학점.");
		} else {
			System.out.println("F학점.");
		}
		
		// 구분. 위는 해당하는 값을 한번 계산하고 아래는  if 구문을 4번 다 계산한다.
		if(score >= 90) {
			System.out.println("A학점.");
		}
		if(score >= 80) {
			System.out.println("B학점.");
		}
		if(score >= 70) {
			System.out.println("C학점.");
		}
		if(score < 70) {
			System.out.println("F학점.");
		}

		
		
		
		
		
	}

}
