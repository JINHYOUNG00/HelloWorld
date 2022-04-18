package co.edu;

import co.edu.friend.Friend;


class Friend2 extends Friend {
	
	public Friend2() { //protected는 상속관계에서 다른 패키지에서도 사용가능 , default는 불가.
		super(); // 생성자 호출.
		this.getName(); //protected
	}
}

public class ModifierExample {

	public static void main(String[] args) {

//		Friend friend = new Friend(); //default 에서는 다른 패키지에서 접근 불가 다른 패키지에서도 접근가능하게 하려면 public 으로 바꿔줘야함
	}

}
