package com.javalec.base;

public abstract class LunchMenu {
	//Fields 명사
	
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int almond;
	//Fields에 반환하는 값이 있기 때문에 super로 자식에게 물려줌.
	//Constructor 동사
	public LunchMenu() {
		
	}
	public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}
	//Method
	public abstract int calc();
	
	
}
