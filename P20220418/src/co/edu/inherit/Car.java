package co.edu.inherit;
// taxi bus truck 
public class Car {

	//필드
	String model;
	
	//(기본)생성자
	public Car() {
		System.out.println("Car() 생성자 호출.");
		
	}
	//메소드
	public void drive() {
		System.out.println("운행을 합니다.");
	}
	
}
