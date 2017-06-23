package com.dms.jcp10ed.cap2;

import java.util.Scanner;

public class CalcularInteiro {

	private static Scanner input;

	public static void main(String[] args) {
		int x, y, z, result;
		input = new Scanner(System.in);
		System.out.print("Insirá o primeiro inteiro: ");
		x = input.nextInt();
		System.out.print("Insirá o segundo inteiro: ");
		y = input.nextInt();
		System.out.print("Insirá o terceiro inteiro: ");
		z = input.nextInt();
		result = x * y * z;
		System.out.printf("Product is %d%n", result);
	}

}
