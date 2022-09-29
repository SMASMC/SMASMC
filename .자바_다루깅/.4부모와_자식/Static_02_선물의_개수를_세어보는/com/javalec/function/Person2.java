package com.javalec.function;

import java.util.Scanner;

public class Person2 {
	public Person2() {
		
	}
	public void gift(int Num1) {
		Gift.sunmool = Gift.sunmool - Num1;
		Scanner scanner = new Scanner(System.in);
		int Sum=1;
		while(Sum!=0) {
		if(Gift.sunmool<=0) {
			break;
		}
		System.out.print("2번 친구에게 선물할 갯수를 입력하세요.: ");
		Num1 = scanner.nextInt();
		Gift.sunmool = Gift.sunmool - Num1;
		if (Num1 >= 11) {
			System.out.println("남은 선물의 갯수가 모자랍니다.");
		} else if (Gift.sunmool<=0) {
			System.out.println("남은 선물의 갯수가 없습니다.");
		} else if (Gift.sunmool >0) {
			System.out.println("남은 선물의 갯수는 :" + Gift.sunmool + "입니다.");
		}
		Sum--;
		}
	}
}
