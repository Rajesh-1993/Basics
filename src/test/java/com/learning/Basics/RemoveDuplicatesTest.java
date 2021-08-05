package com.learning.Basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicatesTest {

	@Test
	public void test() {
		RemoveDuplicates rmvd = new RemoveDuplicates();
		String[] inputs = { "Rajesh", "kumar", "sharma", "Yash", "Technologies", "Technologies", "Rajesh", "Sharma" };
		assertEquals(Arrays.asList("kumar", "sharma", "Yash", "Technologies", "Rajesh", "Sharma"), rmvd.removeDups(inputs));
	}
}
