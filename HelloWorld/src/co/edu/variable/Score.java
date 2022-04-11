package co.edu.variable;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int kor, eng, his, maxValue, sum;
		double avg;
		System.out.println("첫번째 과목 점수를 입력하시오");
		kor = scn.nextInt();
		System.out.println("두번째 과목 점수를 입력하시오");
		eng = scn.nextInt();
		System.out.println("세번째 과목 점수를 입력하시오");
		his = scn.nextInt();
		
		
		sum = kor + eng + his;
		avg = sum / 3.0;
		
		maxValue = kor;
		if(maxValue < eng) {
			maxValue = eng;
		}
		if (maxValue < his) {
			maxValue = his;
		}
		
		System.out.printf("합은 %3d이고 평균은 %.2f이고 최고점은 %3d이다.", sum, avg, maxValue);
	}
}
//		if(kor > eng, his) {
//			maxs = kor;
//		}else if(eng > kor, his)
//			
//	}

