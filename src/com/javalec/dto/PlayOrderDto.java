package com.javalec.dto;

import java.sql.Timestamp;

public class PlayOrderDto {
	int sequencenumber;
	int orderid;
	String custid;
	String productid;
	int orderprice;
	int ordercount;
	int orderusepoint;
	int ordersavepoint;
	Timestamp orderdate;
	String ordertype;
	public PlayOrderDto(int sequencenumber, int orderid, String custid, String productid, int orderprice,
			int ordercount, int orderusepoint, int ordersavepoint, Timestamp orderdate, String ordertype) {
		super();
		this.sequencenumber = sequencenumber;
		this.orderid = orderid;
		this.custid = custid;
		this.productid = productid;
		this.orderprice = orderprice;
		this.ordercount = ordercount;
		this.orderusepoint = orderusepoint;
		this.ordersavepoint = ordersavepoint;
		this.orderdate = orderdate;
		this.ordertype = ordertype;
	}
	
	
	public int getSequencenumber() {
		return sequencenumber;
	}
	public void setSequencenumber(int sequencenumber) {
		this.sequencenumber = sequencenumber;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public int getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(int orderprice) {
		this.orderprice = orderprice;
	}
	public int getOrdercount() {
		return ordercount;
	}
	public void setOrdercount(int ordercount) {
		this.ordercount = ordercount;
	}
	public int getOrderusepoint() {
		return orderusepoint;
	}
	public void setOrderusepoint(int orderusepoint) {
		this.orderusepoint = orderusepoint;
	}
	public int getOrdersavepoint() {
		return ordersavepoint;
	}
	public void setOrdersavepoint(int ordersavepoint) {
		this.ordersavepoint = ordersavepoint;
	}
	public Timestamp getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}
	public String getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	
	
	
	
}
