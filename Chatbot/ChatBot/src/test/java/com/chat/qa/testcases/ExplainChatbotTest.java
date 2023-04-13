package com.chat.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.chat.qa.base.Base;
import com.chat.qa.pages.ExplainChatbot;

public class ExplainChatbotTest extends Base {

	ExplainChatbot explainChatbot;

	public ExplainChatbotTest() {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = init(prop.getProperty("browserName"));
		explainChatbot = new ExplainChatbot(driver);
	}

	
	  @AfterMethod 
	  public void tearDown() { 
		  driver.quit();
		  }
	 

	@Test
	public void verifyclickExplainChat() throws Throwable {
		ExplainChatbot ec = new ExplainChatbot(driver);
		ec.clickExplainChat();
		String message = ec.getMessage();
		Assert.assertTrue(message.contains(
				"Basically, we chatbots are just software applications, like any other application you use on your computer. The important difference is that people interface with us using conversation. Shall I say more about this?"));
	}
}
