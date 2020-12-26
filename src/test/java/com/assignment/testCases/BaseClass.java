package com.assignment.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.assignment.utilities.ReadConfig;


public class BaseClass    {


	ReadConfig readconfig =new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	@BeforeClass
	public void setup()
	
	{
		
		logger = Logger.getLogger("ZestMoney");
	PropertyConfigurator.configure("Log4j.properties");
	ChromeOptions options = new ChromeOptions();

	options.addArguments("--disable-notifications");

	System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	driver=new ChromeDriver(options);

			
		
	}
	
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
