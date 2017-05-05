package com.dms.jcp10ed.poli;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		settingGrossSales(grossSales);
		settingCommissionRate(commissionRate);
	}

	private void settingGrossSales(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		this.grossSales = grossSales;
	}

	private void settingCommissionRate(double commissionRate) {
		if ((commissionRate <= 0.0) || (commissionRate >= 1.0))
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		settingGrossSales(grossSales);
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		settingCommissionRate(commissionRate);
	}

	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	@Override
	public String toString() {
		return String.format("Commission employee: %s%nGross sales: $%.2f; commission rate: %.2f", super.toString(),
				getGrossSales(), getCommissionRate());
	}
}
