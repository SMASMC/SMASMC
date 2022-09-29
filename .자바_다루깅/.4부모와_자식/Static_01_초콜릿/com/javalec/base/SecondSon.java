package com.javalec.base;

public class SecondSon {
	public SecondSon() {
		
	}
	public void takeChoco() {
//		MamaBag bag=new MamaBag();
//		bag.choco=bag.choco-1;

		MamaBag.choco=MamaBag.choco-1;//지금 현재 값은 -1
		
		if(MamaBag.choco<0) {
			System.out.println("둘째는 초코파이 먹고 싶어요!");//현재 초코파이의 갯수는 -1개이기 때문에 0보다 작아서 이 if문을 출력한다.
		}
		else {
			System.out.println("둘째는 맛있게 먹었어요!");
		}
		
	}
}
