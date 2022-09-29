package com.javalec.base;

public abstract class StoreHQ {

	public StoreHQ() {
	}

	public abstract void orderKim();//abstract를 사용하면 자식클래스가 자동적으로 메소드형식을 형성함.
	public abstract void orderBu();
	public abstract void orderBi();
	public abstract void orderSoon();
	public abstract void orderKong();
}