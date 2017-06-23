package com.dms.jcp10ed.cap2;

import java.util.Scanner;

public class Mutiple {

	private static Scanner input;

	public static void main(String[] args) {

		double a, b;
		input = new Scanner(System.in);
		System.out.print("Informe um número: ");
		a = input.nextDouble();
		System.out.print("Informe outro número: ");
		b = input.nextDouble();
		if (b == 0) {
			System.out.println("Não é possível calcular uma divisão por ZERO");
			return;
		}
		if (a % b == 0) {
			System.out.println("Os números que você informou são multiplos");
		} else {
			System.out.printf("Os números %.2f e %.2f não são multiplos", a, b);
		}
	}

}
