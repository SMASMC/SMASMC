package com.javalec.base;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tFNum1;
	private JTextField tFNum2;
	private JTextField tFSum;
	private JLabel lblppo;
	private JLabel equl;
	private JTextField InNum1;
	private JTextField InNum2;
	private JLabel lblNum1;
	private JLabel lblNum2;
	private JButton Sum;
	private JButton Subt;
	private JButton btnX;
	private JButton btnNanoom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
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
	public GUI01() {
		initialize();
		JOptionPane.showMessageDialog(null, "숫자만 입력하세요!");
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTFNum1());
		frame.getContentPane().add(getTFNum2());
		frame.getContentPane().add(getTFSum());
		frame.getContentPane().add(getLblppo());
		frame.getContentPane().add(getEqul());
		frame.getContentPane().add(getInNum1());
		frame.getContentPane().add(getInNum2());
		frame.getContentPane().add(getLblNum1());
		frame.getContentPane().add(getLblNum2());
		frame.getContentPane().add(getSum());
		frame.getContentPane().add(getSubt());
		frame.getContentPane().add(getBtnX());
		frame.getContentPane().add(getBtnNanoom());
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("두개의 숫자 가감승제");
			lblNewLabel.setBounds(147, 20, 179, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTFNum1() {
		if (tFNum1 == null) {
			tFNum1 = new JTextField();
			tFNum1.setBounds(25, 209, 81, 27);
			tFNum1.setColumns(10);
		}
		return tFNum1;
	}

	private JTextField getTFNum2() {
		if (tFNum2 == null) {
			tFNum2 = new JTextField();
			tFNum2.setColumns(10);
			tFNum2.setBounds(159, 209, 81, 27);
		}
		return tFNum2;
	}
	private JTextField getTFSum() {
		if (tFSum == null) {
			tFSum = new JTextField();
			tFSum.setColumns(10);
			tFSum.setBounds(308, 209, 81, 27);
		}
		return tFSum;
	}
	private JLabel getLblppo() {
		if (lblppo == null) {
			lblppo = new JLabel("+");
			lblppo.setBounds(118, 215, 57, 15);
		}
		return lblppo;
	}
	private JLabel getEqul() {
		if (equl == null) {
			equl = new JLabel("=");
			equl.setBounds(269, 215, 57, 15);
		}
		return equl;
	}
	
	//-------------------

	private JTextField getInNum1() {
		if (InNum1 == null) {
			InNum1 = new JTextField();
			InNum1.setBounds(88, 45, 116, 21);
			InNum1.setColumns(10);
		}
		return InNum1;
	}
	private JTextField getInNum2() {
		if (InNum2 == null) {
			InNum2 = new JTextField();
			InNum2.setBounds(88, 89, 116, 21);
			InNum2.setColumns(10);
		}
		return InNum2;
	}
	private JLabel getLblNum1() {
		if (lblNum1 == null) {
			lblNum1 = new JLabel("숫자1:");
			lblNum1.setBounds(25, 45, 57, 15);
		}
		return lblNum1;
	}
	private JLabel getLblNum2() {
		if (lblNum2 == null) {
			lblNum2 = new JLabel("숫자2:");
			lblNum2.setBounds(25, 92, 57, 15);
		}
		return lblNum2;
	}
	private JButton getSum() {
		if (Sum == null) {
			Sum = new JButton("+");
			Sum.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					addSum();
				}
			});
			
			Sum.setBounds(216, 44, 97, 23);
		}
		return Sum;
	}
	private JButton getSubt() {
		if (Subt == null) {
			Subt = new JButton("-");
			Subt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Subt();
				}
			});
			Subt.setBounds(325, 45, 97, 23);
		}
		return Subt;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("X");
			btnX.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Mul();
				}
			});
			btnX.setBounds(216, 88, 97, 23);
		}
		return btnX;
	}
	private JButton getBtnNanoom() {
		if (btnNanoom == null) {
			btnNanoom = new JButton("/");
			btnNanoom.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Nanoop();
				}
			});
			btnNanoom.setBounds(325, 88, 97, 23);
		}
		return btnNanoom;
	}
	
	private void addSum() {
		int wkNum1=Integer.parseInt(InNum1.getText());
		int wkNum2=Integer.parseInt(InNum2.getText());
		String wkResult=Integer.toString(wkNum1+wkNum2);
		tFNum1.setText(InNum1.getText());
		tFNum2.setText(InNum2.getText());
		tFSum.setText(wkResult);
	}
	private void Subt() {
		int wkNum1=Integer.parseInt(InNum1.getText());
		int wkNum2=Integer.parseInt(InNum2.getText());
		String wkResult=Integer.toString(wkNum1-wkNum2);
		tFNum1.setText(InNum1.getText());
		tFNum2.setText(InNum2.getText());
		tFSum.setText(wkResult);
	}
	private void Mul() {
		int wkNum1=Integer.parseInt(InNum1.getText());
		int wkNum2=Integer.parseInt(InNum2.getText());
		String wkResult=Integer.toString(wkNum1*wkNum2);
		tFNum1.setText(InNum1.getText());
		tFNum2.setText(InNum2.getText());
		tFSum.setText(wkResult);
	}
	private void Nanoop() {
		int wkNum1=Integer.parseInt(InNum1.getText());
		int wkNum2=Integer.parseInt(InNum2.getText());
		String wkResult=Integer.toString(wkNum1/wkNum2);
		
		tFNum1.setText(InNum1.getText());
		tFNum2.setText(InNum2.getText());
			tFSum.setText(wkResult);
	}
}
