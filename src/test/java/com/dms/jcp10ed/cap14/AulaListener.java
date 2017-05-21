package com.dms.jcp10ed.cap14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AulaListener extends JFrame {

	private static final long serialVersionUID = -6000769343463721447L;
	private JButton b;

	public static void main(String[] args) {
		JFrame f = new AulaListener();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setVisible(true);
	}

	public AulaListener() {
		this.getContentPane().add(b = (new JButton("Clique aqui")));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JButton) e.getSource()).setText("OK");
			}
		});
	}
}