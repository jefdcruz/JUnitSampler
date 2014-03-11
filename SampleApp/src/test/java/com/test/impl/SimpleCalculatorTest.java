package com.test.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {
private SimpleCalculator simpleCalculator;
	
	@Before
	public void init(){
		this.simpleCalculator = new SimpleCalculator();
	}
	
	@Test
	public void testAdd(){
		int sum = simpleCalculator.add(10, 20);
		assertEquals(sum, 30);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalAdd(){
		simpleCalculator.add(-10, 20);
	}
}
