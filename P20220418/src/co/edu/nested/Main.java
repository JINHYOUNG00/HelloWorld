package co.edu.nested;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();  //1(인스턴스)
		outer.method1();
		
		//인스턴스(instance) vs 정적(static)
		//인스턴스는 new라고 새로운 객체를 만들어야함
		
		//instance 멤버클래스
		Outer.Inner1 inner = outer.new Inner1(); //2(인스턴스) 외부클래스이름.내부클래스 변수 = 
		inner.method2();
		
		//static 멤버클래스
		Outer.Inner2.method5();
		
		Outer.Inner2 inner2 = new Outer.Inner2(); //외부클래스.인스턴스
		inner2.method4(); //인스턴스 메소드ㅜ
		inner2.method5(); //정적 메소드
	}
}
