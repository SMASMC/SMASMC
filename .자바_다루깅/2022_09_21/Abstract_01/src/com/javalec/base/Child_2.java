package com.javalec.base;

public class Child_2 extends LunchMenu {

	public Child_2() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Child_2(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}



	@Override
	public int calc() {
		// TODO Auto-generated method stub
		return rice+bulgogi+milk+almond;
	}

}
