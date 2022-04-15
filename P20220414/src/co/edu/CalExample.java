package co.edu;

public class CalExample {

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		
		c1.printPi();
		c1.getArea(2.4);
		c1.sum(30,23);
		
		int result = c1.sum(30, 20);
		System.out.println("두수의 합 "+result);
		System.out.println(c1.sum(30, 23));
		double result1 = c1.sum(23.4, 23);
		System.out.println("두수의 합 "+result1);
		
		double result2 = c1.getTriangleArea(55, 2);
		System.out.println("삼각형의 넓이는 " + result2);
		int [] intAry = {10,20,30,40};
		
		result = c1.sum(intAry);
		System.out.println(result);
		
		
		result2 = c1.avg(10, 20, 30, 40, 50, 60,70);
		System.out.println(result2);
		
		Math.random();
		
		
		
	}

}
