package com.dms.jcp10ed.poli;

/**
 * This is a indirect subclass of {@code Employee}, being direct from
 * {@code CommissionEmployee}
 * 
 * @author Diorgenes Morais
 * @version 1.0.0
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		settingBaseSalary(baseSalary);
	}

	private void settingBaseSalary(double baseSalary) {
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		settingBaseSalary(baseSalary);
	}

	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

	@Override
	public String toString() {
		return String.format("base-salaried %s%nBase salary: %.2f", super.toString(), getBaseSalary());
	}
}
