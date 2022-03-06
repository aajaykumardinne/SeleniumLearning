package com.test;

import org.testng.annotations.Test;

public class AmazonAppTest {
	
	
	@Test
	public void addToCartTest() {
		System.out.println("addToCartTes");
		int i = 9/0;
	}
	
	@Test(enabled = true, alwaysRun = true ,dependsOnMethods = "addToCartTest")
	public void paymentTest() {
		System.out.println("paymentTest");
	}

}
