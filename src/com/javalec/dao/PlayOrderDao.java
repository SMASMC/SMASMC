package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;

import com.javalec.util.DBConnect;
import com.javalec.util.LoginCustid;

public class PlayOrderDao {

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
	// 저장되어있던 제품명의 정보를 orders테이블에 넣어줘야함
	// 장바구니 담기를 눌렀을 시
	// 장바구니 안에 productid(제품명)가 들어가야함
	// custid와 제품정보 가격등을 넣어줘야함
	// insert로 넣어줘야함

	// insert된 제품명을 클래스에서 set(get)으로 가져와서 보여주면됨

	// 자동으로 넣어지는 now()값은 선언 안해도 됨.
	// custid를 insert할 경우 '"+LoginCustId.getCustid()+"';

	// 필요한 것은 custid를 위와같은 방법으로 가져옴, 결제를 한 후에 포인트증가니까 지금은 아니고
	// custid=login, orderid가 notnull이니까 1번으로 넣어주고, productid를 넣어주고 제품명으로
	// 날짜 인설트로이정도?
	public PlayOrderDao(int orderid, String custid, String productid, String ordertype) {
		super();
		this.orderid = orderid;
		this.custid = custid;
		this.productid = productid;
		this.ordertype = ordertype;
	}

	public PlayOrderDao(int orderid, String custid, String productid, String ordertype, int orderprice) {
		super();
		this.orderid = orderid;
		this.custid = custid;
		this.productid = productid;
		this.ordertype = ordertype;
		this.orderprice = orderprice;
	}

	public PlayOrderDao(int orderid, String ordertype) {
		super();
		this.orderid = orderid;
		this.ordertype = ordertype;
	}

	public boolean insertAction() {

		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// DB불러오기
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);// 가져오기 선언
			Statement stmt_mysql = conn_mysql.createStatement();

			String query = "insert into orders(orderid, customer_custid,product_productid,ordertype,orderprice,orderdate) ";
			String query2 = "values(?,'" + LoginCustid.getCustid() + "',?,?,?,now())";
			// orderid=order+1;가능한지 확인
			ps = conn_mysql.prepareStatement(query + query2);
			ps.setInt(1, orderid);
			ps.setString(2, productid);
			ps.setString(3, ordertype);
			ps.setInt(4, orderprice);
			ps.executeUpdate();

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

}// end Line