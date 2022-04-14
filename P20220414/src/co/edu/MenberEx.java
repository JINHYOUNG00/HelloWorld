package co.edu;

import java.util.Scanner;

public class MenberEx {

	public static void main(String[] args) {

		Member m1 = new Member("urer1","홍길동","010-1234-1234",24);
		m1.setMemberAge(24);
		m1.setMemberId("user01");
//		System.out.println("나이" + m1.getMemberAge());
//		System.out.println(m1.getMemberiId());
//		System.out.println();
//		m1.showInfo();
		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[2];
		
		// 사용자가 값을 입력하는 단계
		for(int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 입력. > ");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
//			String strAge = scn.next()
			int age = Integer.parseInt(scn.next());
			Member a = new Member(id, name, phone, age);
			
			members[0] =a;
		}
		
		for(Member member : members) {
			member.showInfo();
		}
		System.out.println("end of prog");
		
		
	}
	

}
