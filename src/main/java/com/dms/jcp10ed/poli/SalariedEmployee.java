package com.dms.jcp10ed.poli;

/**
 * {@code SalariedEmployee} is a concrete implementation of {@code Employee}
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		settingWeeklySalary(weeklySalary);
	}

	private void settingWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("weeky salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		settingWeeklySalary(weeklySalary);
	}

	@Override
	public double earnings() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return String.format("Salaried Employee: %s%nWeekly salary: $%.2f", super.toString(), getWeeklySalary());
	}
}
