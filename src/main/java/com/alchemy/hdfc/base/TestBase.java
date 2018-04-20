package com.alchemy.hdfc.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.alchemy.utility.Utility;

public class TestBase {
	public WebDriver driver;
	@Test
	public class CreateDriverInstance

	{
		
		Utility util = new Utility();
		public void intiateDriverInstance() throws IOException
		{
			
			if(util.fetchpropertfile("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(util.fetchpropertfile("browser").equalsIgnoreCase("firefox"))	
			{
				System.setProperty("webdriver.firefox.marionette", "./Driver/geckodriver.exe");
				driver = new FirefoxDriver();	
			}
			else if (util.fetchpropertfile("browser").equalsIgnoreCase("IE")
			{
				System.setProperty("webdriver.internetexplorer.driver", "");
				driver = new InternetExplorerDriver();
			}
			}
			else
			{
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
				
			}
		}
			
	
		
		public void closeDriverInstace()
		{
			driver.quit();
		}
	
	}
