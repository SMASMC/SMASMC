package com.javalec.base;

public class storeShop1 extends StoreHQ {

	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개: 4500원");
	}

	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개: 5000원");
	}

	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥: 6000원");
	}

	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("판매하지 않습니다.");
	}

	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		System.out.println("공기밥 : 0원");
	}

}
