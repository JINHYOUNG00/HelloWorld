package co.edu.condition;

public class ConditionExample {

	public static void main(String[] args) {
//		임의 값: Math.random()
//		51~100 까지의 임의 값.
		
		// 100~90=>A학점
		// ~80점 B
		// ~70점 C
		// ~60점 D
		// F학점		
		
		int randomVal = (int) (Math.random() * 50) + 51; // 51~100
		randomVal /= 10; // randomValue = randomVal /10;
		
		System.out.println(randomVal);
		
		switch(randomVal) {
		case 10 : 
			System.out.println("A");
			break;
		case 9 : 
			System.out.println("B");
			break;
		case 8 : 
			System.out.println("C");
			break;
		case 7 : 
		System.out.println("D");
		break;
		default :
		System.out.println("F");
		}
		
	
		
	}

}
