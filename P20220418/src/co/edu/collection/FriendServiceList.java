package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

// 컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService { // 인터페이스 FriendService 구현객체
	Scanner scn = new Scanner(System.in);

	ArrayList friends = new ArrayList();

	@Override
	public void addFriend(Friend friend) { //newFriend
		
		for (int i = 0; i < friends.size(); i++) {
			friends.add(friend);
			break;
		}
	}

	@Override
	public void modFriend(Friend friend) {
		System.out.print("수정될 친구 이름=> ");
		String fName2 = scn.nextLine();
		System.out.print("수정될 친구 연락처=> ");
		String fPhone2 = scn.nextLine();
		Friend modFriend = new Friend(fName2, fPhone2);
		
		for(int i=0;i<friends.size();i++) {
			if(friends.get(i).equals(friend)) {
				friends.set(i, modFriend);
			}
			System.out.println("수정 완료");
			System.out.println();
		}

	}

	@Override
	public void remFriend(String name) {
		
		for(int i=0;i<friends.size();i++) {
			if(friends.get(i).equals(name)) {
				friends.remove(i);
			}
		}

	}

	@Override
	public Friend findFriend(String name) {
		for (int i=0;i<friends.size();i++) {
			if (friends.get(i).equals(name)) {
				return (Friend) friends.get(i); //System.out.println(friends.get(i)) 이전 입력(오류);
			}
		}
		return null;
	}

}
