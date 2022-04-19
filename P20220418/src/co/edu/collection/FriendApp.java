package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

// 친구목록 저장하기 위한 App.
// 추가, 수정, 삭제, 조회
// 1)배열 2)컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		FriendService service = new FriendServiceArray();
//		FriendService service = new FriendServiceList();

		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if (menu == 1) {
				System.out.print("추가할 친구 이름 => ");
				String name = scn.nextLine();
				System.out.print("추가할 친구 연락처=> ");
				String phoneNum = scn.nextLine();
				
				Friend newFriend = new Friend(name,phoneNum);
				service.addFriend(newFriend);
				
			} else if (menu == 2) {
				System.out.print("친구 이름 => ");
				String name = scn.nextLine();
				System.out.print("추가할 친구 연락처=> ");
				String PhoneNum = scn.nextLine();
				
				Friend modFriend = new Friend(name, PhoneNum);
				service.modFriend(modFriend);
				
			} else if (menu == 3) {
				System.out.println("삭제할 친구 이름=> ");
				String name = scn.nextLine();
				service.remFriend(null);
			} else if (menu == 4) {
				System.out.println("조회할 이름 => ");
				String name = scn.nextLine();
				service.findFriend(null);
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
