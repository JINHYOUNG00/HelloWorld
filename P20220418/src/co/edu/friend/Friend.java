package co.edu.friend;
// 친구의 주소록 관리 프로그램 : 이름, 연락처

// 학교친구 : 학교이름, 전공과목
// 회사친구 : 회사이름, 부서

public class Friend {
	// 부모 필드
	private String name;
	private String phoneNum;

	private Gender gender; // MEN, WOMEN

	// 부모 생성자
	protected Friend() {

	}

	public Friend(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public Friend(String name, String phoneNum, Gender gender) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.gender = gender;
	}

	// 메소드(게터엔 세터포함)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Gender getGender() { // enum Gender 타입.
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	// toString 생성
	@Override
	public String toString() {
		return "Friend [이름= " + name + ", 전화번호= " + phoneNum +" 성별= " + gender+"]";
	}

}
