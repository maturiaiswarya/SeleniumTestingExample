package com.testing;

import org.junit.Test;
// import org.junit.After; - runs after every test case so the 2nd test case will fail
import org.junit.AfterClass;
import org.junit.Assert;

public class UnitTestOne {

	@Test
	public void canGotoHomePage() {
		Pages.homePage().gotTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}

	@Test
	public void googleSearch() {
		Pages.homePage().gotTo();
		Assert.assertTrue(Pages.homePage().isAt());
		Pages.googleSearch().search("images");
		Assert.assertTrue(Pages.googleSearch().isAt());
	}

	@AfterClass
	public static void clean() {
		Browser.close();
	}

}
