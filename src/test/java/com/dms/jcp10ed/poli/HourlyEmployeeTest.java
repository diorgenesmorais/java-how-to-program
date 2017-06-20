package com.dms.jcp10ed.poli;

public class HourlyEmployeeTest {

	public static void main(String[] args) {

		Employee diorgenes = new HourlyEmployee("Diorgenes", "Morais", "113.112-12345-7", 120.0, 60.0);
		System.out.println(diorgenes.toString());
		System.out.println(diorgenes.getPaymentAmount());
	}

}
