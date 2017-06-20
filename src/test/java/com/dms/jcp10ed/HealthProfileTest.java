package com.dms.jcp10ed;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.dms.aha.HealthProfile;
import com.dms.aha.Person;
import com.dms.aha.Sexo;

public class HealthProfileTest {

	private HealthProfile healthProfile;
	private Person person;

	@Before
	public void init() {
		this.person = new Person("Diorgenes", "Morais", Sexo.MASCULINO, LocalDate.of(1974, 10, 18), 1.8, 84.0);
		this.healthProfile = new HealthProfile(person);
	}

	@Test
	public void deveCalcularIMC() throws Exception {
		double expected = 25.93;
		assertEquals("Calculo do índice de massa corporal", expected, healthProfile.getIMC().doubleValue(), 0.00001);
	}

	@Test
	public void deveCalcularIdade() throws Exception {
		int expected = 42;
		assertEquals("Quantos anos o individuo tem?", expected, healthProfile.getIdadeAtual());
	}

	@Test
	public void deveObterDataDeNascimentoFormatada() throws Exception {
		String expected = "18/10/1974";
		assertEquals("Data no formato: dd/MM/yyyy", expected, person.getDataNascimentoFormatada());
	}

	@Test
	public void deveCalcularAverageMaximumHeartRate() throws Exception {
		int expected = 178;
		assertEquals("Frequência Cardíaca Máxima (178)", expected, healthProfile.getMaximumHeartRate());
	}

	@Test
	public void deveCalcularTargetHeartRateZone() throws Exception {
		String expected = "89-151% beats per minute";
		assertEquals("Zona de frequência cardíaca alvo 50-85%", expected, healthProfile.getTargetHeartRateZone());
	}
	
	@Test
	public void deveExibirMesagemComTabelaIMC() throws Exception {
		healthProfile.exibirTabelaIMC();
	}
}
