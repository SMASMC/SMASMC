package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.sub_02;

public class Main_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		int dan=0;
		
		System.out.println("구구단을 출력할 숫자를 입력하세요: ");
		dan=scanner.nextInt();
		
		sub_02 sub_02=new sub_02();
		sub_02.dan=dan;
		String[] stringArr=sub_02.gugudan();
		
		for(int i=0;i<stringArr.length;i++) {
			System.out.println(stringArr[i]);
		}
		
		
	}

}
