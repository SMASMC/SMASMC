package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int Num = 0;
		int Del = 0;
		System.out.println("입력할 숫자를 입력하세요!: ");

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "의 숫자: ");
			Num = scanner.nextInt();
			arrayList.add(Num);
			System.out.println(arrayList.get(Num));
		}
		System.out.print("몇번째의 숫자를 삭제하시겠습니까?:");
		Del = scanner.nextInt();
		arrayList.remove(Del-1);
		System.out.println("-----결과-----");
		for (int j = 0; j <= 3; j++) {
			System.out.println(arrayList.get(j));
		}

	}

}
