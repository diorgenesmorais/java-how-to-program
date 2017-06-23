package com.dms.jcp10ed.cap2;

public class SeparaDigitos {

	public static void main(String[] args) {
		int value = 42339;
		int mod = 100000;
		int un = 10000;

		for (int i = 0; i < 5; i++) {
			System.out.print(value % mod / un + "  ");
			mod /= 10;
			un /= 10;
		}
	}

}
