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

   int seqno;
   String name;
   String telno;
   String address;
   String email;
   String relation;

   String connanme;
   String condata;

   public Dao() {
      // TODO Auto-generated constructor stub
   }

   public Dao(int seqno, String name, String telno, String relation) {
      super();
      this.seqno = seqno;
      this.name = name;
      this.telno = telno;
      this.relation = relation;
   }

   public Dao(int seqno) {
      super();
      this.seqno = seqno;
   }

   public Dao(String connanme, String condata) {
      super();
      this.connanme = connanme;
      this.condata = condata;
   }
   
   

   public Dao(String name, String telno, String address, String email, String relation) {//Insert입력란에 5개의 값을 받음
	super();
	this.name = name;
	this.telno = telno;
	this.address = address;
	this.email = email;
	this.relation = relation;
}

// 검색 결과를 Table로
   public ArrayList<Dto> selectList() {//검색을 했을때 정보가 Table에 나옴

      ArrayList<Dto> dtoList = new ArrayList<Dto>();
      String whereStatement = "select seqno,name,telno,relation from userinfo";// 해당되는 사항을 데이터베이스에서 가져옴.
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         // DB불러오기
         Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
               DBConnect.pw_mysql);// 선언
         Statement stmt_mysql = conn_mysql.createStatement();
         // 불러올 때 java.sql을 불러와야함.

         ResultSet rs = stmt_mysql.executeQuery(whereStatement);

         while (rs.next()) {

            int wkSeq = rs.getInt(1);
            String wkName = rs.getString(2);
            String wkTelno = rs.getString(3);
            String wkRelation = rs.getString(4);

            Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation);
            dtoList.add(dto);

         }

         conn_mysql.close();// 불러온 DB를 닫아 줘야함.

      } catch (Exception e) {
         e.printStackTrace();
      }

      return dtoList;
   }

   
   public Dto tableCLick() {// Table을 click하였을 경우 인적 사항을 보여줌

      Dto dto = null;

      String whereStatement = "select seqno,name,telno,address,email,relation from userinfo ";
      String whereStatement2 = "where seqno= " + seqno;

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         // DB불러오기
         Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
               DBConnect.pw_mysql);// 선언
         Statement stmt_mysql = conn_mysql.createStatement();
         // 불러올 때 java.sql을 불러와야함.

         ResultSet rs = stmt_mysql.executeQuery(whereStatement + whereStatement2);
//         해당되는 속성을 가져옴+
         if (rs.next()) {// 해당되는 사항들을 그대로 출력해서 보여준다.

            int wkSeq = rs.getInt(1);//해당되는 번호를 자동으로 넣어주는거
            String wkName = rs.getString(2);
            String wkTelNo = rs.getString(3);
            String wkAddress = rs.getString(4);
            String wkEmail = rs.getString(5);
            String wkRelation = rs.getString(6);

            dto = new Dto(wkSeq, wkName, wkTelNo, wkAddress, wkEmail, wkRelation);

         }

         conn_mysql.close();// 불러온 DB를 닫아 줘야함.

      } catch (Exception e) {
         e.printStackTrace();
      }

      return dto;
   }

   // 조건 검색 결과를 Table로
   public ArrayList<Dto> conditionList() {//조건 검색 결과

      ArrayList<Dto> dtoList = new ArrayList<Dto>();
      String whereStatement = "select seqno,name,telno,relation from userinfo ";
      String whereStatement2 = "where " + connanme + " like '%" + condata + "%'";
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         // DB불러오기
         Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
               DBConnect.pw_mysql);// 선언
         Statement stmt_mysql = conn_mysql.createStatement();
         // 불러올 때 java.sql을 불러와야함.

         ResultSet rs = stmt_mysql.executeQuery(whereStatement + whereStatement2);

         while (rs.next()) {

            int wkSeq = rs.getInt(1);
            String wkName = rs.getString(2);
            String wkTelno = rs.getString(3);
            String wkRelation = rs.getString(4);

            Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation);
            dtoList.add(dto);

         }

         conn_mysql.close();// 불러온 DB를 닫아 줘야함.

      } catch (Exception e) {
         e.printStackTrace();
      }

      return dtoList;
   }

   // 삭제
   public boolean deleteAction() {
      PreparedStatement ps = null;
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         // DB불러오기
         Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
               DBConnect.pw_mysql);// 선언
         Statement stmt_mysql = conn_mysql.createStatement();
         // 불러올 때 java.sql을 불러와야함.

         String query = "delete from userinfo where seqno=? ";

         ps = conn_mysql.prepareStatement(query);
         ps.setInt(1, seqno);
         ps.executeUpdate();

         conn_mysql.close();// 불러온 DB를 닫아 줘야함.

      } catch (Exception e) {
         e.printStackTrace();
         return false;
      }
      return true;
   }
   
   private ArrayList<Dto> insertAction() {
	PreparedStatement ps = null;
	
    ArrayList<Dto> dtoList = new ArrayList<Dto>();
    
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
				DBConnect.pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();

		String query = "insert into userinfo (name, telno, address, email, relation) ";
		String query2 = "values (?, ?, ?, ?, ?)";
//		int seqno = Integer.parseInt(name.getText().trim());
		
		ps = conn_mysql.prepareStatement(query + query2);
		ps.setString(1, name);
		ps.setString(2, telno);
		ps.setString(3, address);
		ps.setString(4, email);
		ps.setString(5, relation);
		ps.executeUpdate();

		conn_mysql.close();

		JOptionPane.showMessageDialog(null, name + "님의 정보가 입력 되었습니다.");

		Dto dto=new Dto(name,telno,address,email,relation);
		dtoList.add(dto);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return dtoList;
   }
   
//   public Dto(String name, String telno, String address, String email, String relation) {//값을 전달해줄 것
//	super();
//	this.name = name;
//	this.telno = telno;
//	this.address = address;
//	this.email = email;
//	this.relation = relation;
//}

//   ArrayList<Dto> dtoList = new ArrayList<Dto>();
//   String whereStatement = "select seqno,name,telno,relation from userinfo ";
//   String whereStatement2 = "where " + connanme + " like '%" + condata + "%'";
//   try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      // DB불러오기
//      Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
//            DBConnect.pw_mysql);// 선언
//      Statement stmt_mysql = conn_mysql.createStatement();
//      // 불러올 때 java.sql을 불러와야함.
//
//      ResultSet rs = stmt_mysql.executeQuery(whereStatement + whereStatement2);
//
//      while (rs.next()) {
//
//         int wkSeq = rs.getInt(1);
//         String wkName = rs.getString(2);
//         String wkTelno = rs.getString(3);
//         String wkRelation = rs.getString(4);
//
//         Dto dto = new Dto(wkSeq, wkName, wkTelno, wkRelation);
//         dtoList.add(dto);
//
//      }
//
//      conn_mysql.close();// 불러온 DB를 닫아 줘야함.
//
//   } catch (Exception e) {
//      e.printStackTrace();
//   }
//
//   return dtoList;
   
}