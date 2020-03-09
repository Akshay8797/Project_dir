package com.Junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RandomTo100Test {

	private RandomTo100 nm;

	@Parameterized.Parameters
	public static Collection number() {
		return Arrays.asList(new Object[][] { {}, {}, {}, {} });
	}

	@Before
	public void initialize() {
		nm = new RandomTo100();
	}

	@Test
	public void test() {
		assertTrue(nm.getRandomNo() < 100);
	}
}
