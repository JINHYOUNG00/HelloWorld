package co.edu;

public class Student {
	//필드
	String name;
	String studNo;
	int age;
	double height;
	
	//생성자(constructor) => 인스턴스를 만들어줄때 처리할 기능을 정의.
	// 매개값이 생성자를 기본생성자.
	
	//생성자는 필드의 값을 지정할 때 많이 사용됨.
	public Student() {
		
	}
	public Student(String nm, String sn) {
		name = nm;
		studNo = sn;
	}
	
	//이름 학번 나이를 채워주는 생성자.
	public Student(String name, String studNo, int age, double height) {
		this.name = name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}
	
	
	

	//메소드
	void study() {
		System.out.println(name + "이(가) 공부를 합니다.");
		
	}
	void eat() {
		System.out.println(name + "이(가) 식사를 합니다.");
		
	}
	void showInfo() {
		System.out.println("이름: " + name +" 학생번호: " + studNo 
				+ " 나이: " + age +"이고 키는 " + height + " 입니다.");
	}
	
	
	
	
	
	
	

}
