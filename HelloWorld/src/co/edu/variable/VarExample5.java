package co.edu.variable;

public class VarExample5 {

	public static void main(String[] args) {

		int val = 2147483647; // 4 * 1byte => 1byte = 8 * bit; 값이 on/off
		
		System.out.println(val);
		
		long val2 = 12313215643123L; //int형으로 담을수없는 long형은 마지막에 L 붙여써야함
		long val3 = 10; //10을 long으로 변환(promotion:자동형변환)
		
		int val4 = (int) 2147483648L; //long 값을 int 값으로 (casting:강제형변환) int 범위를 벗어나면 값의 손실이 있을수있다.
		
		int result = (int) (100L /5) ; //long형과 long형을 계산하면 결과도 long이기때문에 int로 결과값을 얻을려면 캐스팅 해줘야함 
		
		long val5 = 10000000000L;
		long val6 = 10L;
		
		result = (int) (val5 - val6); // casting
		
		char charLit = 97; //0 ~ 65535 까지 정수값에 
		charLit = 44032;
		
				
		System.out.println(val2);
		System.out.println(val4);
		System.out.println(result);
		System.out.println();
		
		System.out.println(charLit);
		System.out.println((int)charLit);
		System.out.println();
		
		System.out.println(charLit++);
		System.out.println((int)charLit);
		System.out.println(charLit++);
		System.out.println((int)charLit);
		System.out.println(charLit++);
		System.out.println((int)charLit);
		System.out.println(charLit++);
		System.out.println((int)charLit);
		System.out.println(charLit++);
		System.out.println((int)charLit);
		System.out.println(charLit++);
		System.out.println((int)charLit);
		System.out.println(charLit++);
		System.out.println((int)charLit);
	}

}
