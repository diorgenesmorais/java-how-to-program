package com.dms.aha;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class HealthProfile {

	private Person person;

	public HealthProfile(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public BigDecimal getIMC() {
		BigDecimal peso = new BigDecimal(person.getPeso());
		BigDecimal altura = new BigDecimal(person.getAltura());
		return peso.divide(altura.pow(2), 2, BigDecimal.ROUND_HALF_DOWN);
	}

	public void exibirTabelaIMC() {
		String tabela = "Tabela\n" + "Underweight:  less than 18.5\n" + "Normal:  between 18.5 and 25.9\n"
				+ "Overweight:  between 25 and 29.9\n" + "Obese:  30 or greater\n\n";
		String resultado;
		if (getIMC().doubleValue() < 18.5) {
			resultado = "underweight";
		} else if (getIMC().doubleValue() >= 18.5 && getIMC().doubleValue() <= 25.9) {
			resultado = "normal";
		} else if (getIMC().doubleValue() > 25.9 && getIMC().doubleValue() <= 29.9) {
			resultado = "overweight";
		} else {
			resultado = "obese";
		}
		JOptionPane.showMessageDialog(null, String.format(tabela + "Based on the table above you are %s", resultado));
	}

	public int getIdadeAtual() {
		Period perid = Period.between(person.getDataNascimento(), LocalDate.now());
		return perid.getYears();
	}

	/**
	 * Obter a frequência cardíaca máxima por minito.
	 * 
	 * @return o resultado de 220 menos a idade em anos.
	 */
	public int getMaximumHeartRate() {
		return 220 - getIdadeAtual();
	}

	public String getTargetHeartRateZone() {
		int min = (int) (getMaximumHeartRate() * 0.5);
		int max = (int) (getMaximumHeartRate() * 0.85);
		return String.format("%d-%d%% beats per minute", min, max);
	}
}
