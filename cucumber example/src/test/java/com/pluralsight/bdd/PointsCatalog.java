package com.pluralsight.bdd;

import java.util.HashMap;
import java.util.Map;

public class PointsCatalog {
	DrinkCatalog dc;
	Map<String, Integer> pointCategory = new HashMap<String, Integer>();

	PointsCatalog(DrinkCatalog dc) {
		this.dc = dc;
	}

	public void setPoint(String drink, int points) {
		pointCategory.put(drink, points);

	}

	public int getPointsFor(String product) {

		return pointCategory.get(categoryOf(product));
	}

	private Object categoryOf(String product) {
		return dc.getCategory(product);
	}

}
