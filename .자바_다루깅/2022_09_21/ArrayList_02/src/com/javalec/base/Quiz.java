package com.javalec.base;

public class Quiz {
	int Num;
	String Numbew;
	String Member;

	public Quiz() {

	}

	public Quiz(int num, String numbew, String member) {
		super();
		Num = num;
		Numbew = numbew;
		Member = member;
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	public String getNumbew() {
		return Numbew;
	}

	public void setNumbew(String numbew) {
		Numbew = numbew;
	}

	public String getMember() {
		return Member;
	}

	public void setMember(String member) {
		Member = member;
	}

}
