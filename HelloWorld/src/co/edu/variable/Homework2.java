package co.edu.variable;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("물건의 가격을 입력하시오.");
		int price = scn.nextInt();
	}

}

//영수증
//물건의 가격과 현금.
//[현금] 10000
//[물건가격] 7500 (부가세 포함가격)
//[부가세] 682 (부가세는 물건가격 1/10) (물건가격 6818)
//[잔돈] 2500
