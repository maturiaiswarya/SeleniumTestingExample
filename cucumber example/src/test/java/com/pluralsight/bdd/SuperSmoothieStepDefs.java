package com.pluralsight.bdd;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SuperSmoothieStepDefs {
	DrinkCatalog drinkCatalog = new DrinkCatalog();
	PointsCatalog pointscatalog = new PointsCatalog(drinkCatalog);
	MorningFreshnessMember alice;
	Map<String, String> drinkCategory;

	@Given("the following categories:")
	public void the_following_categories(List<Map<String, String>> drinkCategories) {
//		drinkCategories.stream();
//		for (Map<String, String> drinkCategory : drinkCategories) {
//			String drink = drinkCategory.get("Drink");
//			String category = drinkCategory.get("Category");
//			int points = Integer.parseInt(drinkCategory.get("Points"));
//			drinkCatalog.addDrink(drink, category);
//			pointscatalog.setPoint(category, points);
//		}

		drinkCategories.stream().forEach(drinkCategory -> {
			String drink = drinkCategory.get("Drink");
			String category = drinkCategory.get("Category");
			int points = Integer.parseInt(drinkCategory.get("Points"));
			drinkCatalog.addDrink(drink, category);
			pointscatalog.setPoint(category, points);
		}

		);
	}

	@Given("^(.*) is morning freshness person$")
	public void alice_is_morning_freshness_person(String name) {
		alice = new MorningFreshnessMember(name, pointscatalog);
	}

	@When("^(.*) purchases (\\d+) (.*) drinks?$")
	public void alice_purchases_Banana_drinks(String name, Integer amount, String product) {
		alice.orders(amount, product);
	}

	@Then("he should earn {int}")
	public void he_should_earn(Integer points) {
		assertThat(alice.getPoints()).isEqualTo(points);

	}

}
