package co.edu.api;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// 주민번호가 들어오면 생년월일, 남or여 구분정보
		Scanner scn = new Scanner(System.in);
		System.out.print("주민등록번호 >>>");
		String ssn = scn.nextLine();
		String result = checkInfo(ssn);
		System.out.println(result);
//		System.out.println("99년생 10월 1일생, 남자입니다.");
		
		//950405-2341566 => 1995년생 4월 5일 생, 여자입니다.
		//991001-1111111 => 1999년생 10월 1일 생, 남자입니다.

		//9704051234567 => 1997년생 4월 5일 생, 남자입니다.
		//0505053456789 => 2005년생 5월 5일 생, 남자입니다.
		
	}
		public static String checkInfo(String ssn) {
			
			String bYear = ssn.charAt(0)+""+ssn.charAt(1);
			String bMonth = ssn.charAt(2)+""+ssn.charAt(3);
			String bDay = ssn.charAt(4)+""+ssn.charAt(5);
			String sex = ssn.charAt(6)+"";
			String sex3 = null;
			int sex2 = 0;
			int bMonth2 = Integer.parseInt(bMonth);
			int bDay2 = Integer.parseInt(bDay);
			
			if (ssn.indexOf("-") != -1) { // indexOf - 문자열에 해당 문자가 있는지 여부.
				sex = ssn.charAt(7)+"";
				sex2 = Integer.parseInt(sex);
			} else {
				sex = ssn.charAt(6)+"";
				sex2 = Integer.parseInt(sex);
			}
			
			
				if(ssn.indexOf("-") != -1 && bMonth2 < 10) {
					bMonth2 = Integer.parseInt(bMonth);
				}
				if(ssn.indexOf("-") != -1 && bDay2 < 10) {
					bDay2 = Integer.parseInt(bDay);
				}
			
			
				
			
			if (Integer.parseInt(bYear) > 50) { // 99년생까지
				if (sex2 == 1) {
					sex3 = "남자";
				} else if (sex2 == 2) {
					sex3 = "여자";
				} else {
					System.out.println("잘못된 입력");
				}
			}else if (Integer.parseInt(bYear) < 50) {//00년생부터
				if (sex2 == 3) {
					sex3 = "남자";
				} else if (sex2 == 4) {
					sex3 = "여자";
				} else {
					System.out.println("잘못된 입력");
				}
			}
		
		return bYear+"년"+bMonth2+"월"+bDay2+"일 생 " +sex3+"입니다.";
//		return "95년생 4월 5일 생, 여자입니다.";
	}
		
}	
		
		
		

	
	

