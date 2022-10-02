package com.javalec.base;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javalec.dao.Dao;
import com.javalec.dto.Dto;
import com.javalec.util.DBConnect;

import javax.swing.JButton;

public class Mypage {

//	private static final String cdeletedate = null;
	private JFrame frmMypage;
	private JLabel lblcustid;
	private JTextField tfcustid;
	private JTextField tfcname;
	private JLabel lblcname;
	private JTextField tfcdate;
	private JLabel lblcdate;
	private JButton btnTal;
	private JButton btnupdate;
	private JButton btnexit;
	private final DefaultTableModel Outer_Table = new DefaultTableModel();
	private JTextField textField;
//	private Object cdeletedate;

//값들을 저장하는 final
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mypage window = new Mypage();
					window.frmMypage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mypage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMypage = new JFrame();

		frmMypage.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				informationlogin();// 창을 띄웠을 때 바로 값을 나타내 줄 수 있도록 하는 것
			}
		});
		frmMypage.setTitle("MyPage");
		frmMypage.setBounds(100, 100, 450, 300);
		frmMypage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMypage.getContentPane().setLayout(null);
		frmMypage.getContentPane().add(getLblcustid());
		frmMypage.getContentPane().add(getTfcustid());
		frmMypage.getContentPane().add(getTfcname());
		frmMypage.getContentPane().add(getLblcname());
		frmMypage.getContentPane().add(getTfcdate());
		frmMypage.getContentPane().add(getLblcdate());
		frmMypage.getContentPane().add(getBtnTal());
		frmMypage.getContentPane().add(getBtnupdate());
		frmMypage.getContentPane().add(getBtnexit());
		frmMypage.getContentPane().add(getTextField());
	}

	private JLabel getLblcustid() {
		if (lblcustid == null) {
			lblcustid = new JLabel("고객 ID:");
			lblcustid.setBounds(42, 35, 57, 15);
		}
		return lblcustid;
	}

	private JTextField getTfcustid() {
		if (tfcustid == null) {
			tfcustid = new JTextField();
			tfcustid.setBounds(155, 32, 116, 21);
			tfcustid.setColumns(10);
		}
		return tfcustid;
	}

	private JTextField getTfcname() {
		if (tfcname == null) {
			tfcname = new JTextField();
			tfcname.setColumns(10);
			tfcname.setBounds(155, 100, 116, 21);
		}
		return tfcname;
	}

	private JLabel getLblcname() {
		if (lblcname == null) {
			lblcname = new JLabel("고객 이름:");
			lblcname.setBounds(42, 103, 57, 15);
		}
		return lblcname;
	}

	private JTextField getTfcdate() {
		if (tfcdate == null) {
			tfcdate = new JTextField();
			tfcdate.setColumns(10);
			tfcdate.setBounds(155, 156, 116, 21);
		}
		return tfcdate;
	}

	private JLabel getLblcdate() {
		if (lblcdate == null) {
			lblcdate = new JLabel("가입 일자:");
			lblcdate.setBounds(42, 159, 57, 15);
		}
		return lblcdate;
	}

	private JButton getBtnTal() {
		if (btnTal == null) {
			btnTal = new JButton("탈퇴");
			btnTal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					deletedate();
					clearColumn();
				}
			});
			btnTal.setBounds(29, 213, 97, 23);
		}
		return btnTal;
	}

	private JButton getBtnupdate() {
		if (btnupdate == null) {
			btnupdate = new JButton("정보수정");
			btnupdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					updateActions();
					clearColumn();
				}
			});
			btnupdate.setBounds(174, 213, 97, 23);
		}
		return btnupdate;
	}

	private JButton getBtnexit() {
		if (btnexit == null) {
			btnexit = new JButton("확인");
			btnexit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 상품list 클래스넣어주면됨.
//					initialize();
					System.exit(0);//확인버튼 누를시 바로 종료
				}
			});
			btnexit.setBounds(312, 213, 97, 23);
		}
		return btnexit;
	}

	private void clearColumn() {//적혀있던(표시되어있던) 값들을 비워줌
		tfcustid.setText("");
		tfcname.setText("");
		tfcdate.setText("");
	}

	private void informationlogin() {

		Dao dao = new Dao();
		ArrayList<Dto> dtoList = dao.information();

		int listCount = dtoList.size();

		for (int index = 0; index < listCount; index++) {
			{
				String temp = Integer.toString(dtoList.get(index).getCustNum());
				String[] qTxt = { temp, dtoList.get(index).getCustid(), dtoList.get(index).getCname(),
						dtoList.get(index).getCinitdate() };
				//값을 누적시킴

				Outer_Table.addRow(qTxt);// 누적됨.
				tfcustid.setText(dtoList.get(index).getCname());// 누적된 값을 뽑아줌.
				tfcname.setText(dtoList.get(index).getCinitdate());
				tfcdate.setText(dtoList.get(index).getCustid());
			}
		}

	}

	private void deletedate() {// 탈퇴날짜를 저장하기

		int seqno = Integer.parseInt(textField.getText());
		// 지정되는 번호(ID)에 now()데이터를 넣어준다.
		Dao dao = new Dao(tfcdate.getText(), seqno);
		boolean ok = dao.deletedate();
//		&&cdeletedate==null
		if (ok == true) {
			JOptionPane.showMessageDialog(null, textField.getText() + "해당사항을 삭제하겠습니다.");

		} else {
			JOptionPane.showMessageDialog(null, "DB작업중 문제가 발생했습니다. \n행정실로 문의 하세요!");
		}
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(10, 72, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}

	private void updateActions() {

		int custNum = Integer.parseInt(textField.getText());
		Dao dao = new Dao(custNum, tfcustid.getText(), tfcname.getText(), tfcdate.getText());
		boolean ok = dao.updateAction();

		if (ok == true) {
			JOptionPane.showMessageDialog(null, tfcname.getText() + "님의 정보가 수정 되었습니다.");
		} else {
			JOptionPane.showMessageDialog(null, "DB작업중 문제가 발생했습니다. \n전산실로 문의 하세요.");
		}

	}

}