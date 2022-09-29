package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Person1;
import com.javalec.function.Person2;

public class Main {
//1번 친구에게 선물할 갯수를 입력하세요:5
	// 남은 선물의 갯수는 5개입니다.
//	2번 친구에게 선물할 갯수를 입력하세요.: 3
//	남은 선물의 갯수는 2개입니다.
//	
//	1번 친구에게 선물할 갯수를 입력하세요.:10
//	
//	남은 선물의 갯수가 없습니다.//종료
	public static void main(String[] args) {
		int Num1 = 0;
		int Num2 = 0;
		Scanner scanner = new Scanner(System.in);
		Person1 person1 = new Person1();
		Person2 person2 = new Person2();
		System.out.print("1번 친구에게 선물할 갯수를 입력하세요: ");
		Num1 = scanner.nextInt();
		person1.gift(Num1);
		person2.gift(Num2);

	}

}
