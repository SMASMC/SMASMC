package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=0;
		
		
		System.out.println("Add: "+(i+j));
		System.out.println("Sub: "+(i-j));
		System.out.println("Mul: "+(i*j));
		try {//시도하는 부분을 안에
		System.out.println("Div: "+(i/j));
		}
		catch(Exception e){//오류가 발생할 것 같은 부분을 안에
			//거짓일 경우 즉 0으로 값이 나올 때 아래와 같은 출력문 혹은 오류문을 출력한다.
			System.out.println("0을 사용하시면 나누기가 불가능 합니다.");
			
		}
	}

}
