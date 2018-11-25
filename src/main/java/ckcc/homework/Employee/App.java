package ckcc.homework.Employee;

import java.util.ArrayList;
import java.util.Scanner;

import ckcc.homework.Employee.employee.BasePlusCommissionEmployee;
import ckcc.homework.Employee.employee.CommissionEmployee;
import ckcc.homework.Employee.employee.Employee;
import ckcc.homework.Employee.employee.HourlyEmployee;
import ckcc.homework.Employee.employee.SalariedEmployee;
import ckcc.homework.Employee.invoice.Invoice;

public class App 
{
	static Scanner cin = new Scanner(System.in);	
	static ArrayList<Employee> employees = new ArrayList<Employee>();
	static ArrayList<Invoice> invoices = new ArrayList<Invoice>();
	
    public static void main( String[] args )
    {
        boolean isExit = false;
        while(!isExit) {
        	System.out.println("***Main menu***\n");
        	System.out.println("1. Input employees");
        	System.out.println("2. Output employees");
        	System.out.println("3. Input invoice");
        	System.out.println("4. Output invoice");
        	System.out.println("5. Exit");
        	
        	System.out.print("\nInput your option : ");
        	int option = cin.nextInt(); cin.nextLine();
        	System.out.println();
        	
        	switch(option) {
        		case 1: 
        			System.out.println("***Input Employee***\n");
        			App.inputEmployee();
        			break;
        		case 2: 
        			System.out.println("***Output Employees***\n");
        			App.outputEmployee();
        			break;
        		case 3:
        			System.out.println("***Input Invoice***\n");
        			App.inputInvoice();
        			break;
        		case 4:
        			System.out.println("***Output Invoice***\n");
        			App.outputInvoice();
        			break;
        		case 5:	
        			isExit = true;
        			break;
        	}// end switch option
        	
        }// end while loop for isExit(MAIN)
        
    }// end MAIN
    
    static void inputInvoice() {
    	System.out.print("Input part number : ");
    	String partNumber = cin.nextLine();
    	System.out.print("Input part description : ");
    	String partDescription = cin.nextLine();
    	System.out.print("Input quantity : ");
    	int quantity = cin.nextInt(); cin.nextLine();
    	System.out.print("Input price/item : ");
    	double pricePerItem = cin.nextDouble(); cin.nextLine();
    	System.out.println();
    	
    	invoices.add(new Invoice(partNumber, partDescription, quantity, pricePerItem));
    	
    }
    
    static void outputInvoice() {
    	System.out.println("Part Number of Invoices : ");
    	for(Invoice temp : invoices)
    		System.out.println(temp.getPartNumber());
    	
    	System.out.println();
    	System.out.print("Input part number to see detail : ");
    	String partNumber = cin.nextLine();
    	
    	boolean isFound = false;
    	for(Invoice temp : invoices)
    		if(partNumber.equals(temp.getPartNumber())) {
    			isFound = true;
    			System.out.println("Part Number      : " + temp.getPartNumber());
    			System.out.println("Part Description : " + temp.getPartDescription());
    			System.out.println("Quantity         : " + temp.getQuantity());
    			System.out.println("Price/Item       : " + temp.getPricePerItem());
    			System.out.println("Total            : " + temp.getPaymentAmount());
    			break;
    		}
    	
    	if(!isFound)	System.out.println("!!!There is no item with that part number!!!");
    	System.out.println();
    }
    
