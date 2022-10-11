package com.javalec.util;

public class Productid {

	public static String productid;
	
	public Productid() {
		
	}
	
	public static String getProductid() {
		return productid;
	}
	
	public static String serProductid(String productid) {
		Productid.productid=productid;
		return productid;
	}
	
}
