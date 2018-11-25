package ckcc.homework.Employee.testsuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ckcc.homework.Employee.employee.BasePlusCommissionEmployeeTest;
import ckcc.homework.Employee.employee.CommissionEmployeeTest;
import ckcc.homework.Employee.employee.HourlyEmployeeTest;
import ckcc.homework.Employee.invoice.InvoiceTest;

@RunWith(Suite.class)
@SuiteClasses({
			   BasePlusCommissionEmployeeTest.class, 
			   CommissionEmployeeTest.class,
			   HourlyEmployeeTest.class,
			   HourlyEmployeeTest.class,
			   InvoiceTest.class
			 })
public class AllTests {

}
