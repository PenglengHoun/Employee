package ckcc.homework.Employee.employee;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class BasePlusCommissionEmployeeTest {
	
	static BasePlusCommissionEmployee bpce;
	
	@BeforeClass
	public static void initObject() {
		bpce = new BasePlusCommissionEmployee("Remji","Five","12345",10000,50,1000);
	}

	@Test
	public void testGetPaymentAmount() {
		assertEquals(6000, bpce.getPaymentAmount(), 0.0);
	}

}
