package co.edu.variable;

import java.util.Scanner;

public class OpentorExample {

	public static void main(String[] args) {
		// 나머지: %
		// 6/4 => 몫 1 나머지 2
		int result = 6 / 4;
		int result2 = 6 % 4;
		
		int val = 5;
		if(val % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		// 75,300 원.
		// 5만원권 => ?장, 1만원권 => ?장, 5천원권 => ?장
		// 1천원권 => ?장, 5백원 => ?개, 1백원=> ?개
		
		// 75300원 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개.
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		int val2 = scn.nextInt();
		int a = 50000;
		int b = 10000;
		int c = 5000;
		int d = 1000;
		int e = 500;
		int f = 100;
		
		int g = val2 / a; // 75300/50000 = 1
		
		int g1 = val2 % a; // 75300/50000 의 나머지 == 25300
		int h = g1/ b; // 25300/10000 == 2
		int h2 = g1 % b; //25300/10000의 나머지 5300
		int i = h2/ c; // 5300/5000 == 1
		int i2 = h2 % c; //5300/5000의 나머지 == 300
		int j = i2 / d;
		int j2 = i2 % d;
		int k = j2 / d;
		int k2 = j2 % d;
		int l = k2 / f; //300/100 == 3
		
		System.out.printf("%5d원 5만원권 %1d개, 1만원 %1d개, 5천원 %1d개, 1천원 %1d개, 5백원 %1d개, 1백원 %1d개", val2, g,h,i,k,j,l );
		
		  
	}

}
