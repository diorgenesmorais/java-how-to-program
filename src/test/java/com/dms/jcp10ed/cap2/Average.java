package com.dms.jcp10ed.cap2;

import java.util.Scanner;

public class Average {

	private static Scanner input;

	public static void main(String[] args) {
		int a, b, c, soma, media, produto, menor, maior;

		input = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		a = input.nextInt();
		System.out.print("Informe o segundo número: ");
		b = input.nextInt();
		System.out.print("Informe o terceiro número: ");
		c = input.nextInt();

		soma = a + b + c;
		media = soma / 3;
		produto = a * b * c;

		System.out.printf("A soma dos números = %d%n", soma);
		System.out.printf("A média dos números = %d%n", media);
		System.out.printf("O produto dos números = %d%n", produto);

		if (a < b && a < c) {
			menor = a;
			maior = c;
		} else if (b < a && b < c) {
			menor = b;
			maior = c;
		} else {
			menor = c;
			maior = (a < b) ? b : a;
		}

		System.out.printf("O menor número: %d%n", menor);
		System.out.printf("O maior número: %d%n", maior);
	}

}
