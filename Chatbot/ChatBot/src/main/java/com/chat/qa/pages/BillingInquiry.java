package com.chat.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillingInquiry {
	
	WebDriver driver;
	public WebDriverWait wait;
	
	public BillingInquiry(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Object
	
	@FindBy(id="sntch_button")
	WebElement widget;
	
	@FindBy(id="chat_input")
	WebElement chatInput;
	
	@FindBy (id="sntch_iframe")
	WebElement iframe;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__form > div.chat__input > div > button")
	WebElement submitbutton;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(3) > div.message__wrapper > div:nth-child(4) > div > owl-carousel > owl-carousel-child > div.owl-stage-outer > div > div:nth-child(2)")
	WebElement ContactSales;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(5) > div.message__wrapper > div:nth-child(2) > div")
	WebElement emailInfo;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(7) > div.message__wrapper > div:nth-child(4) > div > button:nth-child(4)")
	WebElement BillingInquiry;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(9) > div.message__wrapper > div:nth-child(2) > div")
	WebElement FirstName;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(11) > div.message__wrapper > div:nth-child(2) > div")
	WebElement LastName;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(14) > div.message__wrapper > div:nth-child(4) > div > button")
	WebElement Individual;
	
	@FindBy(css = "body > app-root > ng-component > div > div.chat__body.ng-star-inserted > perfect-scrollbar > div > div.ps-content > div > div:nth-child(16) > div.message__wrapper > div:nth-child(2) > div > p")
	WebElement message;
	
	public void clickBilling() throws InterruptedException
	{
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(widget));
		widget.click();
		driver.switchTo().frame(iframe);
		wait.until(ExpectedConditions.visibilityOf(ContactSales));
		ContactSales.click();
		wait.until(ExpectedConditions.visibilityOf(emailInfo));	
		chatInput.sendKeys("Test@test.com");
		submitbutton.click();
		wait.until(ExpectedConditions.visibilityOf(BillingInquiry));
		BillingInquiry.click();
		wait.until(ExpectedConditions.visibilityOf(FirstName));
		chatInput.sendKeys("QA");
		submitbutton.click();
		wait.until(ExpectedConditions.visibilityOf(LastName));
		chatInput.sendKeys("Test");
		submitbutton.click();
		wait.until(ExpectedConditions.visibilityOf(Individual));
		Individual.click();
		wait.until(ExpectedConditions.visibilityOf(message));
	}
	
	public String getMessage() {
		return message.getText();
	}
	
}
