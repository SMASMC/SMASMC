package com.javalec.base;

public class StoreShop_03 extends StoreHQ {
	@Override
	public void orderKim() {
		System.out.println("김치찌개(HQ): 6000원");
	}
	@Override
	public void orderBu() {
		System.out.println("부대찌개(HQ): 7000원");
	}
	@Override
	public void orderBi() {
		System.out.println("비빔밥(HQ): 7000원");
	}
	@Override
	public void orderSoon() {
		System.out.println("순대국(HQ): 6000원");
	}
	@Override
	public void orderKong() {
		System.out.println("공기밥(HQ): 1000원");
	}
}
