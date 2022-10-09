package com.javalec.dto;

import java.sql.Timestamp;

public class MypageDto {

	String custid;//회원 id
	String custpassword;//회원 비밀번호 update
	String custname;//가입자 성함 update
	String custphone;//가입자 전화번호 update
	String custaddress;//가입자 주소 update
	String custemail;//가입자 email주소 update
	int custpoint;//가입자 포인트 insert OR update
	Timestamp custinitdate;//가입자 가입일자
	Timestamp custupdatedate;//가입자 계정 정보 update일자
	Timestamp custdeletedate;//가입자 계정 탈퇴 일자
	
	public MypageDto() {
		
	}

	public MypageDto(String custid, String custpassword, String custname, String custphone, String custaddress,
			String custemail, int custpoint, Timestamp custinitdate, Timestamp custupdatedate,
			Timestamp custdeletedate) {
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
	}//가입자의 개인정보를 저장
	
	

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
