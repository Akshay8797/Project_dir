package com.Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal = null;

	@Before
	public void start() {
		cal = new Calculator();
	}

	@Test
	public void test() {
		assertEquals(2, cal.divide(6, 3));
	}

	@Test
	public void testThrow() {
		assertThrows(ArithmeticException.class, () -> cal.divide(20, 0));
	}
}