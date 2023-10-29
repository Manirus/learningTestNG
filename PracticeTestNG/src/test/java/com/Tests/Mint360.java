package com.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mint360 {
	WebDriver driver;
//edit test

	@Test
	public void launchBrowser()  {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mint360.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@inputmode='email']")).sendKeys("mani123@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mani123");
}
}
