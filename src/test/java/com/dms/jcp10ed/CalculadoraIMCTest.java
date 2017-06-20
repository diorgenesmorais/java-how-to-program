package com.dms.jcp10ed;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraIMCTest {

	private CalculadoraIMC calculadora;

	@Before
	public void init() {
		this.calculadora = new CalculadoraIMC();
	}

	@Test
	public void deveCalcularIMCDeUmHomem() throws Exception {
		double expected = 25.93;
		assertEquals(expected, calculadora.calcular(84.0, 1.8).doubleValue(), 0.00001);
	}
}
