package ckcc.homework.Employee.employee;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double wage, double hours) 
	{
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	
	public double getPaymentAmount() {
		return wage * hours;
	}
	
	public double getWage() {
		return wage;
	}
	
	public double getHours() {
		return hours;
	}
}
