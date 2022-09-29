package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Customer> arrayCustomers=new ArrayList<>();
		//ArrayList<클래스를 가져옴>
		
		Customer customer=new Customer(1,"James","010-1111-2222");//순서대로 int number, String name,String phone 으로 각각넣어 준다.
		arrayCustomers.add(customer);
		Customer customer2=new Customer(2,"c","d");
//		customer2.setNumber(2);
//		customer2.setName("Cathy");
//		customer2.setPhone("010-1111-2222");
		arrayCustomers.add(customer2);

		System.out.println(arrayCustomers.get(1).getName());
		System.out.println(arrayCustomers.get(0).getPhone());
		System.out.println(arrayCustomers.get(1).getNumber());
		System.out.println(arrayCustomers.get(0).getClass());//클래스안에 필드를 각각 뽑아준다.
		
		
		
	}

}
