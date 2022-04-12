package co.edu.condition;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int computer = (int) ((Math.random()*3)+1);		
		System.out.println("1:가위, 2:바위, 3:보");
		int input = scn.nextInt();
		
		if(input == computer + 1) {
			System.out.println("You win.");
		} else if (input == computer - 2) {
			System.out.println("You win.");
		} else
			System.out.println("You lose.");
		System.out.println(computer);
		
		
		
	}

}
