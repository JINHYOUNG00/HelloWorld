package co.edu.statics;

public class Singleton {
	Car car; // 디폴트도 다른 패키지에서 사용 불가. 하나의 파일에서 두개의 퍼블릭클래스를 만들수 없다.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() { // 퍼블릭을 넣으면 다른 패키지에서도 사용 가능
		return singleton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
