package com.javalec.base;

public class StoreShop_02 extends StoreHQ {

	@Override
	public void orderKim() {
		System.out.println("김치찌개(HQ): 5000원");
	}
	@Override
	public void orderBu() {
		System.out.println("부대찌개(HQ): 5000원");
	}
	@Override
	public void orderBi() {
		System.out.println("비빔밥(HQ): 5000원");
	}
	@Override
	public void orderSoon() {
		System.out.println("순대국(HQ): 4000원");
	}
	@Override
	public void orderKong() {
		System.out.println("공기밥(HQ): 무료입니다.");
	}
}
