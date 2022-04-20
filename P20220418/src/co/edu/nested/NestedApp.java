package co.edu.nested;

import java.util.Scanner;

class Friend {
	String name;
	String phone;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}

//중첩클래스, 중첩인터페이스
public class NestedApp {

	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];

	interface FriendService {
		
		int ADD=1;
		int MOD=1;
		int LIST=1;
		
		void add();
		void modify();
		void list();

	}
	// 중첩클래스
	static class FriendApp implements FriendService {

		@Override
		public void add() {
			System.out.println("친구이름 >>>");
			String name = scn.next();
			System.out.println("연락처 >>>");
			String phone = scn.next();
			System.out.println("나이 >>>");
			int age = scn.nextInt();
			
			Friend a = new Friend();
			a.setName(name);
			a.setPhone(phone);
			a.setAge(age);
			//배열 비어있는 위치에 저장
			for(int i =0; friends[i].length; i++ ) {
				if (friends[i] == null) {
					friends[i] = a;
					break;
				}
			
			}
		}

		@Override
		public void modify() {
			
		}

		@Override
		public void list() {
			// 배열에 저장되어있는 값을 출력
			for(int i=0; i < friends.length; i++) {
				if (friends[i]!=null) {
				System.out.println(friends[i].toString());
				}
			}
		}
		
	}
	//
	public static void main(String[] args) {
		FriendApp app = new FriendApp();

		while(true) {
			System.out.println("1.추가 2.수정 3.리스트");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu ==  FriendService.ADD) {
				app.add();
			} else if (menu == FriendService.MOD) {
				app.modify();
			} else if (menu == FriendService.LIST) {
				app.list();
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
		
	}
	
	
	
	

}
