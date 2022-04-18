package co.edu.friend;

import java.util.Scanner;


public class FriendList {

	public static void main(String[] args) {
		
		final String val = "Hong";
//		val = "Hong2";  값이 할당되면 값을 바꿀수없음/

		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동", "010-1111-2222", "대구대", "컴정");
//		friends[1] = new ComFriend("김깅동", "010-2132-5465", "네이버", "개발팀");
//		friends[2] = new Friend("박길동","010-5216-4544");
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if (menu == 1) {
				
				Friend friend = null;
				System.out.println("친구를 만난 위치를 입력하세요 ex)회사, 학교, 기타");
				String type = scn.nextLine();

				if (type.equals("회사")) {
					System.out.println("이름을 입력하세요");
					String name = scn.nextLine();
					System.out.println("전화번호를 입력하세요");
					String phoneNum = scn.nextLine();
					System.out.println("회사이름을 입력하세요");
					String company = scn.nextLine();
					System.out.println("부서를 입력하세요");
					String department = scn.nextLine();

					Friend a = new ComFriend(name, phoneNum, company, department);
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = a;
							break;
							}
					}
					System.out.println("정상입력되었습니다.");
					
				} else if (type.equals("학교")) {
					
					System.out.println("이름을 입력하세요");
					String name = scn.nextLine();
					System.out.println("전화번호를 입력하세요");
					String phoneNum = scn.nextLine();
					System.out.println("학교를 입력하세요");
					String univ = scn.nextLine();
					System.out.println("학과를 입력하세요");
					String major = scn.nextLine();

					Friend a = new UnivFriend(name, phoneNum, univ, major);
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = a;
							break;
							}
					}
					System.out.println("정상입력되었습니다.");
					
				} else if (type.equals("기타")) {
					System.out.println("이름을 입력하세요");
					String name = scn.nextLine();
					System.out.println("전화번호를 입력하세요");
					String phoneNum = scn.nextLine();
					Friend a = new Friend(name, phoneNum);

					for (int i = 0; i < friends.length; i++) {
						if (friends[i] != null) {
						friends[i] = a;
						break;
						}
					}
					System.out.println("정상입력되었습니다.");
				} else {
					System.out.println("잘못된 입력입니다.");
				}

			} else if (menu == 2) {
				for (int i=0; i<friends.length;i++) {
					if (friends[i] != null) {
						System.out.println("친구정보: " + friends[i].toString());
					}
				}
			} else if (menu == 3) {
				System.out.println("이름을 입력하세요.");
				String name = scn.nextLine();
						
				for(int i = 0; i<friends.length;i++) {
				}
				
				

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
