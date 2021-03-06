package co.test;

//조건문과 반복문.
//
//Math.random()을 사용해서 1  ~ 10사이의 임의의 수를 추출.(10번 반복작업 수행) 
//2의 배수와 3의 배수의 합계를 각각 구하도록 하세요.
//6의 경우에는 2와 3의 배수이므로 2의 배수와 3의 배수의 합계에 각각 더해지도록 하세요.\
//2의 배수의 합: ?(26) 3의 배수의 합: ?(27)
public class test222 {
	public static void main(String[] args) {

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) ((Math.random() * 10) + 1);
			System.out.println(numbers[i]);
		}
		int num2, num3;
		num2 = num3 = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				num2 += numbers[i];
			}
			if (numbers[i] % 3 == 0) {
				num3 += numbers[i];
			}
		}
		System.out.println("2의 배수의 합"+num2 + "3의 배수의 합" + num3);
	}
}
