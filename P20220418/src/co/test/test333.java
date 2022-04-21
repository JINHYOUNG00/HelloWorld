package co.test;

//배열의 사용.
//크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
//평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.

public class test333 {
	public static void main(String[] args) {

		int intAry[] = new int[10]; // 임의 값을 넣을 배열
		double avg = 0;
		int sum = 0;
		int cnt = 0;

		// 평균보다 큰 값의 요소들을 새로운 배열에 저장.
		int intAry2[] = new int[10]; // 담을 배열

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) ((Math.random() * 10) + 1);
			sum += intAry[i];
			
			if (intAry2[i] > avg) {
				
				
				for (int j = 0; j < intAry2.length; j++) {
					if (intAry2[j] != 0) {
						intAry2[j] = intAry[i];

						break;

					}
				}
			}

		}
		System.out.println(intAry2.toString());
	}
}
