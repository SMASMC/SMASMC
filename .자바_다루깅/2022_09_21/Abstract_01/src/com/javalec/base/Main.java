package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LunchMenu child_1 = new Child_1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK,
				PriceTable.ALMOND);
		// static으로 값을 자식에서 받아냄 그러고 반환을 함.
		LunchMenu child_2 = new Child_2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK,
				PriceTable.ALMOND);
		LunchMenu child_3 = new Child_3(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK,
				PriceTable.ALMOND);

		System.out.println("Child1의 식대: " + child_1.calc());
		// 반환값을 출력
		System.out.println("Child2의 식대: " + child_2.calc());
		// 반환값을 출력
		System.out.println("Child3의 식대: " + child_3.calc());
		// 반환값을 출력

	}

}
