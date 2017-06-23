package com.dms.jcp10ed.cap2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgebraicExpressionTest {

	private int a = 5, b = 6, c = 6, d = 5;
	private double expected = 11;
	private double result = 0;

	@Test
	public void deveCalcularAlgebricExpression() throws Exception {
		result = (a + b + c + d) / 2;
		assertEquals(expected, result, 0.00001);
	}

	@Test(expected = ArithmeticException.class)
	public void deveCalcularDeFormaErrada() throws Exception {
		result = a + b + c + d / 2; // isso é o mesmo que dizer: somou a + b + c
									// com a metade de d
		if (result != expected) {
			throw new ArithmeticException("Resultado inesperado, valor esperado era: " + expected);
		}
	}

	@Test
	public void deveCalcularPolinomioDeSegundoGrau() throws Exception {
		a = 2;
		b = 3;
		c = 5;
		double expected = 19;
		int x = 2;
		// função f(x) quadrática: 2x² + 3x + 5
		result = a * x * x + b * x + c;
		assertEquals(expected, result, 0.00001);
	}

	@Test
	public void deveComparaUmCaractereASCII_comUnicode() throws Exception {
		char expected = 65; // Caractere da tabela ASCII
		char response = 0x41; // Letra maiúscula latina A - Unicode
		assertEquals(expected, response);
	}

	@Test
	public void deveComparaOutraLetraNoPadraounicode() throws Exception {
		char expected = 77; // Letra 'M' na tabela ASCII
		char actual = 0x4d; // Letra maiúscula M - Unicode
		assertEquals(expected, actual);
	}
}
