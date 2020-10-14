package com.testing;

public class Pages {

	public static HomePage homePage() {
		HomePage HomePage = new HomePage();
		return HomePage;
	}

	public static GoogleSearch googleSearch() {
		GoogleSearch s = new GoogleSearch();
		return s;
	}

}
