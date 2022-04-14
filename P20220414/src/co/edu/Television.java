package co.edu;
// 객체 -> 도면 -> 텔레비전(삼성, 엘지)
//Object -> Class -> Instance.
// 추상화(텔레비전의 모든 속성 -> 필요한 부분만 정리)
public class Television {
	//속성
	String company;
	String model;
	int price;
	String color;
	
	//기능 -> 메소드 (반환유형, 메소드명, 매개변수)
	void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	void changeChannel(int channel){
		System.out.println(channel + "번 채널로 변경합니다.");
	}
}


