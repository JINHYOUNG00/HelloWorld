package co.edu.condition;

public class IfExample4 {

	public static void main(String[] args) {
		// 임의의 값을 생성해주는 Math.random().
		double randomVal = Math.random();// 반환값이 double 0 <= 값 < 1
		System.out.println(randomVal);

		int randomVal2 = (int) (Math.random() * 100) + 1;// 반환값이 double// 1 <= 값 < 100
		System.out.println(randomVal2);
		// 생성된 값이 1 ~50까지의 범위로
		// 생성된 값이 51~60까지 범위로
		// 61~70, 71~80, 81~90, 91~100 범위
		if(randomVal2 <= 100) {
			if (randomVal2 > 90) {
				System.out.println("생성된 값은 91~ 100까지 범위 값.");
			}
		else if (randomVal2 <= 90) {
			if (randomVal2 > 80)  {
				System.out.println("생성된 값은 81~ 90까지 범위 값.");
			}
		}
		else if (randomVal2 <= 80) {
			if (randomVal2 > 70)  {
				System.out.println("생성된 값은 71~ 80까지 범위 값.");
			}
		}
		else if (randomVal2 <= 70) {
			if (randomVal2 > 60)  {
				System.out.println("생성된 값은 61~ 70까지 범위 값.");
			}
		}
		else if (randomVal2 <= 60) {
			if (randomVal2 > 50)  {
				System.out.println("생성된 값은 51~ 60까지 범위 값.");
			}
		}
	
		}
	}
}
		
		
		
		



