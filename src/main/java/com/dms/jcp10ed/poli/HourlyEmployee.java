package com.dms.jcp10ed.poli;

/**
 * {@code HourlyEmployee} is a concrete implementation of {@code Employee}
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		settingWage(wage);
		settingHours(hours);
	}

	private void settingWage(double wage) {
		if (wage < 0.0)
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		this.wage = wage;
	}

	private void settingHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0))
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		settingWage(wage);
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		settingHours(hours);
	}

	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40.0)
			return getWage() * getHours();
		else
			return 40.0 * getWage() + (getHours() - 40.0) * getWage() * 1.5;
	}

	@Override
	public String toString() {
		return String.format("Hourly employee: %s%nHourly wage: $%.2f; hours worked: %.2f", super.toString(), getWage(),
				getHours());
	}
}
