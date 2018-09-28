package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import payment.Purchase;

public class PaymentTest {

	@Test
	public void monthlyPayment_test1() {
		Purchase myPurchase = new Purchase(35000, 0, 60, 0.1);
		
		assertEquals(743.65, myPurchase.monthlyPayment(), .1);
	}
	@Test
	public void monthlyPayment_test2() {
		Purchase myPurchase = new Purchase(25000, 5000, 48, 0.05);
		
		assertEquals(460.59, myPurchase.monthlyPayment(), .1);
	}
	@Test
	public void monthlyPayment_test3() {
		Purchase myPurchase = new Purchase(80000, 40000, 24, 0.15);
		
		assertEquals(1939.47, myPurchase.monthlyPayment(), .1);
	}
	
	
	@Test
	public void totalInterest_test1() {
		Purchase myPurchase = new Purchase(35000, 0, 60, 0.1);
		assertEquals(9618.79, myPurchase.totalInterest(),.1);
	}
	@Test
	public void totalInterest_test2() {
		Purchase myPurchase = new Purchase(25000, 5000, 48, 0.05);
		
		assertEquals(2108.12, myPurchase.totalInterest(), .1);
	}
	@Test
	public void totalInterest_test3() {
		Purchase myPurchase = new Purchase(80000, 40000, 24, 0.15);
		
		assertEquals(6547.18, myPurchase.totalInterest(), .1);
	}

}
