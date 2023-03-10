package ca.mcgill.ecse.flightmanagementsystem.features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepDefinitions {

	/*
	 * In general:
	 * 
	 * @Given will create a bunch of objects e.g. fms.addPerson()
	 * 
	 * @When will call the controller e.g. FMSController.createAirport()
	 * 
	 * @Then will use ASSERTIONS
	 *
	 * String s1 = "hello"; String s2 = "hello";
	 * 
	 * // check if s1 == s2 and return an error if not assertEquals(s1,s2);
	 * assertTrue(s1.equals(s2));
	 */

	@Given("a FlightManagementSystem exists")
	public void a_FlightManagementSystem_exists() {
		throw new io.cucumber.java.PendingException();
	}

	@Given("the following airports exist in the system")
	public void the_following_airports_exist_in_the_system(io.cucumber.datatable.DataTable dataTable) {
		throw new io.cucumber.java.PendingException();
	}

	@When("an airport is added with code {string} and address {string}")
	public void an_airport_is_added_with_code_and_address(String code, String address) {
		throw new io.cucumber.java.PendingException();
	}

	@Then("an airport shall exist with code {string} and address {string}")
	public void an_airport_shall_exist_with_code_and_address(String code, String address) {
		throw new io.cucumber.java.PendingException();
	}

	@Then("there should be no error")
	public void there_should_be_no_error() {
		throw new io.cucumber.java.PendingException();
	}

	@Then("the number of airports shall be {string}")
	public void the_number_of_airports_shall_be(String number) {
		throw new io.cucumber.java.PendingException();
	}

	@Then("there should be an error returned with message {string}")
	public void there_should_be_an_error_returned_with_message(String message) {
		throw new io.cucumber.java.PendingException();
	}

}
