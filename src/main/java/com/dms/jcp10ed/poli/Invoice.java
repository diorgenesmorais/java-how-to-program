package com.dms.jcp10ed.poli;

public class Invoice implements Payable {

	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}

	public int getQuantity() {
		return quantity;
	}

	public final void setQuantity(int quantity) {
		if (quantity <= 0)
			throw new IllegalArgumentException("Quantity must be > 0");
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public final void setPricePerItem(double pricePerItem) {
		if (pricePerItem <= 0)
			throw new IllegalArgumentException("Price per item must be > 0");
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	@Override
	public String toString() {
		return String.format("Invoice: %nPart number: %s (%s)%nquantity: %d%nprice per item: $%.2f", getPartNumber(),
				getPartDescription(), getQuantity(), getPricePerItem());
	}

	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}

}
