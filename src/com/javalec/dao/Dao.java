package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.javalec.dto.Dto;
import com.javalec.util.DBConnect;

public class Dao {

	   int custNum;
	   String cpassword;
	   String cname;
	   String cinitdate;
	   String cupdatedate;
	   String cdeletedate;
	   String custid;

	public Dao() {

	}

	public Dao(int custNum, String custid, String cname, String cinitdate) {
		super();
		this.custNum = custNum;
		this.custid = custid;
		this.cname = cname;
		this.cinitdate = cinitdate;
	}
	
	

	public Dao(String custid, String cname, String cinitdate) {
		super();
		this.cname = cname;
		this.cinitdate = cinitdate;
		this.custid = custid;
	}

	public Dao(int seqno) {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Dto> information() {

		ArrayList<Dto> dtoList = new ArrayList<Dto>();

		String whereStatement = "select custNum, custid, cname, cinitdate from customer ";
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
				
				int Num=rs.getInt(1);
				String ODid = rs.getString(2);
				String CSid = rs.getString(3);
				String PDid = rs.getString(4);

				Dto dto = new Dto(Num, ODid, CSid, PDid);
				dtoList.add(dto);

			}

			conn_mysql.close();// 불러온 DB를 닫아 줘야함.

		} catch (Exception e) {
			e.printStackTrace();
		}

		return dtoList;
	}

	public boolean deleteAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB불러오기
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);// 선언
			Statement stmt_mysql = conn_mysql.createStatement();
			// 불러올 때 java.sql을 불러와야함.

			String query = "delete from customer where custid =? ";

			ps = conn_mysql.prepareStatement(query);
			ps.setInt(1, custNum);
			ps.executeUpdate();

			conn_mysql.close();// 불러온 DB를 닫아 줘야함.

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean updateAction() {

		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB불러오기
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);// 선언
			Statement stmt_mysql = conn_mysql.createStatement();
			// 불러올 때 java.sql을 불러와야함.

			String query = "update customer set custid=?, cname=?,cinitdate=?";
			String query2 = "where custNum = ?";
			ps = conn_mysql.prepareStatement(query + query2);
			ps.setString(1, custid);
			ps.setString(2, cname);
			ps.setString(3, cinitdate);
			ps.setInt(4,custNum);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, custid + "해당사항을 수정하겠습니다.");

			conn_mysql.close();// 불러온 DB를 닫아 줘야함.


		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

}