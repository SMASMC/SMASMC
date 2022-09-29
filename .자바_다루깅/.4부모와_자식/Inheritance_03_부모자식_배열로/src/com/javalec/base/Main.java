package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreHQ storeHQ = new StoreHQ();
		StoreShop_01 storeShop_01 = new StoreShop_01();
		StoreShop_02 storeShop_02 = new StoreShop_02();
		StoreShop_03 storeShop_03 = new StoreShop_03();

//		ChildMenu childMenu=new ChildMenu();
		// childMenu.makeChung();
		// ParentsMenu parentsMenu=new ParentsMenu();
		// parentsMenu.makeChung();
		System.out.println("HQ-----------------");
		storeHQ.orderKim();
		storeHQ.orderBu();
		storeHQ.orderBi();
		storeHQ.orderSoon();
		storeHQ.orderKong();
		System.out.println("Shop1--------------");
		storeShop_01.orderKim();
		storeShop_01.orderBu();
		storeShop_01.orderBi();
		storeShop_01.orderSoon();
		storeShop_01.orderKong();
		System.out.println("Shop2--------------");
		storeShop_02.orderKim();
		storeShop_02.orderBu();
		storeShop_02.orderBi();
		storeShop_02.orderSoon();
		storeShop_02.orderKong();
		System.out.println("Shop3--------------");
		storeShop_03.orderKim();
		storeShop_03.orderBu();
		storeShop_03.orderBi();
		storeShop_03.orderSoon();
		storeShop_03.orderKong();

		System.out.println("====================");
		StoreHQ[] store = { new StoreHQ(), new StoreShop_01(), new StoreShop_02(), new StoreShop_03() };

		for (int i = 0; i < store.length; i++) {
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
		}

	}

}
