package com.ustassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineHotel {

	public static void main(String[] args) throws InterruptedException {
	
	//To tell where my driverpath  is located to communicate with browser.chrome or firefox driver
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\REVATHI R\\Desktop\\UST_Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://www.makemytrip.com/");
	

	driver.findElement(By.cssSelector("#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > ul > li.makeFlex.hrtlCenter.font10.makeRelative.lhUser")).click();
    //driver.findElement(By.cssSelector("#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > ul > li.makeFlex.hrtlCenter.font10.makeRelative.lhUser")).click();
	//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).click();
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("revathimaketrip@gmail.com");

	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]")).click();
	driver.findElement(By.cssSelector("#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalResetPass > section > form > div.modalField.makeFlex.column.appendBottom30 > div > input[type=text]")).sendKeys(""+385410);

	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]")).click();
    
    


	Thread.sleep(3000);
	driver.close();
    driver.quit();
	
	}

}
