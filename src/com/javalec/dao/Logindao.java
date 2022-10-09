package com.javalec.dao;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.javalec.dto.LoginDto;
import com.javalec.util.DBConnect;
import com.javalec.util.LoginCustid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Logindao {

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
	
	public Logindao() {
		
	}

	public Logindao(String custid, String custpassword, String custname, String custphone, String custaddress,
			String custemail, int custpoint, Timestamp custinitdate, Timestamp custupdatedate,
			Timestamp custdeletedate) {//전체 호출
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

	public Logindao(String custid, String custpassword, String custname, String custphone, String custaddress,
			String custemail, Timestamp custinitdate) {//회원가입시 필요한 정보
		super();
		this.custid = custid;
		this.custpassword = custpassword;
		this.custname = custname;
		this.custphone = custphone;
		this.custaddress = custaddress;
		this.custemail = custemail;
		this.custinitdate = custinitdate;
	}
	
	

	public Logindao(String custid, String custpassword, String custname, String custphone, String custaddress,
			String custemail) {//회원가입시 필요한 정보 Signup에 사용할 정보
		super();
		this.custid = custid;
		this.custpassword = custpassword;
		this.custname = custname;
		this.custphone = custphone;
		this.custaddress = custaddress;
		this.custemail = custemail;
	}

	public Logindao(String custid, String custpassword) {//로그인을 할 경우 필요한 정보
		super();
		this.custid = custid;
		this.custpassword = custpassword;
	}
	
	
	public Logindao(String custid) {
		super();
		this.custid = custid;
	}//id를가져옴
	

	public boolean insertAction() {//값을 넣어주는 역할 회원가입시
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//DB불러오기
			Connection conn_mysql=DriverManager.getConnection(DBConnect.url_mysql,DBConnect.id_mysql,DBConnect.pw_mysql);//가져오기 선언
			Statement stmt_mysql=conn_mysql.createStatement();
			
			String query ="insert into customer (custid, custpassword, custname, custphone, custaddress,custemail,custinitdate) ";
			String query2="values(?,?,?,?,?,?,now())";
			
			ps=conn_mysql.prepareStatement(query+query2);
			ps.setString(1, custid);
			ps.setString(2, custpassword);
			ps.setString(3, custname);
			ps.setString(4, custphone);
			ps.setString(5, custaddress);
			ps.setString(6, custemail);

			
			ps.executeUpdate();
			
			conn_mysql.close();
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	

	
	public ArrayList<LoginDto> loginAction(String custid){
		ArrayList<LoginDto>dtoList=new ArrayList<LoginDto>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql=DriverManager.getConnection(DBConnect.url_mysql,DBConnect.id_mysql,DBConnect.pw_mysql);
			Statement stmt_mysql=conn_mysql.createStatement();
			
			String query="select custid, custpassword from customer where custid="+"'"+custid+"'"+"and custdeletedate IS NULL" ;
			//아이디와 비밀번호를 보겠다.
			ResultSet rs=stmt_mysql.executeQuery(query);
			
			while (rs.next()) {
				String wkCustid=rs.getString(1);
				String wkCustPassword=rs.getString(2);
				LoginDto dto=new LoginDto(wkCustid, wkCustPassword);
				dtoList.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dtoList;
	}
	
	public ArrayList<LoginDto> checkDuplicate(){//아이디 중복 확인 메소드
		
		ArrayList<LoginDto> dtoList=new ArrayList<LoginDto>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//DB불러오기
			Connection conn_mysql=DriverManager.getConnection(DBConnect.url_mysql,DBConnect.id_mysql,DBConnect.pw_mysql);
			Statement stmt_mysql=conn_mysql.createStatement();
			
			
			String query="select custid from customer";
			ResultSet rs=stmt_mysql.executeQuery(query);
			
			while(rs.next()) {
				String wkCustid=rs.getString(1);
				
				LoginDto dto =new LoginDto(wkCustid);
				dtoList.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dtoList;
	}
	
	public ArrayList<LoginDto> VeiwName(){//사용자의 이름을 가져옵니다.
		
		ArrayList<LoginDto> dtoList=new ArrayList<LoginDto>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//DB불러오기
			Connection conn_mysql=DriverManager.getConnection(DBConnect.url_mysql,DBConnect.id_mysql,DBConnect.pw_mysql);
			Statement stmt_mysql=conn_mysql.createStatement();
			
			
			String query="select custname from customer where custid='"+LoginCustid.getCustid()+"'" ;//LoginCustid에 담긴 로그인을한 사람의 정보를 가져옴
			ResultSet rs=stmt_mysql.executeQuery(query);
			//+"님 환영합니다!!";
			while(rs.next()) {
				String wkCustid=rs.getString(1);
				
				LoginDto dto =new LoginDto(wkCustid);
				dtoList.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dtoList;
	}
	
}//endline
