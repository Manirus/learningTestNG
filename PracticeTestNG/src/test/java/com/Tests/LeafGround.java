package com.Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeafGround {
  
	WebDriver driver=null;
	
	@Test
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Elementbtn = driver.findElement(By.xpath("//li[@id='menuform:j_idt40']"));
		js.executeScript("argument[0]", Elementbtn);
		
	}
/*	@Test
	public void clickElementButton() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Elementbtn = driver.findElement(By.xpath("//li[@id='menuform:j_idt40']"));
		js.executeScript("argument[0]", Elementbtn);
	}
	
	*/
}
