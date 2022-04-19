package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

//배열 기능 활용
public class FriendServiceArray implements FriendService {
	Friend[] friends = new Friend[10];
	Scanner scn = new Scanner(System.in);

	@Override
	public void addFriend(Friend friend) {

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

	}

	@Override
	public void modFriend(Friend friend) {
		System.out.print("수정할 친구 이름=> ");
		String fName2 = scn.nextLine();
		System.out.print("수정할 친구 연락처=> ");
		String fPhone2 = scn.nextLine();
		Friend modFriend = new Friend(fName2, fPhone2)
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(fName) && friends[i].getPhoneNum().equals(fPhone)) {
				fName = fName2;
				fPhone = fPhone2;
			}
		}
		Friend a = new Friend(fName, fPhone);
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
			friends[i] = a;
			}
		}

	}

	@Override
	public void remFriend(String name) {
	
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
			}
		}


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

}
