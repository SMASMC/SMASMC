package com.javalec.dto;

public class OrdersDto {
	//fields
	int odersid;//주문번호
	int pNum;//상품 번호
	int custNum;//주문자 번호
	int osale;//상품 가격
	String odate;//상품구매일자
	int ocount;//상품 구매개수
	
	public OrdersDto() {
		
	}
	public OrdersDto(int odersid, int pNum, int custNum, int osale, String odate, int ocount) {
		super();
		this.odersid = odersid;
		this.pNum = pNum;
		this.custNum = custNum;
		this.osale = osale;
		this.odate = odate;
		this.ocount = ocount;
	}
	public int getOdersid() {
		return odersid;
	}
	public void setOdersid(int odersid) {
		this.odersid = odersid;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public int getCustNum() {
		return custNum;
	}
	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}
	public int getOsale() {
		return osale;
	}
	public void setOsale(int osale) {
		this.osale = osale;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getOcount() {
		return ocount;
	}
	public void setOcount(int ocount) {
		this.ocount = ocount;
	}
	
}
