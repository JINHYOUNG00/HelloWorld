package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

// 컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService { // 인터페이스 FriendService 구현객체
	Scanner scn = new Scanner(System.in);

	ArrayList friends = new ArrayList();

	@Override
	public void addFriend(Friend friend) {
		

		Friend a = new Friend(name, phoneNum);
		for (int i = 0; i < friends.size(); i++) {
			friends.add(a);
			break;
		}
	}

	@Override
	public void modFriend(Friend friend) {

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
				System.out.println(friends.get(i));
			}
		}
		return null;
	}

}
