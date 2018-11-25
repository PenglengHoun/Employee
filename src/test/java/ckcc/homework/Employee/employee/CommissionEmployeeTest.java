package ckcc.homework.Employee.employee;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CommissionEmployeeTest {

	static CommissionEmployee ce;
	
	@BeforeClass
	public static void initObject() {
		ce = new CommissionEmployee("Remji","Five","12345",10000,50);
	}
	
	@Test
	public void testGetPaymentAmount() {
		assertEquals(5000,ce.getPaymentAmount(),0.0);
	}

}
