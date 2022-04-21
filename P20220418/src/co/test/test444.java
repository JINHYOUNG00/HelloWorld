package co.test;

public class test444 {
	//필드
	private String name;
	private String birth;
	private String phone;
	
	/// 생성자
	public test444(String name, String birth, String phone) {
		super();
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "test444 [name=" + name + ", birth=" + birth + ", phone=" + phone + "]";
	}

	
	
	
	
	
	
}
