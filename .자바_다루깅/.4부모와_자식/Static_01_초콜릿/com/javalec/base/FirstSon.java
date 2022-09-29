package com.javalec.base;

public class FirstSon {
	public FirstSon() {
		
	}
	
	public void takeChoco() {
//		MamaBag bag=new MamaBag();
//		bag.choco=bag.choco-1;
		
		MamaBag.choco=MamaBag.choco-1;//0개의 값을 줬다.
		
		if(MamaBag.choco<0) {
			System.out.println("첫째는 초코파이 먹고 싶어요!");
		}
		else {
			System.out.println("첫째는 맛있게 먹었어요!");//지금 현재 0개이기 때문에 0보다 크거나 같기에 else문을 뽑음
		}
		
	}
}
