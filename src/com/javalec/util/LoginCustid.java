package com.javalec.util;

public class LoginCustid {

	public static String custid;
	
	public LoginCustid() {
		
	}
	public static String getCustid() {
		return custid;
	}
	public static String setCustid(String custid) {
		LoginCustid.custid=custid;
		return custid;
	}
}
