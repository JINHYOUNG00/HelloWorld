package co.edu.variable;

public class ifExample {

	public static void main(String[] args) {
		int myAge = 19;
		boolean over20; // 변수의 길이는 상관x 의미있는 변수명 사용. 변수의 첫글자는 대문자, 숫자 x
		over20 = myAge > 20; //over20 == myAge > 20
		
		if(over20) {
			System.out.println("over 20");
		} else {
			System.out.println("under 20");
		}
		
	}

}
