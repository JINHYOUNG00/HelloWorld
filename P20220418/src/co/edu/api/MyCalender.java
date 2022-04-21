package co.edu.api;

import java.util.Calendar;

public class MyCalender {

	public static void main(String[] args) {

		String y = "2021";
		String m = "2"; //"06" | "6"; //06 또는 6;
		
		showCal(y,m);
				
	}
	public static void showCal (String year, String month) {
		//달력출력
		Calendar cal = Calendar.getInstance();
		int year2 = Integer.parseInt(year);
		int month2 = Integer.parseInt(month) -1 ;
		cal.set(year2, month2, 1);////////////////// cal 초기 세팅
		String[] days = {"일","월","화","수","목","금","토"};
		int lastDay = cal.getActualMaximum(Calendar.DATE); // 마지막날
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //첫째주 시작요일
		int[] intAry = new int[lastDay]; //일수 만큼 배열 생성
		// 배열값 지정
		for (int i=0; i<intAry.length;i++) {
			intAry[i] = i+1;
		}
		// 요일출력
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		
		// 시작 날짜에 따른 공백 추가
		int spaces = firstWeek-1;
		for (int i = 0; i < spaces; i++) {
			System.out.printf("%4s", "*");
		}
		// 출력문
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf("%4d", intAry[i]);
			if ((i + spaces) % 7 == 6) { // i+공백을 7로 나눴을때 나머지가 6일때 줄바꿈한다.
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
