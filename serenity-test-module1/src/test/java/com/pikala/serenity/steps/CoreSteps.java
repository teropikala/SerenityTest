package com.pikala.serenity.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CoreSteps extends ScenarioSteps {

	private static final Logger LOG = LoggerFactory.getLogger(CoreSteps.class);


	@Given("^Something happens$")
	public void something_happens() throws Exception {
		LOG.info("Something happens...");
	}

	@Then("^other things happen too$")
	public void other_things_happen_too() throws Exception {
		LOG.warn("But did other thing happen at all?");
	}


}
