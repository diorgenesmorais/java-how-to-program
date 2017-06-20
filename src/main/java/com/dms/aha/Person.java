package com.dms.aha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This classe ({@code Person}) is a representation of a person.
 * 
 * @author diorgenes
 * @version 1.0.0
 */
public class Person {

	private String name;
	private String lastName;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private double altura;
	private double peso;

	public Person(String name, String lastName, Sexo sexo, LocalDate dataNascimento, double altura, double peso) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
		this.peso = peso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obter a data de nascimento no formato dd/MM/yyyy
	 * 
	 * @return a data de nascimento formatada.
	 */
	public String getDataNascimentoFormatada() {
		return this.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
