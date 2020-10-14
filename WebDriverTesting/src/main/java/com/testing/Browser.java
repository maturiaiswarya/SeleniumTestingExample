package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	static WebDriver driver = new ChromeDriver();

	public static void goTo(String url) {
		System.setProperty("webdriver.chrome.driver", "G:/eclipse workspace/chromedriver.exe");
		driver.get(url);
	}

	public static String title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.close();

	}

}
