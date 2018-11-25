package ckcc.homework.Employee.employee;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class HourlyEmployeeTest {

	static HourlyEmployee he;
	
	@BeforeClass
	public static void initObject() {
		he = new HourlyEmployee("Remji","Five","12345",40,100);
	}
	
	@Test
	public void testGetPaymentAmount() {
		assertEquals(4000,he.getPaymentAmount(),0.0);
	}

}
