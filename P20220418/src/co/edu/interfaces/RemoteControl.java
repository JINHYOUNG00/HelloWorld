package co.edu.interfaces;

public interface RemoteControl {
	// 상수
	public static final int MAX_VolUME = 10; /*static final*/ // 상수
	public void turnOn();	//추상메소드. (메소드에 실행구문이 없음)
	public void turnOff();
	public void volumeUp();
	public void volumeDown();
	public default void adjustScreen() {      //디폴트메소드를 이용하면 선택적으로 적용가능
		System.out.println("화면을 조정합니다.");
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
	

}
