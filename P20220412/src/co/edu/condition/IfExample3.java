package co.edu.condition;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
//		중첩 구문.
//		90 이상 A 80이상 B 70이상 C 나머지 F 
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		int score = scn.nextInt();
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점.");
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B학점.");
			}
		} else if(score >= 70) {
			if(score >= 75) {
				System.out.println("C+학점");
			} else {
				System.out.println("C학점.");
			}
		} else {
			System.out.println("F학점.");
		}
		
		
				
		
		
		
		
		
		
	}

}
