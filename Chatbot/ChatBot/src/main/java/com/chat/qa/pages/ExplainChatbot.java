package com.chat.qa.pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplainChatbot {
	
	WebDriver driver;
	public WebDriverWait wait;
	//Object
	@FindBy(id="sntch_button")
	WebElement widget;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/perfect-scrollbar/div/div[1]/div/div[3]/div[2]/div[4]/div/owl-carousel/owl-carousel-child/div[1]/div/div[1]")
	WebElement chatwithbot;
	
	@FindBy(id="chat_input")
	WebElement chatInput;
	
	@FindBy (id="sntch_iframe")
	WebElement iframe;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__form > div.chat__input > div > button")
	WebElement submitbutton;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(5) > div.message__wrapper > div:nth-child(2) > div")
	WebElement namewait;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(7) > div.message__wrapper > div:nth-child(4) > div > button:nth-child(1)")
	WebElement yes;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(11) > div.message__wrapper > div:nth-child(4) > div > button:nth-child(1)")
	WebElement Explainchat;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(13) > div.message__wrapper > div:nth-child(2) > div > p")
	WebElement message;
	
	public ExplainChatbot(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Action
	
	public void clickExplainChat() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(widget));
		widget.click();
		driver.switchTo().frame(iframe);
		wait.until(ExpectedConditions.visibilityOf(chatwithbot));
		chatwithbot.click();
		wait.until(ExpectedConditions.visibilityOf(namewait));	
		chatInput.sendKeys("Testing");
		submitbutton.click();
		wait.until(ExpectedConditions.visibilityOf(yes));
		yes.click();
		wait.until(ExpectedConditions.visibilityOf(Explainchat));
		Explainchat.click();
		wait.until(ExpectedConditions.visibilityOf(message));
	}
	public String getMessage() {
		return message.getText();
	}

	
}
