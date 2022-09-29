package com.javalec.base;

public class Child_3 extends LunchMenu {
	public Child_3() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Child_3(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice+bulgogi;
	}

}
