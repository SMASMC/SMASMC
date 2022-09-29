package com.javalec.function;

public class Person1 {
	public Person1() {

	}

	public void gift(int Num1) {
//		MamaBag.choco=MamaBag.choco-1;//0개의 값을 줬다.
		Gift.sunmool = Gift.sunmool - Num1;
		if (Num1 >= 11) {
			System.out.println("남은 선물의 갯수가 모자랍니다.");
		} else if (Gift.sunmool<=0) {
			System.out.println("남은 선물의 갯수가 없습니다.");
		} else if (Gift.sunmool >0) {
			System.out.println("남은 선물의 갯수는 :" + Gift.sunmool + "입니다.");
		}
	}
}
