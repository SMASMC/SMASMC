package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.javalec.dao.Logindao;
import com.javalec.dto.LoginDto;
import com.javalec.util.LoginCustid;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField tfCustid;
	private JLabel lblNewLabel;
	private JButton btnLogin;
	private JButton btnSignup;
	private JPasswordField pfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("5조벅스");
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfCustid());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getBtnLogin());
		frame.getContentPane().add(getBtnSignup());
		frame.getContentPane().add(getPfPassword());
	}
	private JTextField getTfCustid() {
		if (tfCustid == null) {
			tfCustid = new JTextField();
			tfCustid.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
//					clearColumn();//눌렀을 경우 아무런 화면 없음을 나타내기
					tfCustid.setText("");
				}
			});
			tfCustid.setText("Email address");
			tfCustid.setBounds(37, 435, 360, 21);
			tfCustid.setColumns(10);
		}
		return tfCustid;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("5조 벅스");
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 38));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(110, 66, 223, 92);
		}
		return lblNewLabel;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Log in");
			btnLogin.setFont(new Font("굴림", Font.PLAIN, 20));
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loginAction();
				}
			});
			btnLogin.setBounds(0, 559, 436, 48);
		}
		return btnLogin;
	}
	private JButton getBtnSignup() {
		if (btnSignup == null) {
			btnSignup = new JButton("회원가입");
			btnSignup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Signup.main(null);//회원가입 페이지를 가져옴
					frame.setVisible(false);//기존에 있던 창을 닫고 새로운 창으로 넘어감
				}
			});
			btnSignup.setFont(new Font("굴림", Font.PLAIN, 20));
			btnSignup.setBounds(0, 605, 436, 48);
		}
		return btnSignup;
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

			pfPassword.setBounds(37, 466, 360, 21);
		}
		return pfPassword;
	}
	private void clearColumn() {
		tfCustid.setText("");
		pfPassword.setText("");
	}


	private void loginAction() {

		Logindao logindao=new Logindao();
		ArrayList<LoginDto>dtoList=logindao.loginAction(tfCustid.getText());
		String id=tfCustid.getText();
		String password=pfPassword.getText();
		int confirm=0;//로그인을 실패하였을 경우 카운트+1
		for(int index=0;index<dtoList.size();index++) {
			if(dtoList.get(index).getCustid().equals(id)&&dtoList.get(index).getCustpassword().equals(password)) {
				JOptionPane.showMessageDialog(null, "로그인하였습니다.");//참조하는 아이디고유의 아이디pk를 입력하여 이에대한 정보를 가져옴
				LoginCustid.setCustid(tfCustid.getText());
				SelectPage.main(null);//선택페이지를 가져옴
				frame.setVisible(false);//기존에 있던 창을 닫고 새로운 창으로 넘어감
				break;
			}
			confirm+=1;
		}
		if(confirm==dtoList.size()) {
			JOptionPane.showConfirmDialog(null, "잘못 입력했거나 탈퇴한 회원입니다. 다시 로그인해주세요.");
		}
	}

}//endline