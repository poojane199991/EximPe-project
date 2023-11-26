package com.EximMe.testcase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AboutEximpe {
	@Test
	public void aboutexime()
	{
		Logger logger=Logger.getLogger("EximPe");
		PropertyConfigurator.configure("Log4j.properties");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://eximpe.com/");
		logger.info("Enter the url");
		driver.findElement(By.xpath("(//*[name()='svg'][@class='e-font-icon-svg e-fas-angle-down'])[3]")).click();
		logger.info("About");
	    driver.findElement(By.xpath("(//a[@class='elementor-sub-item'][normalize-space()='About EximPe'])[1]")).click();
        logger.info("About EximePe");
		System.out.println(driver.findElement(By.xpath("//span[normalize-space()='25']")).getText());
		  
	}

}
