package com.Tests;

import org.testng.annotations.Test;
@Test(groups= {"all"})
public class NewTest {

	@Test(groups={"smoke","sanity"})
	public void test1() {
		System.out.println("test1");
	}
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups= {"functional","smoke"})
	public void test3() {
		System.out.println("test3");
	}
}

