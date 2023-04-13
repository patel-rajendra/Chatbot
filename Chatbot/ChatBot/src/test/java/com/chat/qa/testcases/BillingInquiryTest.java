package com.chat.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chat.qa.base.Base;
import com.chat.qa.pages.BillingInquiry;


public class BillingInquiryTest extends Base {
	
	BillingInquiry billinginquiry;
	
	public BillingInquiryTest()
	{
		super();
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = init(prop.getProperty("browserName"));
		billinginquiry = new BillingInquiry(driver);
	}
	
	 @AfterMethod 
	  public void tearDown() { 
		  driver.quit();
		  }
	
	@Test
	public void verifyclickBilling() throws Throwable {
	BillingInquiry bi = new BillingInquiry(driver);
	bi.clickBilling();
    String message= bi.getMessage();
    Assert.assertTrue(message.contains("The information you gave us, won't be shared with other companies and won't be used for sending promotional messages."));
	}
	
}
