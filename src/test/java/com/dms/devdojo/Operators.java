package com.dms.devdojo;

/**
 * Operadores unário - created on 04/06/2017
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class Operators {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 20;
		/**
		 * o que acontece com o operador binário + após concatenar com uma
		 * string
		 */
		System.out.println(
				numero1 + numero2 + " a soma é " + numero1 + numero2 + " na verdade o valor é " + (numero1 + numero2));

		double numero3 = 5d;

		System.out.printf("Valor de ponto flutoante %.1f%n", numero1 / numero3);

		float numero4 = (float) (numero1 / numero3);

		System.out.printf("Valor %.2f%n", numero4);
	}

}
