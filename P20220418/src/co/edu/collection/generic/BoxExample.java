package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;

class Orange extends Object {
	
}


public class BoxExample {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		box.setField("Orange");
		String result = (String) box.getField(); //리턴되는 타입은 Object라서 String 으로 받으려면 형변환 해줘야함
	
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 = box2.getField();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김김동");
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동","010-1313-4634"));
		
//		Orange orange = (Orange) box.getField(); //Object -> Orange로 변환 가능.
		
		System.out.println("end of prog");
	}

}
