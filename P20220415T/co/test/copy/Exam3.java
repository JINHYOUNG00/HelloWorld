package co.test.copy;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {
		int[] intAry = new int[10];
		int[] intAry2 = new int[10];
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 10) + 1;
		}
		for (int i = 0; i < intAry.length; i++) {
				sum += intAry[i];
				cnt++;
		}
		avg = 1.0 * sum / cnt;
		System.out.println("배열의 합은 " + sum);
		System.out.println("배열의 평균은 " + avg);
		System.out.println();
		
		
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > avg) {
				intAry2[i] = intAry[i];
				}
			}
		
	
		
		
		System.out.println();
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		System.out.println(intAry[5]);
		System.out.println(intAry[6]);
		System.out.println(intAry[7]);
		System.out.println(intAry[8]);
		System.out.println(intAry[9]);

		System.out.println();
		System.out.println(intAry2[0]);
		System.out.println(intAry2[1]);
		System.out.println(intAry2[2]);
		System.out.println(intAry2[3]);
		System.out.println(intAry2[4]);
		System.out.println(intAry2[5]);
		System.out.println(intAry2[6]);
		System.out.println(intAry2[7]);
		System.out.println(intAry2[8]);
		System.out.println(intAry2[9]);
		
		
		
	}
}
