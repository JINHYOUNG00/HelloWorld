package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService { // 인터페이스 FriendService 구현객체
	Scanner scn = new Scanner(System.in);

	ArrayList<Friend> friends = new ArrayList<Friend>();

	@Override
	public void addFriend(Friend friend) { //newFriend
//		for (int i = 0; i < friends.size(); i++) {
			friends.add(friend);
//			break;
//		}
	}

	@Override
	public void modFriend(Friend friend) {
		System.out.print("수정될 친구 이름=> ");
		String fName2 = scn.nextLine();
		System.out.print("수정될 친구 연락처=> ");
		String fPhone2 = scn.nextLine();
		Friend modFriend = new Friend(fName2, fPhone2);
		
		for(int i=0;i<friends.size();i++) {
			//Friend findFriend = (Friend) friends.get(i); //
			if(friends.get(i).getName().equals(friend.getName())) {
				friends.set(i, modFriend);
			}
			System.out.println("수정 완료");
			System.out.println();
		}

	}

	@Override
	public void remFriend(String name) {
		Friend remFriend = new Friend(name, null);
		for(int i=0;i<friends.size();i++) {
			if(friends.get(i).getName().equals(name)) {
				friends.remove(i);
			}
		}

	}

	@Override
	public Friend findFriend(String name) {
//		Friend searchFriend = new Friend(name, null);
		
		for (int i=0;i<friends.size();i++) {
			if (friends.get(i).getName().equals(name)) {
				return friends.get(i); //System.out.println(friends.get(i)) 이전 입력(오류);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		
		for(int i=0; i<friends.size();i++) {
			if(friends.get(i).getGender() == gender) /*.equals(gender)*/ {
				// 열거형타입 클래스타입 같은 참조 데이터타입
				// 기본타입 == 비교연산자
				// 열거형 == 비교연산자로 비교.
				list.add(friends.get(i));
				
				
			}
		}
		return list;
	}

}
