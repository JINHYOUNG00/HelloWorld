package co.edu.abstracts;

public abstract class Animal {
	//Animal() 생성자로 인스턴스 생성 못함.
	
	//생성자
	public Animal() {
		
	}
	
	//메소드
	public abstract void eat();  //강제로 eat() 라는 메소드를 구현하도록 ; 메소드에서 구현 기능을 작성하지않음.
	public abstract void run();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
		
	}
	
	
	
	
	
	
	
	
}
