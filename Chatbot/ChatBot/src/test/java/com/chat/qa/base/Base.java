package com.chat.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	WebDriver driver;
	public Properties prop;
	
	public Base()
	{
		prop = new Properties();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		File propFile = new File(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\chat\\qa\\config\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
		}
		catch(Throwable e){
			e.printStackTrace();
		}
	}
	
	public WebDriver init(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
		
		return driver;
	}
}
