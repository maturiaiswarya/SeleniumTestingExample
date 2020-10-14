package com.testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoteDriver {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "G:/eclipse workspace/chromedriver.exe");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Hello");
		search.submit(); // submits the form
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images"))); // - explicit wait
		if (driver.getPageSource().contains("Images")) {
			WebElement images = driver.findElement(By.linkText("Images"));
			images.click();
			driver.getPageSource().contains("Images");
		}
		driver.close();
	}

}
