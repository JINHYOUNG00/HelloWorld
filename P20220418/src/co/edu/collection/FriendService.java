package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

public interface FriendService {
	//추가 수정 삭제 조회
	Scanner scn = new Scanner(System.in);
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name);
}
