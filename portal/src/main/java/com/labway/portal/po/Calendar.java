package com.labway.portal.po;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;

public class Calendar extends JFrame {
	private JDateChooser jDateChooser;
	private JButton jbutton;

	public JDateChooser getjDateChooser() {
		return jDateChooser;
	}

	public void setjDateChooser(JDateChooser jDateChooser) {
		this.jDateChooser = jDateChooser;
	}

	public JButton getJbutton() {
		return jbutton;
	}

	public void setJbutton(JButton jbutton) {
		this.jbutton = jbutton;
	}

	public Calendar() {
		setTitle("Test Calendar");
		setLayout(new FlowLayout());
		setSize(new Dimension(200, 150));
		jDateChooser = new JDateChooser();
		jbutton = new JButton("�ύ�?");
		add(jbutton);
		add(jDateChooser);
		jbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "��ѡ��������ǣ�" + jDateChooser.getDate().toLocaleString());

			}
		});

	}

	public Calendar getCalendar() {
		Calendar cale = new Calendar();
		cale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cale.setVisible(true);
		return cale;
	}

	public static void main(String[] args) {
		Calendar cale = new Calendar();
		cale.getCalendar();
		// cale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// cale.setVisible(true);
	}
}
