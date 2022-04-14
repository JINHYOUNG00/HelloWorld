package co.edu;

public class TVExample {

	public static void main(String[] args) {

		int num = 10;
		String str = "Hello";
		
		Television tv = new Television(); //클래스 변수 = new 클래스();
		tv.company = "삼성";
		tv.color = "검은색";
		tv.price = 1000000;
		tv.model = "30Inch";
		tv.turnOn();
		tv.changeChannel(10);
		tv.turnOff();
		
		Television tv1 = new Television(); //클래스 변수 = new 클래스();
		tv1.company = "삼성";
		tv1.color = "검은색";
		tv1.price = 1000000;
		tv1.model = "30Inch";
		tv1.turnOn();
		tv1.changeChannel(10);
		tv1.turnOff();
		
		System.out.println(tv == tv1);
		System.out.println(tv);
		System.out.println(tv1);
		
		Student hong = new Student();
		hong.name = "홍길동";
		hong.studNo = "22-1234567";
		hong.age = 20;
		hong.height = 174.5;
		
		Student lee = new Student("이길동","22-1234568");
		lee.age = 21;
		lee.height = 173.5;
		
		Student kim = new Student("김진형","22-1234569", 22 ,172.5);
		
		
		hong.study();
		lee.eat();
		kim.study();
		
		hong.showInfo();
		lee.showInfo();
		kim.showInfo();
		
		
	
	}
	

}
