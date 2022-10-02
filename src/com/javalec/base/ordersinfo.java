//주문정보나타냅니다.

package com.javalec.base;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.javalec.dao.Dao;
import com.javalec.dao.OrdersDao;
import com.javalec.dto.Dto;
import com.javalec.dto.OrdersDto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Set;
import java.awt.event.ActionEvent;

public class ordersinfo {

	private JFrame frame;
	private JLabel lblOrdersid;
	private JTextField tfOrdersid;
	private JLabel lblCustid;
	private JTextField tfCustid;
	private JLabel lblProductid;
	private JTextField tfProductid;
	private JLabel lblOsale;
	private JTextField tfOsale;
	private JLabel lblOdate;
	private JTextField tfOdate;
	private JLabel lblOcount;
	private JTextField tfOcount;
	private JButton btnNewButton;
	private final DefaultTableModel Outer_Table = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ordersinfo window = new ordersinfo();
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
	public ordersinfo() {
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
				odersInfo();// 창을 띄웠을 때 바로 값을 나타내 줄 수 있도록 하는 것
			}
		});
		frame.setTitle("주문정보");
		frame.setBounds(100, 100, 452, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblOrdersid());
		frame.getContentPane().add(getTfOrdersid());
		frame.getContentPane().add(getLblCustid());
		frame.getContentPane().add(getTfCustid());
		frame.getContentPane().add(getLblProductid());
		frame.getContentPane().add(getTfProductid());
		frame.getContentPane().add(getLblOsale());
		frame.getContentPane().add(getTfOsale());
		frame.getContentPane().add(getLblOdate());
		frame.getContentPane().add(getTfOdate());
		frame.getContentPane().add(getLblOcount());
		frame.getContentPane().add(getTfOcount());
		frame.getContentPane().add(getBtnNewButton());
	}

	private JLabel getLblOrdersid() {
		if (lblOrdersid == null) {
			lblOrdersid = new JLabel("주문번호:");
			lblOrdersid.setBounds(53, 41, 57, 15);
		}
		return lblOrdersid;
	}

	private JTextField getTfOrdersid() {
		if (tfOrdersid == null) {
			tfOrdersid = new JTextField();
			tfOrdersid.setBounds(172, 38, 116, 21);
			tfOrdersid.setColumns(10);
		}
		return tfOrdersid;
	}

	private JLabel getLblCustid() {
		if (lblCustid == null) {
			lblCustid = new JLabel("이름:");
			lblCustid.setBounds(53, 69, 57, 15);
		}
		return lblCustid;
	}

	private JTextField getTfCustid() {
		if (tfCustid == null) {
			tfCustid = new JTextField();
			tfCustid.setColumns(10);
			tfCustid.setBounds(172, 66, 116, 21);
		}
		return tfCustid;
	}

	private JLabel getLblProductid() {
		if (lblProductid == null) {
			lblProductid = new JLabel("제품명:");
			lblProductid.setBounds(53, 97, 57, 15);
		}
		return lblProductid;
	}

	private JTextField getTfProductid() {
		if (tfProductid == null) {
			tfProductid = new JTextField();
			tfProductid.setColumns(10);
			tfProductid.setBounds(172, 94, 116, 21);
		}
		return tfProductid;
	}

	private JLabel getLblOsale() {
		if (lblOsale == null) {
			lblOsale = new JLabel("구매금액:");
			lblOsale.setBounds(53, 126, 57, 15);
		}
		return lblOsale;
	}

	private JTextField getTfOsale() {
		if (tfOsale == null) {
			tfOsale = new JTextField();
			tfOsale.setColumns(10);
			tfOsale.setBounds(172, 123, 116, 21);
		}
		return tfOsale;
	}

	private JLabel getLblOdate() {
		if (lblOdate == null) {
			lblOdate = new JLabel("구매일자:");
			lblOdate.setBounds(53, 154, 57, 15);
		}
		return lblOdate;
	}

	private JTextField getTfOdate() {
		if (tfOdate == null) {
			tfOdate = new JTextField();
			tfOdate.setColumns(10);
			tfOdate.setBounds(172, 151, 116, 21);
		}
		return tfOdate;
	}

	private JLabel getLblOcount() {
		if (lblOcount == null) {
			lblOcount = new JLabel("구매수량:");
			lblOcount.setBounds(53, 182, 57, 15);
		}
		return lblOcount;
	}

	private JTextField getTfOcount() {
		if (tfOcount == null) {
			tfOcount = new JTextField();
			tfOcount.setColumns(10);
			tfOcount.setBounds(172, 179, 116, 21);
		}
		return tfOcount;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 상품list 클래스넣어주면됨.
//					initialize();
					System.exit(0);// 확인버튼 누를시 바로 종료

				}
			});
			btnNewButton.setBounds(327, 322, 97, 23);
		}
		return btnNewButton;
	}
	
	private void odersInfo() {

		OrdersDao dao = new OrdersDao();
		ArrayList<OrdersDto> dtoList = dao.information();

		int listCount = dtoList.size();

		for (int index = 0; index < listCount; index++) {
			{
				String temp = Integer.toString(dtoList.get(index).getCustNum());
				String [] qTxt = { temp, 
						Integer.toString(dtoList.get(index).getOdersid()),
						Integer.toString(dtoList.get(index).getpNum()),
						Integer.toString(dtoList.get(index).getCustNum()),
						Integer.toString(dtoList.get(index).getOsale()),
						dtoList.get(index).getOdate(),
						Integer.toString(dtoList.get(index).getOcount())
						};
				//값을 누적시킴

				Outer_Table.addRow(qTxt);// 누적됨.
				tfOrdersid.setText(Integer.toString(dtoList.get(index).getOdersid()));// 누적된 값을 뽑아줌.
				tfCustid.setText(Integer.toString(dtoList.get(index).getpNum()));
				tfProductid.setText(Integer.toString(dtoList.get(index).getCustNum()));
				tfOsale.setText(Integer.toString(dtoList.get(index).getOsale()));
				tfOdate.setText(dtoList.get(index).getOdate());
				tfOcount.setText(Integer.toString(dtoList.get(index).getOcount()));
				
			}
		}

	}
}
