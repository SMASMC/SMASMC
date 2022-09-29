package com.javalec.function;

public class sub {

	public int Num;// 출력하고 싶은 구구단 숫자입력

	public sub() {

	}

	public String[] Star() {
		String[] Sum = new String[9];
		for (int i = 1; i <=9; i++) {
			Sum[i-1] = (Num + "X" + i + "=" + (Num * i));
		}
		return Sum;

	}

}