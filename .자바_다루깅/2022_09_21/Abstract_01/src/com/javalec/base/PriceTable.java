package com.javalec.base;

//다른 곳에서 호출을해서 static으로 값을 변경할 수 있도록 선언
public class PriceTable {
	public static final int RICE = 2000;
	// final은 다른 사람이 고칠 수 없도록 해주는 것
	public static final int BULGOGI = 2000;
	public static final int BANANA = 500;
	public static final int MILK = 700;
	public static final int ALMOND = 200;

	public PriceTable() {

	}

}
