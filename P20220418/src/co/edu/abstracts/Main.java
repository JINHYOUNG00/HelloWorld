package co.edu.abstracts;

public class Main {

	public static void main(String[] args) {

		Animal animal = null; //new Animal(); x -> 추상클래스는 새로운 인스턴스를 생성할수 없음.
		animal = new Bird();
		animal.eat();
		animal.run();
		animal.sleep();
		
		animal = new Fish();
		animal.eat();
		animal.run();
		animal.sleep();
		
		
	}

}
