package co.edu.api;

public class SystemExample {

	public static void main(String[] args) {
////////////System 클래스
		System.out.println("start");
//		System.exit(0); //메인문 강제종료
		System.out.println("end");
		
		long start = System.currentTimeMillis(); //현재시간을 밀리세컨드 단위로 보여줌
		start = System.nanoTime();// 나노단위로 시간을 보여줌
		long sum = 0;
		for (int i=0;i<1000000;i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println(end-start);
		
		
		
	}
}
