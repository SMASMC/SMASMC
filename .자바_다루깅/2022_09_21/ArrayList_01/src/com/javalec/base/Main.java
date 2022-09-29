package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>>>>Array<<<<<");

		ArrayList<String> arrayList = new ArrayList<>();
		// <>:Generic이라고 불림

		// CRUD: Create,Read,Update,Delete
		// Data 추가
		arrayList.add("str1");// 배열이 아닌 클래스로 들어감.
		arrayList.add("str2");// 배열이 아닌 클래스로 들어감.
		arrayList.add("str3");// 배열이 아닌 클래스로 들어감.
		arrayList.add("str4");// 배열이 아닌 클래스로 들어감.

		System.out.println(arrayList);// 배열의 크기를 지정해주지 않고 값을 넣어준 순서대로 프린트로 뽑아줌.
		System.out.println(arrayList.toString());
		System.out.println(arrayList.get(2));// 배열이 아닌 클래스로 들어감.
		// arrayList. 을 사용하면 배열로 사용할 수 있는 모든 기능들이 나타남.

		// 변경하기
		arrayList.set(1, "str431");
		System.out.println(arrayList.toString());
		
		//삭제하기
		arrayList.remove(1);
		System.out.println(arrayList.toString());
		arrayList.remove("str4");
		System.out.println(arrayList.toString());
		
		//크기알기
		System.out.println(arrayList.size());
		
	}

}
