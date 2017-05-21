package com.dms.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Aula sobre eventos e listener
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class Eventos extends JFrame implements ActionListener {

	private static final long serialVersionUID = -9184661967627875964L;

	public Eventos() {
		super("Aplicativo de evemtos");

		JButton button = new JButton("Clique aqui");
		button.addActionListener(this);
		getContentPane().add(button);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(300, 300);
	}

	public static void main(String[] args) {
		new Eventos().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((JButton) e.getSource()).setText("CLICADO");
	}

}
