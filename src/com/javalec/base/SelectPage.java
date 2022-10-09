package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;

import com.javalec.dao.Logindao;
import com.javalec.dto.LoginDto;
import com.javalec.util.DBConnect;
import com.javalec.util.LoginCustid;

import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectPage {

	private JFrame frame;
	private JButton btnSearch;
	private JButton btnOrder;
	private JLabel lblNewLabel;
	private JButton btnOrderPage;
	private JButton btnLogOut;
	private JButton btnMypage;
	private JButton btnStoreLocation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectPage window = new SelectPage();
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
	public SelectPage() {
		initialize();
		checkDuplicate();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("선택페이지");
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getBtnSearch());
		frame.getContentPane().add(getBtnOrder());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getBtnOrderPage());
		frame.getContentPane().add(getBtnLogOut());
		frame.getContentPane().add(getBtnMypage());
		frame.getContentPane().add(getBtnStoreLocation());
	}

	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색");
			btnSearch.setFont(new Font("굴림", Font.PLAIN, 20));
			btnSearch.setBounds(0, 64, 436, 53);
		}
		return btnSearch;
	}
	private JButton getBtnOrder() {
		if (btnOrder == null) {
			btnOrder = new JButton("주문하기");
			btnOrder.setFont(new Font("굴림", Font.PLAIN, 20));
			btnOrder.setBounds(0, 412, 436, 58);
		}
		return btnOrder;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			
			lblNewLabel = new JLabel();
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 349, 436, 53);
		}
		return lblNewLabel;
	}
	private JButton getBtnOrderPage() {
		if (btnOrderPage == null) {
			btnOrderPage = new JButton("주문목록");
			btnOrderPage.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnOrderPage.setBounds(0, 468, 211, 75);
		}
		return btnOrderPage;
	}
	private JButton getBtnLogOut() {
		if (btnLogOut == null) {
			btnLogOut = new JButton("로그아웃");
			btnLogOut.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					Login.main(null);
				}
			});
			btnLogOut.setBounds(225, 468, 211, 75);
		}
		return btnLogOut;
	}
	private JButton getBtnMypage() {
		if (btnMypage == null) {
			btnMypage = new JButton("마이 페이지");
			btnMypage.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					Mypage.main(null);
				}
			});
			btnMypage.setBounds(0, 578, 211, 75);
		}
		return btnMypage;
	}
	private JButton getBtnStoreLocation() {
		if (btnStoreLocation == null) {
			btnStoreLocation = new JButton("매장위치");
			btnStoreLocation.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			btnStoreLocation.setBounds(225, 578, 211, 75);
		}
		return btnStoreLocation;
	}
	
	 
		private void checkDuplicate() {

			Logindao logindao = new Logindao();
			ArrayList<LoginDto> dtoList = logindao.VeiwName();//사용자의 이름을 가져옵니다.
			int listCount=dtoList.size();

			for(int index=0;index<listCount;index++) {
					lblNewLabel.setText(dtoList.get(index).getCustid()+"님 환영합니다!!");
			//환영 멘트
			}
		}
	 
}
