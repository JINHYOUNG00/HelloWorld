package co.edu.interfaces;

public class RemoteExample {
	public static void main(String[] args) {
//	상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당.
		
		RemoteControl rc = null; 
//		rc = new Television(); //RemoteControl을 구현하는 Television
		rc = new Audio();
		
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.turnOff();
		
		RemoteControl.changeBattery(); //static 메소드는 구현객체에서 반드시 구현하지않아도 되는 메소드
		
	}
}
