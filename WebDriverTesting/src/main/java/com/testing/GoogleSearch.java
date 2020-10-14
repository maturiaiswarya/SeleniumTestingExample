package com.testing;

import org.openqa.selenium.By;

public class GoogleSearch {

	static String title = "";

	public boolean isAt() {
		return Browser.title().contains(title);
	}

	public void search(String search) {
		title = search;
		Browser.driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(search);
		Browser.driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).submit();
	}

}
