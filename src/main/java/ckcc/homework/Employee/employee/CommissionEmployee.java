package ckcc.homework.Employee.employee;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales, double commissionRate) 
	{
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public double getPaymentAmount() {
		return grossSales * commissionRate / 100;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
}
