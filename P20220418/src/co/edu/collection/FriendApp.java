package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 친구목록 저장하기 위한 App.
// 추가, 수정, 삭제, 조회
// 1)배열 2)컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//		FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();

		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자일괄조회 6.여자일괄조회");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == FriendService.ADD) { // 인터페이스에서 이름을 지정하여 입력.
				System.out.print("추가할 친구 이름 => ");
				String name = scn.nextLine();
				System.out.print("추가할 친구 연락처=> ");
				String phoneNum = scn.nextLine();
				System.out.print("성별 ex)남자 / 여자=> ");
				String gender = scn.next();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend newFriend = new Friend(name, phoneNum, gen);
				service.addFriend(newFriend);

			} else if (menu == FriendService.MOD) {
				System.out.print("수정할 친구 이름 => ");
				String name = scn.nextLine();
				System.out.print("수정할 친구 연락처=> ");
				String PhoneNum = scn.nextLine();

				Friend modFriend = new Friend(name, PhoneNum); // modFriend의 매개값을 위한 생성
				service.modFriend(modFriend);

			} else if (menu == FriendService.DEL) {
				System.out.println("삭제할 친구 이름=> ");
				String name = scn.nextLine();
				service.remFriend(name);
			} else if (menu == FriendService.SEARCH) {
				System.out.println("조회할 이름 => ");
				String name = scn.nextLine();

				Friend searchFriend = service.findFriend(name); // 이게 뭐야
				// service.findFriend(null);
				if (searchFriend != null) { //
					System.out.println(searchFriend.toString());//
				} 

			} else if (menu == FriendService.FIND_MEN) {
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
					
			} else if (menu == FriendService.FIND_WOMEN) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
