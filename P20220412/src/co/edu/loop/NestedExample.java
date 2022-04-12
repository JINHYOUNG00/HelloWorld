package co.edu.loop;

public class NestedExample {

	public static void main(String[] args) {
		// 구구단.
		for (int j = 2; j <= 9; j++) {
			int dan = j;
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		}
		System.out.println("=====================");

//		*
//		**
//		***
//		****
//		*****
//		for (int j = 1; j <= 5; j++) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		*****
//		****
//		***
//		**
//		*
//		for (int j = 1; j <= 5; j++) {
//			for (int i = 5; i >= j; i--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i =1; i<=10; i++) {
			for(int j=1; j <= 10; j++) {
				//i,j > 5 * 
				if(i+j >= 11) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
					
			}
			System.out.println();
		}
		
		
		
		
	}

}
