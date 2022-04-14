package co.edu;

public class Calculator {
	private double pi = 3.14;

	// 리턴타입 없는 메소드
	void printPi() {
		System.out.println("원주율은 " + pi + "입니다.");
	}

	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름 " + radius + "의 넓이는 " + area);
	}

	// 리턴타입 있는 메소드
	// 메소드의 오버로딩 -> 동일한 이름의 메소드를 정의. 단// 메소드의 변수의 개수나 타입이 달라야함
	int sum(int num1, int num2) {

		return num1 + num2;

	}

	double sum(double num1, double num2) {

		return num1 + num2;

	}

	// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하는 메소드. getTriangleArea 리턴타입은 double
	double getTriangleArea(double width, double height) {

		return (width * height) / 2;
	}
	
	// 매개변수 클래스, 배열
	// 배열의 합을 계산
	int sum(int[] ary) {
		int sum = 0;
		for (int i=0;i<ary.length;i++) {
			sum += ary[i];
		}
		return sum;
	}
	// 배열의 평균 계산
	double avg(int n1, int n2, int n3) {
		
		return (n1+n2+n3) / 3.0;
	}
	
	double avg(int... args) {
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum/args.length;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
