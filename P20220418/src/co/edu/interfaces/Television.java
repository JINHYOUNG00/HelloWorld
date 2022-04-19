package co.edu.interfaces;

//인터페이스를 구현 클래스를 통해서 코드가 구현이 되어야한다.
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		 System.out.println("TV를 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV 볼륨을 올립니다.");
	}

	@Override
	public void adjustScreen() {
		System.out.println("TV 화면을 조정합니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV 볼륨을 내립니다.");
	}

	
	
}
