package com.assignment.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.assignment.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass{
	
	
	@Test
	public void loginTest() throws Exception
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		logger.info("URL is opened");
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);

		logger.info("Entered GMail");
		
		
		
		

		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		
		Thread.sleep(6000);
		if (driver.getTitle().equalsIgnoreCase("Facebook")) {							
			Assert.assertTrue(true);
			logger.info("facebook login succesfull");
								
        } else {
        	Assert.assertFalse(false);
        	logger.info("facebook login failed");
           				
        }	
	
		
		lp.clickpostbtn();
		
		lp.enterpostName("Hello World");
		
		lp.submitpostbtn();

		Thread.sleep(6000);
	}

}
