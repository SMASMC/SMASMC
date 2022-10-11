package com.javalec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.javalec.dto.MypageDto;
import com.javalec.util.DBConnect;
import com.javalec.util.LoginCustid;

public class Mypagedao {

	String custid;// 회원 id
	String custpassword;// 회원 비밀번호 update
	String custname;// 가입자 성함 update
	String custphone;// 가입자 전화번호 update
	String custaddress;// 가입자 주소 update
	String custemail;// 가입자 email주소 update
	int custpoint;// 가입자 포인트 insert OR update
	Timestamp custinitdate;// 가입자 가입일자
	Timestamp custupdatedate;// 가입자 계정 정보 update일자
	Timestamp custdeletedate;// 가입자 계정 탈퇴 일자

	public Mypagedao() {

	}
	// select에서는 이름, 아이디, 전화번호, 비밀번호, 주소, email, 포인트
	// update에서는 이름, 전화번호, 비밀번호, 주소, email
	// update에서는 (메소드 따로)탈퇴를 눌렀을 시 탈퇴일자

	public Mypagedao(String custid, String custpassword, String custname, String custphone, String custaddress,
			String custemail, int custpoint) {
		super();
		this.custid = custid;
		this.custpassword = custpassword;
		this.custname = custname;
		this.custphone = custphone;
		this.custaddress = custaddress;
		this.custemail = custemail;
		this.custpoint = custpoint;
	}// select문에 사용할 내역들

	public Mypagedao(String custpassword, String custname, String custphone, String custaddress, String custemail) {
		super();
		this.custpassword = custpassword;
		this.custname = custname;
		this.custphone = custphone;
		this.custaddress = custaddress;
		this.custemail = custemail;
	}// update문에 사용할 내역

	public Mypagedao(String custid, String custname, String custphone, String custaddress, String custemail,
			int custpoint) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custphone = custphone;
		this.custaddress = custaddress;
		this.custemail = custemail;
		this.custpoint = custpoint;
	}// select문에 사용할 내역들
	
	
	public Mypagedao(String custpassword, String custname) {
		super();
		this.custpassword = custpassword;
		this.custname = custname;
	}//비밀번호 update문 활용으로 변경
	
	public ArrayList<MypageDto> selectList() {
		ArrayList<MypageDto> dtoList = new ArrayList<MypageDto>();
		String whereStatement = "select custid, custname, custphone,custaddress,custemail,custpoint from customer where custid = '"+LoginCustid.getCustid() + "'";
		//입력받은 custid를 logincustid로 넘겨서 해당 custid의 정보를 넘겨받음
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			ResultSet rs = stmt_mysql.executeQuery(whereStatement);
			while (rs.next()) {

				String wkCid = rs.getString(1);// custid
				String wkCn = rs.getString(2);// custname
				String wkCphone = rs.getString(3);// custphone
				String wkCaddress = rs.getString(4);// custaddress
				String wkCemail = rs.getString(5);// custemail
				int wkCpoint = rs.getInt(6);// custpoint

				MypageDto dto = new MypageDto(wkCid, wkCn, wkCphone, wkCaddress, wkCemail, wkCpoint);
				dtoList.add(dto);
			}
			conn_mysql.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtoList;
	}

	public Boolean updateAction() {//정보변경

		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);
			String query = "update customer set custpassword = ?, "
					+ "custname=?,custphone=?,custaddress=?,custemail=?,custupdatedate = now() ";
			String query2 = "where custid =? ";
//			'"+LoginCustid.getCustid()+"' 
			//입력받은 custid를 logincustid로 넘겨서 해당 custid의 정보를 넘겨받음
			ps = conn_mysql.prepareStatement(query + query2);
			ps.setString(1, custpassword);
			ps.setString(2, custname);
			ps.setString(3, custphone);
			ps.setString(4, custaddress);
			ps.setString(5, custemail);
			ps.setString(6, LoginCustid.getCustid());
			ps.executeUpdate();

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
	

	public Boolean deleteAction() {

		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);

			String query = "update customer set custdeletedate = now() ";
			String query2 = "where custid = ? ";

			ps = conn_mysql.prepareStatement(query + query2);
			ps.setString(1, LoginCustid.getCustid());
			ps.executeUpdate();

			conn_mysql.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

}
