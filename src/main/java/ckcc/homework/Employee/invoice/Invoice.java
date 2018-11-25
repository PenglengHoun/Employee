package ckcc.homework.Employee.invoice;

import ckcc.homework.Employee.interfaces.*;

public class Invoice implements Payable{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	public double getPaymentAmount() {
		return quantity * pricePerItem;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
}
