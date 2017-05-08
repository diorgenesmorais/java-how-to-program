package com.dms.jcp10ed.poli;

public class CommissionEmployeeTest {

	public static void main(String[] args) {

		Employee diorgenes = new CommissionEmployee("Diorgenes", "Morais", "113.112.12345-7", 2500.0, 0.02);
		System.out.println(diorgenes.toString());
		System.out.println(diorgenes.getPaymentAmount());
	}

}
