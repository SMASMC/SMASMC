package com.javalec.base;

public class Child_1 extends LunchMenu {

	public Child_1() {
		
	}
	
	public Child_1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice+bulgogi+banana;//super로 값을 받은것을 변환후 반환
	}

}
