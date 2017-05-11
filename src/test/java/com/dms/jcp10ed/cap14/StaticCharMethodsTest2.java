package com.dms.jcp10ed.cap14;

import java.util.Scanner;

//Figura 14.16: StaticCharMethods2.java
//Métodos de conversão static da classe Character.
public class StaticCharMethodsTest2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		// obtém radical
		System.out.println("Please enter a radix:");
		int radix = scanner.nextInt();
		// obtém escolha de usuário
		System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n", "Convert digit to character",
				"Convert character to digit");
		int choice = scanner.nextInt();
		// processa solicitação
		switch (choice) {
		case 1: // converte dígito em caractere
			System.out.println("Enter a digit:");
			int digit = scanner.nextInt();
			System.out.printf("Convert digit to character: %s%n", Character.forDigit(digit, radix));
			break;

		case 2: // converte caractere em dígito
			System.out.println("Enter a character:");
			char character = scanner.next().charAt(0);
			System.out.printf("Convert character to digit: %s%n", Character.digit(character, radix));
			break;

		}
	}

}
