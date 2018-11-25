package ckcc.homework.Employee.employee;

import ckcc.homework.Employee.interfaces.*;

public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private String socialSecurtiyNumber;

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurtiyNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return this.socialSecurtiyNumber;
	}
	
}
