package co.edu;

public class IngeritExample {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.field1 = ""; //부모(Parent)의 필드
		c1.field2 = ""; //자식(Child1)의 필드
	
	
		c1.method1();
		c1.method2();
		
		
		Child2 c2 = new Child2();
		c2.field1 = ""; //부모
		c2.field3 = ""; //자식
		
		c2.method1();
		c2.method3();
		
		//부모의 참조변수에 자식의 인스턴스를 할당할 수 있다.
		Parent p1 = new Parent();
		p1 = new Child1(); // int -> long, double(자동형변환 promotion) 
		p1 = new Child2(); // 자동형변환
		
//		p1.field3 = ""; // 부모가 가진 필드와 메소드만 활용가능
		p1.field1 = ""; // 부모가 가진 필드와 메소드만 활용가능
		p1.method1(); // 부모가 가진 필드와 메소드만 활용가능
		
		//부모클래스로 자식클래스의 필드와 메소드를 활용하려면 강제형변환을 통해 해당 자식클래스로 변환하고 이용하면 된다. 
		c2 = (Child2) p1; //강제형변환 casting (큰값(부모)에서 작은값(자식)으로 변환할때)
		c2.field1 = "";
		c2.field3 = "";
		
		c2.method1();
		c2.method3();
		
	}

}
