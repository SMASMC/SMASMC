package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;
public class Main_02 {

	public static void main(String[] args) {
		ArrayList<Quiz> arrayList=new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "의 이름: ");
			String name = scanner.next();
			System.out.print(name+"의 전화번호");
			String Number = scanner.next();
			Quiz quiz=new Quiz(i,name,Number);
			arrayList.add(quiz);
		}
		for(int i=0;i<5;i++) {
		System.out.print(arrayList.get(i).getNum());
		System.out.print("	"+arrayList.get(i).getNumbew());
		System.out.print("	"+arrayList.get(i).getMember());
		System.out.println();
		}
	}

}
