package com.dms.jcp10ed.poli;

public class PayableInterfaceTest {

	public static void main(String[] args) {

		Payable[] payableObjects = new Payable[4];

		payableObjects[0] = new Invoice("1287", "Conversor digital", 20, 62.9);
		payableObjects[1] = new Invoice("91", "Cabo coaxial", 25, 45.0);
		payableObjects[2] = new SalariedEmployee("Diorgenes", "Morais", "111-222-333-444", 600.0);
		payableObjects[3] = new SalariedEmployee("Deyvison", "Morais", "223-334-445-554", 60.0);

		for (Payable currentPayable : payableObjects) {
			System.out.printf("%n%s %npayment due: %,.2f%nvalue: %,.2f%n", currentPayable.toString(),
					currentPayable.getPaymentAmount(), currentPayable.getValue());
		}
	}

}
