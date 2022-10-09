package com.javalec.dto;

import java.sql.Timestamp;


public class LoginDto {
	
	String custid;
	String custpassword;
	String custname;
	String custphone;
	String custaddress;
	String custemail;
	int custpoint;
	Timestamp custinitdate;
	Timestamp custupdatedate;
	Timestamp custdeletedate;
	
	public LoginDto() {
		
	}

	public LoginDto(String custid, String custpassword, String custname, String custphone, String custaddress,
			String custemail, int custpoint, Timestamp custinitdate, Timestamp custupdatedate,
			Timestamp custdeletedate) {//회원가입을 할 경우 필요함
		super();
		this.custid = custid;
		this.custpassword = custpassword;
		this.custname = custname;
		this.custphone = custphone;
		this.custaddress = custaddress;
		this.custemail = custemail;
		this.custpoint = custpoint;
		this.custinitdate = custinitdate;
		this.custupdatedate = custupdatedate;
		this.custdeletedate = custdeletedate;
	}
	
	
	public LoginDto(String custid, String custpassword, String custname, String custphone, String custaddress,
			String custemail, Timestamp custinitdate) {
		super();
		this.custid = custid;
		this.custpassword = custpassword;
		this.custname = custname;
		this.custphone = custphone;
		this.custaddress = custaddress;
		this.custemail = custemail;
		this.custinitdate = custinitdate;
	}

	public LoginDto(String custid, String custpassword) {//로그인을 할 경우 필요함
		super();
		this.custid = custid;
		this.custpassword = custpassword;
	}
	
	public LoginDto(String custid) {
		super();
		this.custid = custid;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustpassword() {
		return custpassword;
	}

	public void setCustpassword(String custpassword) {
		this.custpassword = custpassword;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustphone() {
		return custphone;
	}

	public void setCustphone(String custphone) {
		this.custphone = custphone;
	}

	public String getCustaddress() {
		return custaddress;
	}

	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}

	public String getCustemail() {
		return custemail;
	}

	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}

	public int getCustpoint() {
		return custpoint;
	}

	public void setCustpoint(int custpoint) {
		this.custpoint = custpoint;
	}

	public Timestamp getCustinitdate() {
		return custinitdate;
	}

	public void setCustinitdate(Timestamp custinitdate) {
		this.custinitdate = custinitdate;
	}

	public Timestamp getCustupdatedate() {
		return custupdatedate;
	}

	public void setCustupdatedate(Timestamp custupdatedate) {
		this.custupdatedate = custupdatedate;
	}

	public Timestamp getCustdeletedate() {
		return custdeletedate;
	}

	public void setCustdeletedate(Timestamp custdeletedate) {
		this.custdeletedate = custdeletedate;
	}
	
	
	
}
