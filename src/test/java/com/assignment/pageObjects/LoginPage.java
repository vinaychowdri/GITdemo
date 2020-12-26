package com.assignment.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserName;
	
	
	@FindBy(id="pass")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="login")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7']")
	@CacheLookup
	WebElement clickpost;
	

	@FindBy(xpath="//div[@class='rq0escxv datstx6m k4urcfbm a8c37x1j']//div[@class='_5rp7']//div[@class='_5rpb']//div[@class='notranslate _5rpu']//div//div//div[@class='_1mf _1mj']")
	@CacheLookup
	WebElement enterpost;
	
	@FindBy(xpath="//div[@class='oajrlxb2 s1i5eluu qu0x051f esr5mh6w e9989ue4 r7d6kgcz rq0escxv nhd2j8a9 pq6dq46d p7hjln8o kvgmc6g5 cxmmr5t8 oygrvhab hcukyx3x cxgpxx05 d1544ag0 sj5x9vvc tw6a2znq oqcyycmt esuyzwwr f1sip0of lzcic4wl l9j0dhe7 abiwlrkh p8dawk7l ehryuci6 bp9cbjyn beltcj47 p86d2i9g aot14ch1 kzx2olss rt8b4zig n8ej3o3l agehan2d sk4xxmp2 lrazzd5p gigivrx4 sf5mxxl7 g0qnabr5 lrwzeq9o iqfcb0g7 lsqurvkf id6903cd jq4qci2q m5l1wtfr taijpn5t sn7ne77z oqhjfihn bwm1u5wc']")
	@CacheLookup
	WebElement clkpostbtn;
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
 
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickpostbtn()
	{
		clickpost.click();
	}
	
	public void enterpostName(String message)
	{
		enterpost.sendKeys(message);
	}
	
	public void submitpostbtn()
	{
		clkpostbtn.click();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
