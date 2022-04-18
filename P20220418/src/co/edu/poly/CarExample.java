package co.edu.poly;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=0;i<8;i++) {
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
		case 1:
			System.out.println("전방좌측 재생타이어로 교체합니다");
			car.frontLeft = new Tire("전방좌측",3);
			break;
		case 2:
			System.out.println("전방좌측 중고타이어로 교체합니다");
			car.frontRight = new Tire("전방우측",2);
			break;
		case 3:
			System.out.println("후방좌측 한국타이어로 교체합니다");
			car.backLeft = new HankookTire("후방좌측",12);
			break;
		case 4:
			System.out.println("후방좌측 금호타이어로 교체합니다");
			car.backLeft = new KumhoTire("후방우측",15);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------------------------------");
		}
		
	}

}
