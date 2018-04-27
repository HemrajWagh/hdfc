package com.alchemy.hdfc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.alchemy.hdfc.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	public void enterUsername()
	{
		driver.findElement(By.xpath("//input[@id='txtLogin']")).sendKeys("Priyanka");
		
	}
	public void enterPassword()
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Alchemy@1");
	}
	public void clickLogin()
	{
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
	}
	
	

}
