package com.javalec.base;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.dao.Dao;
import com.javalec.dto.Dto;
import com.javalec.util.DBConnect;

public class Address {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JLabel lblSequenceNo;
	private JTextField tfSeqno;
	private JLabel lblName;
	private JTextField tfName;
	private JLabel lblTelNo;
	private JTextField tfTelNo;
	private JLabel lblAddress;
	private JTextField tfAddress;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JLabel lblRelation;
	private JTextField tfRelation;

	// --Table Definition
	private final DefaultTableModel Outer_Table = new DefaultTableModel(); // 이게 정말 중요!!!!!!!!!!!!!!!!!!!!!!
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnInput;
	private JButton btnInsert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Address window = new Address();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Address() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				tableInit();
				searchAction();
			}
		});
		frame.setTitle("주소록");
		frame.setBounds(100, 100, 631, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblSequenceNo());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getLblName());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblTelNo());
		frame.getContentPane().add(getTfTelNo());
		frame.getContentPane().add(getLblAddress());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblEmail());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblRelation());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getBtnDelete());
		frame.getContentPane().add(getBtnUpdate());
		frame.getContentPane().add(getBtnInsert());
	}

	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] { "이름", "전화번호", "관계" }));
			cbSelection.setBounds(26, 24, 81, 29);
		}
		return cbSelection;
	}

	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(119, 28, 208, 21);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}

	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			btnQuery.setBounds(339, 27, 97, 23);
		}
		return btnQuery;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(36, 63, 474, 102);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}

	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (e.getButton() == 1) {// 버튼 눌렀을경우 발생
						tableClick();// JTable안에서 버튼 클릭이 발생했을 경우에 발생시킨다.
					}
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table);// ***********************8
		}
		return Inner_Table;
	}

	private JLabel getLblSequenceNo() {
		if (lblSequenceNo == null) {
			lblSequenceNo = new JLabel("Sequence No");
			lblSequenceNo.setBounds(57, 184, 105, 15);
		}
		return lblSequenceNo;
	}

	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setBounds(184, 181, 58, 21);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}

	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("이름");
			lblName.setBounds(57, 212, 105, 15);
		}
		return lblName;
	}

	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setColumns(10);
			tfName.setBounds(184, 209, 91, 21);
		}
		return tfName;
	}

	private JLabel getLblTelNo() {
		if (lblTelNo == null) {
			lblTelNo = new JLabel("전화번호");
			lblTelNo.setBounds(57, 240, 105, 15);
		}
		return lblTelNo;
	}

	private JTextField getTfTelNo() {
		if (tfTelNo == null) {
			tfTelNo = new JTextField();
			tfTelNo.setColumns(10);
			tfTelNo.setBounds(184, 237, 143, 21);
		}
		return tfTelNo;
	}

	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("주소");
			lblAddress.setBounds(57, 271, 105, 15);
		}
		return lblAddress;
	}

	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setColumns(10);
			tfAddress.setBounds(184, 268, 252, 21);
		}
		return tfAddress;
	}

	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("전자우편");
			lblEmail.setBounds(57, 302, 105, 15);
		}
		return lblEmail;
	}

	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(184, 299, 215, 21);
		}
		return tfEmail;
	}

	private JLabel getLblRelation() {
		if (lblRelation == null) {
			lblRelation = new JLabel("관계");
			lblRelation.setBounds(57, 338, 105, 15);
		}
		return lblRelation;
	}

	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setColumns(10);
			tfRelation.setBounds(184, 335, 191, 21);
		}
		return tfRelation;
	}

	private void tableInit() {

		Outer_Table.addColumn("순서");
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");

		Outer_Table.setColumnCount(4);
		int i = Outer_Table.getRowCount();
		for (int j = 0; j < i; j++) {
			Outer_Table.removeRow(0);// 0부터 지우니까 계속해서 지우면 0으로 올라가고 0번째로 올라오는 값들을 지워준다.
		}

		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);

		int vColIndex = 0;// 배열처럼 0번부터
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);

		vColIndex = 1;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);

		vColIndex = 2;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);

		vColIndex = 3;
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);
	}

	// DB to Table
	private void searchAction() {
		Dao dao = new Dao();
		ArrayList<Dto> dtoList = dao.selectList();

		int listCount = dtoList.size();

		for (int index = 0; index < listCount; index++) {
			String temp = Integer.toString(dtoList.get(index).getSeqno());
			String[] qTxt = { temp, dtoList.get(index).getName(), dtoList.get(index).getTelno(),
					dtoList.get(index).getRelation() };

			Outer_Table.addRow(qTxt);// 누적됨.
		}

//      
	}

	// Table click
	private void tableClick() {// 몇번째 줄을 클릭했는지 안려주는 메소드
		int i = Inner_Table.getSelectedRow();// 몇번째 줄인지 알려주는 역할
		String wkSequence = (String) Inner_Table.getValueAt(i, 0);// 그줄에 해당되는 값을 가져오기때문에 String
		Dao dao = new Dao(Integer.parseInt(wkSequence));

		Dto dto = dao.tableCLick();
		tfSeqno.setText(Integer.toString(dto.getSeqno()));
		tfName.setText(dto.getName());
		tfTelNo.setText(dto.getTelno());
		tfAddress.setText(dto.getAddress());
		tfEmail.setText(dto.getEmail());
		tfRelation.setText(dto.getRelation());

	}

	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String conditionQueryColumn = "";
		switch (i) {
		case 0: {
			conditionQueryColumn = "name";// 이름일 경우
			break;
		}
		case 1: {
			conditionQueryColumn = "Telno";// 전화번호 넣어줌
			break;
		}
		case 2: {
			conditionQueryColumn = "relation";// 관계일 경우
			break;
		}
		default:
			break;
		}

		tableInit();
		clearColumn();
		conditionQueryAction(conditionQueryColumn);

	}

	private void clearColumn() {
		tfSeqno.setText("");
		tfName.setText("");
		tfTelNo.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}

	private void conditionQueryAction(String conditionQueryColumn) {

		Dao dao = new Dao(conditionQueryColumn, tfSelection.getText());
		ArrayList<Dto> dtoList = dao.conditionList();

		int listCount = dtoList.size();

		for (int index = 0; index < listCount; index++) {
			String temp = Integer.toString(dtoList.get(index).getSeqno());
			String[] qTxt = { temp, dtoList.get(index).getName(), dtoList.get(index).getTelno(),
					dtoList.get(index).getRelation() };

			Outer_Table.addRow(qTxt);
		}

	}

	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					deleteAction();// 삭제하고
					tableInit();// 삭제된 후의
					searchAction();// 저장되면서 정리된 자료를 보여준다.
					clearColumn();
				}
			});
			btnDelete.setBounds(478, 400, 91, 23);
		}
		return btnDelete;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					updateAction();
					tableInit();
					searchAction();
					clearColumn();
				}
			});
			btnUpdate.setBounds(325, 400, 130, 23);
		}
		return btnUpdate;
	}
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("입력");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insertAction();
					tableInit();
					searchAction();
					clearColumn();
				}
			});
			btnInsert.setBounds(197, 400, 97, 23);
		}
		return btnInsert;
	}


	private void updateAction() {
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB불러오기
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);// 선언
			Statement stmt_mysql = conn_mysql.createStatement();
			// 불러올 때 java.sql을 불러와야함.

			String query = "update userinfo set name=?, telno = ?, address = ?, email = ?, relation = ? ";
			String query2 = "where seqno = ?";
			ps = conn_mysql.prepareStatement(query + query2);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelNo.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.setInt(6, Integer.parseInt(tfSeqno.getText()));
			ps.executeUpdate();

			conn_mysql.close();// 불러온 DB를 닫아 줘야함.

			JOptionPane.showMessageDialog(null, tfSeqno.getText() + "해당사항을 수정하겠습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private void insertAction() {//삽입
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(DBConnect.url_mysql, DBConnect.id_mysql,
					DBConnect.pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();

			String query = "insert into userinfo (name, telno, address, email, relation) ";
			String query2 = "values (?, ?, ?, ?, ?)";

			ps = conn_mysql.prepareStatement(query + query2);
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelNo.getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.executeUpdate();

			conn_mysql.close();

			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void deleteAction() {//삭제

		int seqno = Integer.parseInt(tfSeqno.getText());

		Dao dao = new Dao(seqno);
		boolean ok = dao.deleteAction();

		if (ok == true) {
			JOptionPane.showMessageDialog(null, tfSeqno.getText() + "해당사항을 삭제하겠습니다.");

		} else {
			JOptionPane.showMessageDialog(null, "DB작업중 문제가 발생했습니다. \n행정실로 문의 하세요!");
		}
	}

}// EndLine