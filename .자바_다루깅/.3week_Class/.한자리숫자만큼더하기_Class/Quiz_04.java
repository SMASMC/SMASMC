package com.javalec.function;

public class Quiz_04 {
	public int result;
	public int Num1;
	public int Sum = 0;

	public int namugee(int Num1) {
		while (Num1 != 0) {
			result = (Num1 % 10);
			Num1 = (Num1 / 10);
			Sum += result;
		}
		return Sum;
	}

}
