package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.javalec.dao.Logindao;
import com.javalec.dto.LoginDto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Signup {

	String custid;
	String custpassword;
	String custname;
	String custphone;
	String custaddress;
	String custemail;

	private JFrame frame;
	private JTextField tfCustid;
	private JButton btnDuplicate;
	private JTextField tfCustname;
	private JTextField tfCustphone;
	private JTextField tfCustaddress;
	private JTextField tfCustemail;
	private JButton btnSignup;
	private JPasswordField pfPassword;
	private JPasswordField pfPasswordCheck;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("회원가입");
		frame.setBounds(100, 100, 450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfCustid());
		frame.getContentPane().add(getBtnDuplicate());
		frame.getContentPane().add(getTextField_3());
		frame.getContentPane().add(getTextField_1_1());
		frame.getContentPane().add(getTextField_2_1());
		frame.getContentPane().add(getTextField_4());
		frame.getContentPane().add(getBtnSignup());
		frame.getContentPane().add(getPfPassword());
		frame.getContentPane().add(getPfPasswordCheck());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getBtnBack());
	}

	private JTextField getTfCustid() {
		if (tfCustid == null) {
			tfCustid = new JTextField();
			tfCustid.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfCustid.setText("");
				}
			});
			tfCustid.setText("아이디를 입력하세요");
			tfCustid.setBounds(65, 411, 208, 21);
			tfCustid.setColumns(10);
		}
		return tfCustid;
	}

	private JButton getBtnDuplicate() {
		if (btnDuplicate == null) {
			btnDuplicate = new JButton("중복확인");
			btnDuplicate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkDuplicate();
				}
			});
			btnDuplicate.setBounds(274, 410, 91, 23);
		}
		return btnDuplicate;
	}

	private JTextField getTextField_3() {
		if (tfCustname == null) {
			tfCustname = new JTextField();
			tfCustname.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfCustname.setText("");
				}
			});
			tfCustname.setText("이름을 입력하세요");
			tfCustname.setColumns(10);
			tfCustname.setBounds(65, 502, 300, 21);
		}
		return tfCustname;
	}

	private JTextField getTextField_1_1() {
		if (tfCustphone == null) {
			tfCustphone = new JTextField();
			tfCustphone.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfCustphone.setText("");
				}
			});
			tfCustphone.setText("전화번호를 입력하세요");
			tfCustphone.setColumns(10);
			tfCustphone.setBounds(65, 533, 300, 21);
		}
		return tfCustphone;
	}

	private JTextField getTextField_2_1() {
		if (tfCustaddress == null) {
			tfCustaddress = new JTextField();
			tfCustaddress.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfCustaddress.setText("");
				}
			});
			tfCustaddress.setText("주소를 입력하세요");
			tfCustaddress.setColumns(10);
			tfCustaddress.setBounds(65, 564, 300, 21);
		}
		return tfCustaddress;
	}

	private JTextField getTextField_4() {
		if (tfCustemail == null) {
			tfCustemail = new JTextField();
			tfCustemail.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tfCustemail.setText("");
				}
			});
			tfCustemail.setText("이메일을 입력하세요");
			tfCustemail.setColumns(10);
			tfCustemail.setBounds(65, 595, 300, 21);
		}
		return tfCustemail;
	}

	private JButton getBtnSignup() {
		if (btnSignup == null) {
			btnSignup = new JButton("회원가입");
			btnSignup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insertAction();
				}
			});
			btnSignup.setBounds(0, 685, 436, 68);
		}
		return btnSignup;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("비밀번호");
			lblNewLabel.setBounds(3, 446, 50, 15);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("비밀번호 확인");
			lblNewLabel_1.setBounds(0, 474, 86, 15);
		}
		return lblNewLabel_1;
	}

	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField("*******");
			pfPassword.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					pfPassword.setText("");
				}
			});
			pfPassword.setBounds(98, 442, 267, 21);
		}
		return pfPassword;
	}

	private JPasswordField getPfPasswordCheck() {
		if (pfPasswordCheck == null) {
			pfPasswordCheck = new JPasswordField("*******");
			pfPasswordCheck.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					pfPasswordCheck.setText("");
				}
			});
			pfPasswordCheck.setBounds(98, 471, 267, 21);
		}
		return pfPasswordCheck;
	}

	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("뒤로가기");
			btnBack.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.setVisible(false);
					Login.main(null);
				}
			});
			btnBack.setBounds(12, 22, 91, 23);
		}
		return btnBack;
	}

	private void insertAction() {// 값이 비거나 입력하지 않았을 경우 경고를 주고 입력값받아내야함

		String custid = tfCustid.getText();
		String custpassword = pfPassword.getText();
		String custpasswordcheck = pfPasswordCheck.getText();
		String custname = tfCustname.getText();
		String custphone = tfCustphone.getText();
		String custaddress = tfCustaddress.getText();
		String custemail = tfCustemail.getText();

		Logindao dao = new Logindao(custid, custpassword, custname, custphone, custaddress, custemail);
		boolean ok = dao.insertAction();// 값을 최종적으로 넣어주는 역할을 함

		if (custpassword.equals(custpasswordcheck)) {// 동일한지 확인하려면 equals사용해야함
			if (ok == true) {
				JOptionPane.showMessageDialog(null, "회원가입을 하였습니다.");
				frame.setVisible(false);
				Login.main(null);
			} else {
				JOptionPane.showMessageDialog(null, "DB문제입니다 문의센터에 연락하세요!");
				tfCustid.setText("");
				pfPassword.setText("");
				pfPasswordCheck.setText("");
				tfCustname.setText("");
				tfCustphone.setText("");
				tfCustaddress.setText("");
				tfCustemail.setText("");
			}
		} else {
			JOptionPane.showMessageDialog(null, "비밀번호가 동일한지 확인해주세요!");
			pfPassword.setText("");
			pfPasswordCheck.setText("");

		}
	}

	private void checkDuplicate() {

		Logindao logindao = new Logindao();
		ArrayList<LoginDto> dtoList = logindao.checkDuplicate();
		String id = tfCustid.getText();

		int notDuplicate = 0;

		for (int index = 0; index < dtoList.size(); index++) {
			if (dtoList.get(index).getCustid().equals(id)) {
				JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다.");
				tfCustid.setText("");
				break;
			}
			notDuplicate += 1;
		}

		if (notDuplicate == dtoList.size()) {
			JOptionPane.showMessageDialog(null, "아이디를 사용할 수 있습니다.");
		}
	}

}// endline
