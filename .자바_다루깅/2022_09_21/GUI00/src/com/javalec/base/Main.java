package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNation;
	private JButton btnOK;
	private JButton btnDialog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 192));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLabel_1());
		frame.getContentPane().add(getLblNation());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getBtnDialog());
		frame.setBackground(new Color(255, 128, 192));
		frame.setTitle("송명철");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Java Swing Button Test");
			lblNewLabel.setFont(new Font("Galaxy Game Plays Korean", Font.PLAIN, 15));
			lblNewLabel.setBounds(0, 8, 203, 84);
		}
		return lblNewLabel;
	}
	private JLabel getLblNation() {
		if (lblNation == null) {
			lblNation = new JLabel("송명철");
			lblNation.setBounds(13, 77, 57, 15);
		}
		return lblNation;
	}
	private JButton getBtnOK() {
		
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					changeText();//버튼을 눌렀을 때 메소드를 넘김
				}
			});
			btnOK.setBounds(165, 111, 97, 23);
		}
		return btnOK;
	}
	
	public void changeText() {//버튼을 눌렀을 때 이 메소드를 사용
		if(lblNation.getText().equals("Korea")) {
			lblNation.setText("대한민국");
			btnOK.setText("안녕?");
		}
		else {
			lblNation.setText("Korea");
			btnOK.setText("반가워!!");
		}
	}
	private JButton getBtnDialog() {
		if (btnDialog == null) {
			btnDialog = new JButton("Dialog");
			btnDialog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayDialog();
				}
			});
			btnDialog.setBounds(165, 144, 97, 23);
		}
		return btnDialog;
	}
	private void displayDialog() {//버튼을 눌렀을 때 새로운 창을 띄움.

		if(lblNation.getText().equals("Korea")) {
			lblNation.setText("대한민국");
//			btnDialog.setText("대한민국");
			JOptionPane.showMessageDialog(null, "대한민국");
		}
		else {
			lblNation.setText("Korea");
//			btnDialog.setText("Korea");
			JOptionPane.showMessageDialog(null, "Korea");
		}
	}
}
