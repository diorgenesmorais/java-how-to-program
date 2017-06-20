package com.dms.jcp10ed.poli;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {

		Employee diorgenes = new BasePlusCommissionEmployee("Diorgenes", "Morais", "113-112-12345-7", 120.0, 0.02,
				1200.0);
		System.out.println(diorgenes.toString());
	}

}
