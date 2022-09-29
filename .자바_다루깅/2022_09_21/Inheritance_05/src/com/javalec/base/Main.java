package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreHQ storeShop_01 = new storeShop1();

//		ChildMenu childMenu=new ChildMenu();
		// childMenu.makeChung();
		// ParentsMenu parentsMenu=new ParentsMenu();
		// parentsMenu.makeChung();
		System.out.println("Shop1--------------");
		storeShop_01.orderKim();
		storeShop_01.orderBu();
		storeShop_01.orderBi();
		storeShop_01.orderSoon();
		storeShop_01.orderKong();

	}

}
