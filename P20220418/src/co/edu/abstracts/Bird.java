package co.edu.abstracts;

public class Bird extends Animal { //Animal 의 추상메소드를 구현해야함

	@Override
	public void eat() {
		System.out.println("새가 먹이를 먹습니다.");
	}

	@Override
	public void run() {
		System.out.println("새가 날아갑니다.");
	}

	@Override
	public void sleep() {
		System.out.println("새가 잠을 잡니다.");
	}

	
	
	
	
	
	
}
