package com.javalec.function;

public class sub_02 {

	public int dan=0;

	public sub_02() {
		
	}
	
	public String[] gugudan() {
		String[]result=new String[9];
		for(int i=1;i<=9;i++) {
			result[i-1]=(dan+"X"+i+"="+(dan*i));
		}
		return result;
	}
	
}
