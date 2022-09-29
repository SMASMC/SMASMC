package com.javalec.base;

import com.javalec.function.sub;


import java.util.Scanner;
public class Main_sub {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Num=0;
		System.out.println("구구단을 출력할 숫자를 입력하세요: ");
		
		Num = scanner.nextInt();
		sub sub = new sub();
		sub.Num=Num;//public (크기) (변수명)으로 클래스 안에 설정을 해줘야 함.
		String[] stringArr=sub.Star();
		for(int i=0;i<stringArr.length;i++) {
			//stringArr.length의 크기는 9//즉 배열 8까지 뽑아줌
			System.out.println(stringArr[i]);
		}

	}

}
