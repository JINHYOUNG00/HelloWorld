package co.edu.friend;

public class ComFriend extends Friend {

	private String company;
	private String department;

	public ComFriend() {
		super();
	}
	
	public ComFriend(String name, String phoneNum, String company, String department) {
		super(name, phoneNum);
		this.company = company;
		this.department = department;
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void setPhoneNum(String phoneNum) {
//	super.setPhoneNum(phoneNum)
		super.setPhoneNum("연락처는 " + phoneNum);
	}
	
//	public void setName(String name) { 
//		super.setName("이름은 " + name);
//	}
//	부모메소드에 final이 붙어서 메소드 재정의 불가
	
	
	@Override
	public String toString() { //자식클래스에서 getName을 따로 정의하지않았기때문에 super 대신 this 를 써도 무관함
		return "ComFriends [name="+ super.getName()+ " phoneNum="+super.getPhoneNum()+" company= " + company + ", department=" + department + "]";
	}
	
	
	
	
	
}
