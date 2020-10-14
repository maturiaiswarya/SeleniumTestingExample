package com.testing;

public class HomePage {
	String url = "https://www.google.com";
	static String title = "Google";

	public void gotTo() {
		Browser.goTo(url);

	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
