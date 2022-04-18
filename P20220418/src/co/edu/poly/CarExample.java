package co.edu.poly;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=0;i<5;i++) {
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
		case 1:
			car.frontLeft = new Tire("재생타이어",3);
			break;
		case 2:
			car.frontRight = new Tire("중고타이어",2);
			break;
		case 3:
			car.backLeft = new Tire("재생타이어",3);
			break;
		case 4:
			car.backLeft = new Tire("재생타이어",3);
			break;
		}
		
		}
		
	}

}
