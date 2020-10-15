package com.pluralsight.bdd;

import com.pluralsight.bdd.calculator.Calculator;
import static org.assertj.core.api.Assertions.assertThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefs {
	Calculator c;
	int result;

	@Given("I have a calculator")
	public void i_have_a_calculator() {
		c = new Calculator();
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
		result = c.add(int1, int2);
	}

	@Then("I should get {int}")
	public void i_should_get(Integer int1) {
		assertThat(int1).isEqualTo(result);
	}

}
