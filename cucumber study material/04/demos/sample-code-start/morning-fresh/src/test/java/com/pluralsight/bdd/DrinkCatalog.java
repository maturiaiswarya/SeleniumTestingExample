package com.pluralsight.bdd;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {

	Map<String, String> drinkCategories = new HashMap<String, String>();

	public void addDrink(String drink, String category) {
		drinkCategories.put(drink, category);
	}

	public Object getCategory(String product) {

		return drinkCategories.get(product);
	}

}
