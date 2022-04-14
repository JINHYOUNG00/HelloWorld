package co.edu;

public class Member {

	// 필드 => 회원아이디, 회원이름, 회원연락처, 회원나이.
	private String memberId;
	private String membername;
	private String memberPhone;
	private int memberAge; // 음수값이 들어가면 안됨

	// 생성자
	public Member(String memberId, String membername, String memberPhone, int memberAge) {
		super();
		this.memberId = memberId;
		this.membername = membername;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}

	void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	String getMemberiId() {
		return memberId;
	}
	
	void setMemberAge(int age) {
		if (age < 0) {
			memberAge = 10;
		} else {
			memberAge = age;
		}
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberId() {
		return memberId;
	}

	int getMemberAge() { //age가 int 타입이기 때문
		return memberAge;
	}

	// 메소드
	void showInfo() {
		System.out.printf("회원아이디: %6s\n회원이름: %3s\n연락처: %13s \n나이: %2d\n", memberId, membername, memberPhone, memberAge);
	}

}
