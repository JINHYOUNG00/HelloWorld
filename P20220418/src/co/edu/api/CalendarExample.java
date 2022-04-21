package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		
		int year =2020;
		int month = 5;
		
		Calendar today = Calendar.getInstance();
		today.set(year, month-1, 1);
		
		System.out.println("년도 " + today.get(Calendar.YEAR));
		System.out.println("월 " + today.get(Calendar.MONTH));
		System.out.println("일 " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막날 "+ today.getActualMaximum(Calendar.DATE));
		
		/////////////
		
		Date todate = new Date();
		todate = new Date("2021/05/05");
		todate.setYear(2022); //1900 기준으로 2022를 더해서 3922가 나옴
		System.out.println(todate.toString());
		
		LocalDate ldate = LocalDate.of(2022,10,10);
		System.out.println(ldate.toString());
		
		LocalTime ltime = LocalTime.of(10, 10, 10);
		System.out.println(ltime.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = LocalDateTime.of(2022, 10,5, 10, 20, 30);
		
		System.out.println(ldt);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");  //형식제공을 하려면 DateTimeFormatter로 포멧을 제공해야함
		System.out.println(ldt.format(dtf));
		
		
		
		
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(sdf);
//		
		
	}
}
