package com.dms.jcp10ed.poli;

public interface Payable {

	double getPaymentAmount();
	
	default double getValue(){
		return 10.0;
	}
}
