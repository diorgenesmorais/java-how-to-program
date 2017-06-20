package com.dms.jcp10ed;

import java.math.BigDecimal;

/**
 * Calculadora de índece de massa corporal
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class CalculadoraIMC {

	/**
	 * Calcular IMC - índece de massa corporal
	 * 
	 * @param peso
	 * @param altura
	 * @return o IMC (com precisão de .2f).
	 */
	public BigDecimal calcular(double peso, double altura) {
		return new BigDecimal(peso / (altura * altura)).setScale(2, BigDecimal.ROUND_HALF_DOWN);
	}
}
