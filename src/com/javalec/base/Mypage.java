package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Mypage {

	private JFrame frame;
	private JLabel lblWelcome;
	private JLabel lblCustname;
	private JLabel lblMyPage;
	private JButton btnBack;
	private JLabel lblCustid;
	private JLabel lblPhone;
	private JLabel lblPassword;
	private JLabel lblPasswordCheck;
	private JLabel lblSavePoint;
	private JTextField tfCustname;
	private JTextField tfCustid;
	private JTextField tfPhone;
	private JTextField tfPassword;
	private JTextField tfPasswordCheck;
	private JTextField tfSavePoint;
	private JButton btnSecession;
	private JButton btnOrderCheck;
	private JLabel lblEmail;
	private JTextField tfEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mypage window = new Mypage();
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
	public Mypage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("마이 페이지");
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblWelcome());
		frame.getContentPane().add(getLblCustname());
		frame.getContentPane().add(getLblMyPage());
		frame.getContentPane().add(getBtnBack());
		frame.getContentPane().add(getLblCustid());
		frame.getContentPane().add(getLblPhone());
		frame.getContentPane().add(getLblPassword());
		frame.getContentPane().add(getLblPasswordCheck());
		frame.getContentPane().add(getLblSavePoint());
		frame.getContentPane().add(getTfCustname());
		frame.getContentPane().add(getTfCustid());
		frame.getContentPane().add(getTfPhone());
		frame.getContentPane().add(getTfPassword());
		frame.getContentPane().add(getTfPasswordCheck());
		frame.getContentPane().add(getTfSavePoint());
		frame.getContentPane().add(getBtnSecession());
		frame.getContentPane().add(getBtnOrderCheck());
		frame.getContentPane().add(getLblEmail());
		frame.getContentPane().add(getTextField_3());
	}

	private JLabel getLblWelcome() {
		if (lblWelcome == null) {
			lblWelcome = new JLabel("ㄹㄴㅇㅁ");
			lblWelcome.setFont(new Font("굴림", Font.PLAIN, 15));
			lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
			lblWelcome.setBounds(0, 116, 436, 49);
		}
		return lblWelcome;
	}
	private JLabel getLblCustname() {
		if (lblCustname == null) {
			lblCustname = new JLabel("성함:");
			lblCustname.setFont(new Font("굴림", Font.PLAIN, 15));
			lblCustname.setBounds(0, 274, 175, 37);
		}
		return lblCustname;
	}
	private JLabel getLblMyPage() {
		if (lblMyPage == null) {
			lblMyPage = new JLabel("마이 페이지");
			lblMyPage.setHorizontalAlignment(SwingConstants.CENTER);
			lblMyPage.setFont(new Font("굴림", Font.PLAIN, 20));
			lblMyPage.setBounds(93, 47, 264, 62);
		}
		return lblMyPage;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("뒤로 가기");
			btnBack.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
						frame.setVisible(false);
						SelectPage.main(null);
				}
			});
			btnBack.setBounds(0, 69, 91, 23);
		}
		return btnBack;
	}
	private JLabel getLblCustid() {
		if (lblCustid == null) {
			lblCustid = new JLabel("아이디:");
			lblCustid.setFont(new Font("굴림", Font.PLAIN, 15));
			lblCustid.setBounds(0, 235, 175, 37);
		}
		return lblCustid;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("전화번호:");
			lblPhone.setFont(new Font("굴림", Font.PLAIN, 15));
			lblPhone.setBounds(0, 321, 175, 37);
		}
		return lblPhone;
	}
	
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email:");
			lblEmail.setFont(new Font("굴림", Font.PLAIN, 15));
			lblEmail.setBounds(0, 368, 175, 37);
		}
		return lblEmail;
	}
	private JTextField getTextField_3() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setColumns(10);
			tfEmail.setBounds(199, 376, 237, 21);
		}
		return tfEmail;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("비밀번호 변경");
			lblPassword.setFont(new Font("굴림", Font.PLAIN, 15));
			lblPassword.setBounds(0, 418, 175, 37);
		}
		return lblPassword;
	}
	private JLabel getLblPasswordCheck() {
		if (lblPasswordCheck == null) {
			lblPasswordCheck = new JLabel("비밀번호 변경확인");
			lblPasswordCheck.setFont(new Font("굴림", Font.PLAIN, 15));
			lblPasswordCheck.setBounds(0, 469, 175, 37);
		}
		return lblPasswordCheck;
	}
	private JLabel getLblSavePoint() {
		if (lblSavePoint == null) {
			lblSavePoint = new JLabel("보유 포인트");
			lblSavePoint.setFont(new Font("굴림", Font.PLAIN, 15));
			lblSavePoint.setBounds(0, 516, 175, 37);
		}
		return lblSavePoint;
	}
	private JTextField getTfCustname() {
		if (tfCustname == null) {
			tfCustname = new JTextField();
			tfCustname.setBounds(281, 282, 155, 21);
			tfCustname.setColumns(10);
		}
		return tfCustname;
	}
	private JTextField getTfCustid() {
		if (tfCustid == null) {
			tfCustid = new JTextField();
			tfCustid.setEditable(false);
			tfCustid.setEnabled(false);
			tfCustid.setColumns(10);
			tfCustid.setBounds(281, 243, 155, 21);
		}
		return tfCustid;
	}
	private JTextField getTfPhone() {
		if (tfPhone == null) {
			tfPhone = new JTextField();
			tfPhone.setColumns(10);
			tfPhone.setBounds(199, 329, 237, 21);
		}
		return tfPhone;
	}
	private JTextField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JTextField();
			tfPassword.setColumns(10);
			tfPassword.setBounds(233, 426, 203, 21);
		}
		return tfPassword;
	}
	private JTextField getTfPasswordCheck() {
		if (tfPasswordCheck == null) {
			tfPasswordCheck = new JTextField();
			tfPasswordCheck.setColumns(10);
			tfPasswordCheck.setBounds(233, 477, 203, 21);
		}
		return tfPasswordCheck;
	}
	private JTextField getTfSavePoint() {
		if (tfSavePoint == null) {
			tfSavePoint = new JTextField();
			tfSavePoint.setEditable(false);
			tfSavePoint.setEnabled(false);
			tfSavePoint.setColumns(10);
			tfSavePoint.setBounds(281, 524, 155, 21);
		}
		return tfSavePoint;
	}
	private JButton getBtnSecession() {
		if (btnSecession == null) {
			btnSecession = new JButton("탈퇴하기");
			btnSecession.setBounds(33, 579, 91, 23);
		}
		return btnSecession;
	}
	private JButton getBtnOrderCheck() {
		if (btnOrderCheck == null) {
			btnOrderCheck = new JButton("주문 확인");
			btnOrderCheck.setBounds(333, 614, 91, 23);
		}
		return btnOrderCheck;
	}

}
