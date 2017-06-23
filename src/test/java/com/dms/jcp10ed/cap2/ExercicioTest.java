package com.dms.jcp10ed.cap2;

import java.util.Scanner;

public class ExercicioTest {

	private static Scanner input;

	public static void main(String[] args) {
		int value;
		input = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		value = input.nextInt();
		String response = (value == 7)? "Parabéns" : "The variable number is not equal to 7";
		System.out.println(response);
	}

}
