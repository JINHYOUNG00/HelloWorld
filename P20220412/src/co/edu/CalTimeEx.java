package co.edu;

import java.util.Scanner;

public class CalTimeEx {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("초를 입력하시오.");
		int time = scn.nextInt();
		// 시, 분, 초 => 5000초 5000/(60*60) => ?시간
		// 남은시간 => 5000%(60*60) => 1400/60 => ?분
		// 초 =>
		
		int hours, mins, secs;
		hours = time / (60 * 60); // 1시간으로 나누기 연산
		time = time % (60 * 60); // 연산결과의 나머지를 time값에 대입
		
		mins = time / 60; // 1분으로 나누기연산 (대입된 time 값을 60으로 나눔) 
		time = time % 60; // 연산결과 나머지를 time값에 대입
		
		secs = time; 
		
		System.out.printf("%2d시 %2d분 %2d초",hours, mins, secs);
		
		
						
	}

}
