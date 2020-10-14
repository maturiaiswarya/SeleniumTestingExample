package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxTesting {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:/eclipse workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///G:/eclipse%20workspace/WebDriverTesting/src/main/webapp/Checkbox.html");
		driver.findElement(By.id("mayoCheckbox")).click();
		driver.findElements(By.name("color")).get(0).click();

		WebElement dropdown = driver.findElement(By.id("select1"));
		Select s = new Select(dropdown); // wrapper classs in which we are wrapping an object and giving to another
											// class
		s.selectByIndex(2);

		System.out.print(driver.findElement(By.tagName("table")).findElement(By.tagName("table"))
				.findElements(By.tagName("td")).get(1).getText());
		// if we aren't using xpath

	}
}
