package com.dms.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {

	private static final long serialVersionUID = 2812812394764559812L;
	private JTextField texto;
	private JCheckBox bold, italic;

	public ControleCheck(String title) throws HeadlessException {
		super(title);

		texto = new JTextField("Veja a fonte mudar");
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		texto.setPreferredSize(new Dimension(350, 40));

		bold = new JCheckBox("bold");
		bold.addItemListener(new CheckListener());
		italic = new JCheckBox("italic");
		italic.addItemListener(new CheckListener());

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(370, 100);
	}

	class CheckListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if (bold.isSelected() && italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
			} else if (bold.isSelected()) {
				texto.setFont(new Font("Serif", Font.BOLD, 26));
			} else if (italic.isSelected()) {
				texto.setFont(new Font("Serif", Font.ITALIC, 26));
			} else {
				texto.setFont(new Font("Serif", Font.PLAIN, 26));
			}
		}

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			new ControleCheck("Aplicativo").setVisible(true);
		});
	}

}
