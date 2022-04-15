package co.edu.statics;

public class PersonEx {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234411", "홍길동");
		p1.name = "김길동";
//		p1.ssn = "132123-213123";
		
		Person p2 = new Person("1231313-21132131","김깅동");
		p2.name = "김길동";
//		p2.ssn = "132123-213123";
		System.out.println(Person.PI);
	}

}
