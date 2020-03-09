package com.Junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ComplexTest {
	Complex c1;
	Complex c2;

	public ComplexTest(int r1, int img1, int r2, int img2) {
		c1 = new Complex(r1, img1);
		c2 = new Complex(r2, img2);
	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection complex() {
		return Arrays.asList(new Object[][] { { 2, 1, 3, 2 }, { 5, 6, 7, 8 } });
	}

	@Test
	public void test() {
		int r = c1.getReal() + c2.getReal();
		int i = c2.getImg() + c1.getImg();
		Complex c4 = new Complex(r, i);
		Complex c5 = c1.add(c2);
		assertTrue(c4.equals(c5));
	}
}