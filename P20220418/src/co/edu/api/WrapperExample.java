package co.edu.api;

public class WrapperExample {

	public static void main(String[] args) {
		//랩퍼클래스
		//기본데이터 -> 참조데이터로
		// int, long, byte, float -> Integer, Long, Byte, Float;
		
		int n1 = 100;
		Integer n2 = 200; //클래스 타입// Integer n2 = new Integer(200); // 랩퍼타입으로 변형하는걸 박싱이라고한다.
		n1 = n2; //언박싱 과정을 거쳐서 
		byte b1 = n2.byteValue(); // byte타입으로 리턴
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(b1);
	
		Float f1 = 12.F;
		
		Integer.parseInt("100");
		Double.parseDouble("123.345");
		
		
	
	}
}