    static void inputEmployee() {
    	System.out.print("Input first name : ");
    	String firstName = cin.nextLine();
    	System.out.print("Input last name : ");
    	String lastName = cin.nextLine();
    	System.out.print("Input social security number : ");
    	String socialSecurityNumber = cin.nextLine();
    	
    	System.out.println();
    	System.out.println("What is the type of this employee?");
    	System.out.println("1. Commission employee");
    	System.out.println("2. Hourly employee");
    	System.out.println("3. Salaried base employee");
    	System.out.println("4. Base plus commission employee");
    	
    	System.out.print("\nInput the type : ");
    	int typeOfEmployee = cin.nextInt(); cin.nextLine();
    	System.out.println();
    
    	switch(typeOfEmployee) {
    		case 1:{ 
    			System.out.print("Input gross sales : ");
    			double grossSales = cin.nextDouble(); cin.nextLine();
    			System.out.print("Input commission rate (%) : ");
    			double commissionRate = cin.nextDouble(); cin.nextLine();
    			
    			Employee emp = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    			employees.add(emp);
    			
    			break;
    		}
    		case 2:{ 
    			System.out.print("Input wage : ");
    			double wage = cin.nextDouble(); cin.nextLine();
    			System.out.print("Input hours : ");
    			double hours = cin.nextDouble(); cin.nextLine();
    			
    			Employee emp = new HourlyEmployee(firstName, lastName, socialSecurityNumber, wage, hours);
    			employees.add(emp);
    			
    			break;
    		}
    		case 3:{ 
    			System.out.print("Input weekly salary : ");
    			double weeklySalary = cin.nextDouble(); cin.nextLine();
    			
    			Employee emp = new SalariedEmployee(firstName, lastName, socialSecurityNumber, weeklySalary);
    			employees.add(emp);
    			
    			break;
    		}
    		case 4:{ 
    			System.out.print("Input gross sales : ");
    			double grossSales = cin.nextDouble(); cin.nextLine();
    			System.out.print("Input commission rate (%) : ");
    			double commissionRate = cin.nextDouble(); cin.nextLine();
    			System.out.print("Input base salary : ");
    			double baseSalary = cin.nextDouble(); cin.nextLine();
    			
    			Employee emp = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary);   			
    			employees.add(emp);
    			
    			break;
    		}
    	}// end of switch type of employee
    	
