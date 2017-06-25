package com.dms.jcp10ed.cap2;

public class TabelaTripla {

	public static void main(String[] args) {

		System.out.println("number  square  cube");
		for (int i = 0; i < 11; i++) {
			// reservar um espaço de 7 digitos para formatar (o sinal força o alinhamento a esquerda)
			System.out.printf("%-7d %-7d %-7d%n", i, (i * i), (i * i * i));
		}

	}

}
