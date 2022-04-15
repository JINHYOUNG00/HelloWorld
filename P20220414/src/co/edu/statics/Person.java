package co.edu.statics;
//co.edu.statics.Person

public class Person {
	
	final String nation = "Korea";
	final String ssn;
	static final double PI = 3.14; // 상수필드: 클래스 소속(static), 값 변경 불가(final).
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
