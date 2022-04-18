package co.edu.poly;

public class Tire {
	// 필드.
	public int maxRotation; // 최대 10;
	public int accmulateRotation; // 현재까지 사용한 누적 회전수
	public String location; // 자동차의 위치.\

	// 생성자
	public Tire(String location, int accmulateRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		accmulateRotation++;

		if (accmulateRotation < maxRotation) {
			System.out.println(location+"타이어 수명 "+ (maxRotation-accmulateRotation) +"회");
			return true;
		} else {
			System.out.println("***" +location+ "Tire 펑크 ***");
			return false;
		}
	}

}
