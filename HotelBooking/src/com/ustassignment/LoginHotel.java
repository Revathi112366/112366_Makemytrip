package com.ustassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginHotel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\REVATHI R\\Desktop\\UST_Training\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.cssSelector(
				"#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > ul > li.makeFlex.hrtlCenter.font10.makeRelative.lhUser"))
				.click();
	
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("revathimakemytrip@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]")).click();

		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("revathimaketrip@2020");
		driver.findElement(By.cssSelector(
				"#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25"))
				.click();
		// driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[1] ")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/input")).sendKeys("Bengaluru");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

		

		List<WebElement> elements = driver.findElements(By.className("flexOne"));
		System.out.println(elements.size());

		
		Thread.sleep(3000);
	
		for (WebElement element : elements) {
			if (element.getText().equalsIgnoreCase("Domlur Layout, Bengaluru")) {
				element.click();
				break;
			}

		}

	Thread.sleep(2000);
	
	driver.findElement(By.id("checkin")).click();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[2]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

	WebElement checkout = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[1]"));
	checkout.click();
	
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("guest")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[4]")).click();
	//driver.findElement(By.className("class=primaryBtn btnApply")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/button[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"hlistpg_search_htl_name_box\"]/div/input")).sendKeys("Diamond");
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	
	List<WebElement> Felements = driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1--item-1\"]/a/p"));
	System.out.println(Felements.size());

	
	Thread.sleep(3000);

	for (WebElement element : Felements) {
		if (element.getText().equalsIgnoreCase("Diamond By Jade, Bengaluru, Karnataka")) {
			element.click();
			break;
		}

	}

Thread.sleep(5000);

driver.findElement(By.className("rangeSliderWrap")).click();


WebElement slider = driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_price_per_night\"]/div[2]/div[2]/div/span[1]/div"));


int xwidth = slider.getSize().width;
Actions action = new Actions(driver);
action.dragAndDropBy(slider,xwidth*3,0);
action.build().perform();
        
Thread.sleep(2000);

WebElement Chk0 = driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_locality\"]/div/div[1]/ul/li[1]/span/label/span"));
WebElement CHK1 = driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_locality\"]/div/div[1]/ul/li[2]/span/label"));

Chk0.click();
CHK1.click();


//WebElement star = driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_star_category\"]/ul/li[2]/span[1]/label"));
//star.click();

//driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_star_category\"]/ul/li[2]/span[1]")).click();
//driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_star_category\"]/ul/li[3]/span[2]")).click();
driver.findElement(By.xpath("//*[@id=\"Listing_hotel_2\"]/a/div/div[1]/div[2]/div[2]")).click();

//driver.findElement(By.xpath("//*[@id=\"detpg_book_combo_btn\"]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Book this combo')]")).click();
//driver.findElement(By.id("detpg_book_combo_btn")).click();
//driver.findElement(By.className("primaryBtn overlapBtn")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[6]/span")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div")).click();


driver.findElement(By.id("fName")).sendKeys("Revathi");
driver.findElement(By.id("lName")).sendKeys("R");
driver.findElement(By.id("mNo")).sendKeys("9876543210");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[9]/ul/li[5]/span/span/span/label")).click();

driver.findElement(By.id("payEntire")).click();

driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div")).click();

driver.findElement(By.xpath("//*[@id=\"PAYMENT_inputVpa\"]")).sendKeys("1234@HDFC");

driver.findElement(By.xpath("//*[@id=\"makePaymentButton\"]")).click();

Thread.sleep(5000);
driver.close();




	}

}
