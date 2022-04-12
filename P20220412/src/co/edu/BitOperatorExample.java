package co.edu;

public class BitOperatorExample {

	public static void main(String[] args) {

		int num = 8;
		
		int result = num << 2; // 비트연산 00001000 => 00100000
		
		System.out.println(result);
				
		int result2 = num >> 2; // 비트연산 00001000 => 00000010
		
		System.out.println(result2);
		
		
	}

}
