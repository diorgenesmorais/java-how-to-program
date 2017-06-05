package com.dms.jcp10ed.cap14;

import javax.swing.JOptionPane;

public class InvertedWordsTest {

	public static void main(String[] args) {

		String words = JOptionPane.showInputDialog("Insira um texto");
		StringBuilder buffer = new StringBuilder(words);
		buffer.reverse();
		String[] tokens = buffer.toString().split(" ");
		for (String token : tokens)
			System.out.println(token);
	}

}
