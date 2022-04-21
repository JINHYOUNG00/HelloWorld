package co.edu.api;

import java.util.Calendar;

public class MyCalender {

	public static void main(String[] args) {

		String y = "2020";
		String m = "02"; //"06" | "6"; //06 또는 6;
		
		showCal(y,m);
				
	}
	public static void showCal (String year, String month) {
		//달력출력
		Calendar cal = Calendar.getInstance();
			
		
		
		cal.getActualMaximum(Calendar.DATE); // 마지막날
		
		
		
		System.out.println(year+"년 "+month+"월");
		
		
		
		
		
		
		
		
	}

}
