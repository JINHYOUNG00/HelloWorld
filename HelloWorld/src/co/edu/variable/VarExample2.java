package co.edu.variable;

public class VarExample2 {

	public static void main(String[] args) {
//		국어점수 80, 영어점수 70, 수학점수 69
//		평균을 담을수있는 변수 선언.
		
		int korScore = 80;
		int engScore = 75;
		int mathScore = 60;
		
		double avg = (korScore + engScore + mathScore) / 3.0;
		
		
		
		System.out.println("국어점수는 " + korScore + "점 영어점수는 " + engScore + "점 수학점수는 " + mathScore + "점 평균 " + avg + "점 입니다.");
		
	}

}
