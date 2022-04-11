package co.edu.variable;

import java.util.Scanner;

public class ChangeCToF {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double c, f;
		System.out.println("화씨온도를 입력하시오");
		f = scn.nextDouble();
		
		c = 5.0/9 * ( f - 32); // 정수.
		
		System.out.printf("섭씨온도는 %.1f 입니다.", c);
		
		
		
	}

}
