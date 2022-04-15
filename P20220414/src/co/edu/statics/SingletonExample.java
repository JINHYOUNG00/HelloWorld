package co.edu.statics;
class Car {
	
}
public class SingletonExample {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {  // 같은 주소값을 참조하고있는걸 알수있음
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
		
		
	}

}
