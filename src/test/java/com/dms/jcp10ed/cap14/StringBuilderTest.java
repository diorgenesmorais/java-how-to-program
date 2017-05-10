package com.dms.jcp10ed.cap14;

public class StringBuilderTest {

	public static void main(String[] args) {
		// sem caracteres e uma capacidade inicial de 16 caracteres
		StringBuilder buffer1 = new StringBuilder();
		// capacidade inicial especificada pelo argumento inteiro (isto é, 10 ).
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder buffer3 = new StringBuilder("hello");

		System.out.printf("buffer1 = \"%s\"%n", buffer1);
		System.out.printf("buffer2 = \"%s\"%n", buffer2);
		System.out.printf("buffer3 = \"%s\"%n", buffer3);
		System.out.printf("total capacity of buffer3 (5 + 16) = %d", buffer3.capacity());
	}

}
