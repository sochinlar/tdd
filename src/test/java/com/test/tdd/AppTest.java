package com.test.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest{
	
	
	@Test
	public void testMultiplication(){
		Money five=Money.dollar(5);
		assertEquals(new Dollar(10),five.times(2));
		assertEquals(new Dollar(15),five.times(3));
	}
	@Test
	public void testEquality(){
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	//	assertTrue(new Franc(5).equals(new Franc(5)));
	//	assertFalse(new Franc(5).equals(new Franc(6)));
	//	assertFalse(new Dollar(6).equals(new Franc(6)));
	}
	@Test
	public void testFrancMultiplication(){
		Franc five=new Franc(5);
		assertEquals(new Franc(10),five.times(2));
		assertEquals(new Franc(15),five.times(3));
		
	}
	
}
