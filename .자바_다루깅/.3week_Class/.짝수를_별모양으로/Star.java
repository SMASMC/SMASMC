package com.javalec.function;
import java.util.Scanner;

public class Star {
	int i=0;
	int j=0;//입력 받을 값
	String staar="*";
	Scanner scanner =new Scanner(System.in);

	public Star(int j) {
		super();
		this.j = j;
		for(int z=1;z<=9;z++) {
			if(z%2==0) {
				System.out.println(j+"X"+"*"+"="+(j*z));;
			}
			else if(z%2!=0) {
			System.out.println(j+"X"+z+"="+(j*z));
			}
		}
	}
	
	
}
