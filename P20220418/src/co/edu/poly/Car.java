package co.edu.poly;

public class Car {
	Tire frontLeft = new Tire("전방좌측", 6);
	Tire frontRight = new Tire("전방우측", 2);
	Tire backLeft = new Tire("후방좌측", 3);
	Tire backRight = new Tire("후방우측", 4);
	
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeft.roll()==false) {
			stop();
			return 1;
		}
		if(frontRight.roll()==false) {
			stop();
			return 2;
		}
		if(backLeft.roll()==false) {
			stop();
			return 3;
		}
		if(backRight.roll()==false) {
			stop();
			return 4;
		}
		return 0;
		
	}
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
}
