package com.javalec.dto;

public class Dto {
   
   int custNum;
   String cpassword;
   String cname;
   String cinitdate;
   String cupdatedate;
   String cdeletedate;
   String custid;
   
   public Dto() {
      
   }



   public Dto(String cname, String cinitdate, String custid) {
	super();
	this.cname = cname;
	this.cinitdate = cinitdate;
	this.custid = custid;
}



public Dto(int custNum, String cname, String cinitdate, String custid) {
	super();
	this.custNum = custNum;//고객 번호
	this.cname = cname;//고객 이름
	this.cinitdate = cinitdate;//만든 날짜
	this.custid = custid;//고객 아이디
}



public int getCustNum() {
	return custNum;
}



public void setCustNum(int custNum) {
	this.custNum = custNum;
}



public String getCpassword() {
	return cpassword;
}



public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}



public String getCname() {
	return cname;
}



public void setCname(String cname) {
	this.cname = cname;
}



public String getCinitdate() {
	return cinitdate;
}



public void setCinitdate(String cinitdate) {
	this.cinitdate = cinitdate;
}



public String getCupdatedate() {
	return cupdatedate;
}



public void setCupdatedate(String cupdatedate) {
	this.cupdatedate = cupdatedate;
}



public String getCdeletedate() {
	return cdeletedate;
}



public void setCdeletedate(String cdeletedate) {
	this.cdeletedate = cdeletedate;
}



public String getCustid() {
	return custid;
}



public void setCustid(String custid) {
	this.custid = custid;
}


   
   
   
}