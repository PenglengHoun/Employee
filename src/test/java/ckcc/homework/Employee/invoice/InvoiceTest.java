package ckcc.homework.Employee.invoice;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class InvoiceTest {

	static Invoice invoice;
	
	@BeforeClass
	public static void initObject() {
		invoice = new Invoice("I001","Book",10,100);
	}
	
	@Test
	public void testGetPaymentAmount() {
		assertEquals(1000,invoice.getPaymentAmount(),0.0);
	}

}
