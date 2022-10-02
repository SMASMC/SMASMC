package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javalec.dto.Dto;
import com.javalec.dto.OrdersDto;
import com.javalec.util.DBConnect;

public class OrdersDao {

	int odersid;// 주문번호
	int pNum;// 상품 번호
	int custNum;// 주문자 번호
	int osale;// 상품 가격
	String odate;// 상품구매일자
	int ocount;// 상품 구매개수

	public OrdersDao() {

	}

	public OrdersDao(int odersid, int pNum, int custNum, int osale, String odate, int ocount) {
		super();
		this.odersid = odersid;
		this.pNum = pNum;
		this.custNum = custNum;
		this.osale = osale;
		this.odate = odate;
		this.ocount = ocount;
	}

	public ArrayList<OrdersDto> information() {

		ArrayList<OrdersDto> dtoList = new ArrayList<OrdersDto>();

		String whereStatement = "select ordersid, pNum, custNum, osale, odate, ocount from orders ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB불러오기
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);// 선언
			Statement stmt_mysql = conn_mysql.createStatement();
			// 불러올 때 java.sql을 불러와야함.
			ResultSet rs = stmt_mysql.executeQuery(whereStatement);
//             해당되는 속성을 가져옴+
			while (rs.next()) {// 해당되는 사항들을 그대로 출력해서 보여준다.

				int Oid = rs.getInt(1);
				int pNum = rs.getInt(2);
				int Pid = rs.getInt(3);
				int Osale = rs.getInt(4);
				String Odate = rs.getString(5);
				int Ocount = rs.getInt(6);

				OrdersDto ordersdto = new OrdersDto(Oid, pNum, Pid, Osale, Odate, Ocount);
				dtoList.add(ordersdto);// 이배열에 저장된다.

			}

			conn_mysql.close();// 불러온 DB를 닫아 줘야함.

		} catch (Exception e) {
			e.printStackTrace();
		}

		return dtoList;
	}
}
