package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	@Test
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	} 
	
	@Test
	public void enterLoginDetails() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Test
	public void navigateToMyInfo() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();

	}
	@Test
	public void verifyMyInfo() {
		driver.findElement(By.xpath("//div[@class='orangehrm-tabs-item --active']")).isDisplayed();
		driver.quit();

	}
}
