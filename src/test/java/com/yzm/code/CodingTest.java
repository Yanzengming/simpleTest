package com.yzm.code;

import org.junit.Assert;
import org.junit.Test;


public class CodingTest {

	@Test
	public void test00() {
		int[] arr = {2,3};
		String expectResult = "ad ae af bd be bf cd ce cf";
		String result = Coding.function1(arr);
		Assert.assertEquals(expectResult, result);
	}

	@Test
	public void test01() {
		int[] arr = {9};
		String expectResult = "w x y z";
		String result = Coding.function1(arr);
		Assert.assertEquals(expectResult, result);
	}

}
