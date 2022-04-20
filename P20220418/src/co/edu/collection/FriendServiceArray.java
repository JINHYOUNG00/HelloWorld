package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//배열 기능 활용
public class FriendServiceArray implements FriendService {
	Friend[] friends = new Friend[10];
	

	@Override
	public void addFriend(Friend friend) {
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break; //return;
			}
		}

	}

	@Override
	public void modFriend(Friend friend) {
		System.out.print("수정될 친구 이름=> ");
		String fName2 = scn.nextLine();
		System.out.print("수정될 친구 연락처=> ");
		String fPhone2 = scn.nextLine();
		Friend modFriend = new Friend(fName2, fPhone2);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friend.getName()) && friends[i].getPhoneNum().equals(friend.getPhoneNum())) {
				friends[i] = modFriend;
			}
		
		}
		System.out.println("수정 완료");
		System.out.println();
	}

	@Override
	public void remFriend(String name) {
	
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
			}
		}
		System.out.println("삭제 완료");
		System.out.println();
	}

	@Override
	public Friend findFriend(String name) {
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				System.out.println(friends[i].toString());
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		for(int i = 0; i<friends.length;i++) {
			if(friends[i] != null && friends[i].getGender() == gender) {
				System.out.println(friends[i].toString());
			}
		}

		
		return null;
	}

}
