package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Quiz_04;

public class Main_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력한 한자릿 수 정수의 합을 출력하는 프로그램을 객체지향 형식으로 작성.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer(0~9): ");
		int Num1 = scanner.nextInt();// 입력받은 갯수
		Quiz_04 quiz_04 = new Quiz_04();
		int Ssum = quiz_04.namugee(Num1);
		System.out.println(Ssum + "입니다.");
		scanner.close();

	}

}
