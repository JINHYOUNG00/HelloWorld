package co.edu;

public class OperatorExample2 {

	public static void main(String[] args) {
//		 십진수 10을 2진수로 표현하면 00001010.
		int num10 = 10;
		System.out.println(~num10); //비트 반전 연산자 ~ 11110101 = -11
		
		boolean isTure = false;
		isTure = !isTure; //true
		isTure = !isTure; //false
		isTure = !isTure; //true
//		isTure = !isTure; //false
		System.out.println(isTure);
		
		if(!(num10 > 5)) {   // 논리값의 부정값을 취하는 연산자 !
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		
	}

}
