package co.edu.variable;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("오렌지의 수를 입력하시오.");
		int org = scn.nextInt();
		int org2 = org;
		int box1 = 10;
		int box2 = 5;
		
		int x10box = org / box1; 
		org = org % box1;
		int x5box = org / box2;
		org = org % box2;
		int x5box2;
		
		if(org > 0) {
			x5box2 = x5box + 1;
		} else {
			x5box2 = x5box;
		}
		System.out.printf("%3d개의 오렌지는 10개 박스 %2d개, 5개 박스 %2d개에 담을 수 있다.",org2, x10box, x5box2);
	}
	
}
//		int val1 = org / box1; // 오렌지 수 / 10
//		int val2 = org % box1; // 오렌지 / 10 의 나머지
//		int val3 = val2 / box2;
//		int val4;
				
//		if(val3%5 > 0) {
//			val4 = val3 + 1;
//		} else {
//			val4 = val3;
//		}
		
//오렌지 127개 o
//10개씩 담을 수 있는 상자 o
//5개씩 담을 수 있는 상자 o

