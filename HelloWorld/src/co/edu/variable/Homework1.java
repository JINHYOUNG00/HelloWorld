package co.edu.variable;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("오렌지의 수를 입력하시오.");
		int org = scn.nextInt();
		
		int box1 = 10;
		int box2 = 5;
		
		int val1 = org / box1; // 오렌지 수 / 10
		int val2 = org % box1; // 오렌지 / 10 의 나머지
		int val3 = val2 / box2; 
		
		System.out.printf("%3d개의 오렌지는 10개 박스에 %2d번, 5개 박스에 %2d번 담을 수 있다.",org, val1, val3 );
	}

}
//오렌지 127개 o
//10개씩 담을 수 있는 상자 o
//5개씩 담을 수 있는 상자 o

