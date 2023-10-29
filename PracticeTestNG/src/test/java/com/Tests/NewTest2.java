package com.Tests;

import org.testng.annotations.Test;
@Test(groups= {"all"})
public class NewTest2 {

	@Test(groups= {"functional","smoke"})
	public void test4() {
		System.out.println("test4");
	}
	@Test(groups= {"smoke","functional"})
	public void test5() {
		System.out.println("test5");
	}
	@Test
	public void test6() {
		System.out.println("test6");
	}
}