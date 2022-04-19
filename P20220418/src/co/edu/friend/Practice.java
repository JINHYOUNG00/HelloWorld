package co.edu.friend;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int intAry[] = new int[5];
		int intAry2[] = new int[5];

		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) ((Math.random() * 5) + 1);

			for (int j = 0; j < i; j++) {
				if (intAry[i] == intAry[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("[*],[*],[*],[*],[*]");
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("5가 위치한 곳을 입력하세요");
			int input = scn.nextInt();
			scn.nextLine();
			if (input == i + 1) {
				if (intAry[i] == 5) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println("오답입니다.");
					for (int j = 0; j < 5; j++) {
						intAry2[j] = intAry[j];
						if (intAry2[j] != 0) {
							System.out.print("[" + intAry2[j] + "]");

						} else {
							System.out.print("[*]");
						}
					}

//						} else if (j+1 == 2) {
//							intAry2[j] = intAry[j];
//							if(intAry2[j]!=0) {
//							System.out.print("["+ intAry2[j]+"]");
//							} else {
//							System.out.print("[*]");
//							}
//						} else if (j+1 == 3) {
//							intAry2[j] = intAry[j];
//							if(intAry2[j]!=0) {
//							System.out.print("["+ intAry2[j]+"]");
//							} else {
//							System.out.print("[*]");
//							}
//						} else if(j+1 == 4) {
//							intAry2[j] = intAry[j];
//							if(intAry2[j]!=0) {
//							System.out.print("["+ intAry2[j]+"]");
//							} else {
//							System.out.print("[*]");
//							}
//						} else if (j+1 == 5) {
//							intAry2[j] = intAry[j];
//							if(intAry2[j]!=0) {
//							System.out.print("["+ intAry2[j]+"]");
//							} else {
							System.out.print("[*]");
							
//						}  
//					}
//					System.out.println();
//					if (input == 1) {
//						intAry2 = intAry;
//						System.out.println("[" + intAry2[input - 1] + "],[*],[*],[*],[*]");
//					} else if (input == 2) {
//						intAry2 = intAry;
//						System.out.println("[*],"+"[" + intAry2[input - 1] + "],[*],[*],[*]");
//					} else if (input == 3) {
//						intAry2 = intAry;
//						System.out.println("[*],[*],"+"[" + intAry2[input - 1] + "],[*],[*]");
//					} else if (input == 4) {
//						intAry2 = intAry;
//						System.out.println("[*],[*],[*],"+"[" + intAry2[input - 1] + "],[*]");
//					} else if (input == 5) {
//						intAry2 = intAry;
//						System.out.println("[*],[*],[*],[*],[" + intAry2[input - 1] + "]");
//					}
				}
			}
		}
	}
}
