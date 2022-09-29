package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Star;

public class Main_03_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("구구단을 출력할 숫자를 입력핫요: ");
		int Num1=scanner.nextInt();
		Star star=new Star(Num1);
	}

}