    	System.out.println();
    	
    }// end function inputEmployee
    
    static void outputEmployee() {
    	System.out.println("1. Output all employees");
    	System.out.println("2. Output all commission employees");
    	System.out.println("3. Output all hourly employees");
    	System.out.println("4. Output all salaried employees");
    	System.out.println("5. Output all base plus commission employees");
    	System.out.println("Input anything else to go back");
    	
    	System.out.println();
    	System.out.print("Input your option : ");
    	int typeOfEmployee = cin.nextInt(); cin.nextLine();
    	
    	switch(typeOfEmployee) {
    		case 1: 
    			App.outputAllEmployees();
    			break;
    		case 2: 
    			System.out.println("***Commission Employee***\n");
    			App.outputAllCommissionEmployees();
    			break;
    		case 3: 
    			System.out.println("***Hourly Employee***\n");
    	    	App.outputAllHourlyEmployees();
    			break;
    		case 4: 
    			System.out.println("***Salaried Employee***\n");
    	    	App.outputAllSalariedEmployees();
    			break;
    		case 5: 
    			System.out.println("***Base Plus Commission Employee***\n");
    	    	App.outputAllBasePlusCommissionEmployees();
    			break;
    	}// end of switch typeOfEmployee
    	
    }// end function outputEmployee
    
    static void outputAllEmployees() {
    	
    	boolean isCEExist = false, isHEExist = false, 
    			isSEExist = false, isBPCEExist = false;
    	
    	for(Employee temp : employees) {
    		if(temp instanceof CommissionEmployee && !(temp instanceof BasePlusCommissionEmployee))
    			isCEExist = true;
    		if(temp instanceof HourlyEmployee)
    			isHEExist = true;
    		if(temp instanceof SalariedEmployee)
    			isSEExist = true;
    		if(temp instanceof BasePlusCommissionEmployee)
    			isBPCEExist = true;
    		
    		if(isCEExist && isHEExist && isSEExist && isBPCEExist)
    			break;
    	}
    	
    	if(isCEExist) {
	    	System.out.println("***Commission Employee***\n");
	    	App.outputAllCommissionEmployees();
    	}
    	if(isHEExist) {
	    	System.out.println("***Hourly Employee***\n");
	    	App.outputAllHourlyEmployees();
    	}
    	if(isSEExist) {
	    	System.out.println("***Salaried Employee***\n");
	    	App.outputAllSalariedEmployees();
    	}
    	if(isBPCEExist) {
	    	System.out.println("***Base Plus Commission Employee***\n");
	    	App.outputAllBasePlusCommissionEmployees();
    	}
    }// end function output all employee
    
    ///////////////////////////////////
    // OUTPUT ALL EMPLOYEE OF A TYPE //
    ///////////////////////////////////
    
    static void outputAllCommissionEmployees() {
    	System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s",
				"First Name", "Last Name", "SSN", "Gross Sales",
				"Commission Rate","Amount");
    	System.out.println();
    	
    	for(Employee temp : employees) { 
    		if( temp instanceof CommissionEmployee && !(temp instanceof BasePlusCommissionEmployee))
    			App.outputCommissionEmployee((CommissionEmployee)temp); 
    	}
    	System.out.println();
    }
    
    static void outputAllHourlyEmployees() {
    	System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s",
				"First Name", "Last Name", "SSN", "Wage",
				"Hours","Amount");
    	System.out.println();
    	
    	for(Employee temp : employees) 
    		if( temp instanceof HourlyEmployee)
    			App.outputHourlyEmployee((HourlyEmployee)temp); 
    	System.out.println();
    }
    
    static void outputAllSalariedEmployees() {
    	System.out.printf("%-15s%-15s%-15s%-15s",
				"First Name", "Last Name", "SSN", "Weekly Salary");
    	System.out.println();
    	
    	for(Employee temp : employees) 
    		if( temp instanceof SalariedEmployee)
    			App.ouputSalariedEmployee((SalariedEmployee)temp); 
    	System.out.println();
    }
    
    static void outputAllBasePlusCommissionEmployees() {
    	System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s",
				"First Name", "Last Name", "SSN", "Gross Sales",
				"Commission Rate","Base Salary","Amount");
    	System.out.println();
    	
    	for(Employee temp : employees) 
    		if( temp instanceof BasePlusCommissionEmployee)
    			App.outputBasePlusCommissionEmployee((BasePlusCommissionEmployee)temp);   	
    	System.out.println();
    }
    
	/////////////////////////////////////////////
	// ***END*** OUTPUT ALL EMPLOYEE OF A TYPE //
	/////////////////////////////////////////////
    
	///////////////////////////////////
	// OUTPUT ONE EMPLOYEE OF A TYPE //
	///////////////////////////////////
    
    static void outputCommissionEmployee(CommissionEmployee ce) {
    	System.out.printf("%-15s%-15s%-15s%-15.2f%-15.2f%-15.2f",
				ce.getFirstName(),ce.getLastName(),
				ce.getSocialSecurityNumber(),ce.getGrossSales(),
				ce.getCommissionRate(), ce.getPaymentAmount());
    	System.out.println();
    }
    
    static void outputHourlyEmployee(HourlyEmployee he) {
    	System.out.printf("%-15s%-15s%-15s%-15.2f%-15.2f%-15.2f",
				he.getFirstName(),he.getLastName(),
				he.getSocialSecurityNumber(),he.getWage(),
				he.getHours(), he.getPaymentAmount());
    	System.out.println();
    }
    
    static void ouputSalariedEmployee(SalariedEmployee se) {
    	System.out.printf("%-15s%-15s%-15s%-15.2f",
				se.getFirstName(),se.getLastName(),
				se.getSocialSecurityNumber(), se.getPaymentAmount());
    	System.out.println();
    }
    
    static void outputBasePlusCommissionEmployee(BasePlusCommissionEmployee bpce) {
    	System.out.printf("%-15s%-15s%-15s%-15.2f%-15.2f%-15.2f%-15.2f",
				bpce.getFirstName(), bpce.getLastName(),
				bpce.getSocialSecurityNumber(),bpce.getGrossSales(),
				bpce.getCommissionRate(), bpce.getBaseSalary(),
				bpce.getPaymentAmount());
    	System.out.println();
    }
    
	/////////////////////////////////////////////
	// ***END*** OUTPUT ONE EMPLOYEE OF A TYPE //
	/////////////////////////////////////////////
    
}// end class App
