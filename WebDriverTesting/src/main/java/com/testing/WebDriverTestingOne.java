package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTestingOne {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.gecko.driver", "G:/eclipse workspace/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");

		// -----------For chrome driver------------------
		// to set system variable you can also set it in environment variables

		System.setProperty("webdriver.chrome.driver", "G:/eclipse workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// --> implicit waits for every element
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Hello");
		// search.sendKeys(Keys.ENTER);
		search.submit(); // submits the form
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images"))); // - explicit wait
		// uses in place of assert and verify getPageSource()
		if (driver.getPageSource().contains("Images")) {
			WebElement images = driver.findElement(By.linkText("Images"));
			images.click();
			driver.getPageSource().contains("Images");
		}

	}

}
