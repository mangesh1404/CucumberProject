package com.Stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class TaggingStepDefinition {

	@Before
    public void setUP(){
	  System.out.println("launch FF");
	  System.out.println("Enter URL for Free CRM APP");
    }
    @After
    public void tearDown(){
	  System.out.println("close the browser");
    }
	@Given("^this is a login test$")
	public void this_is_a_login_test() {
	}

	@Given("^this is a home page test$")
	public void this_is_a_home_page_test() {
	}

	@Given("^this is a contact page test$")
	public void this_is_a_contact_page_test() {
	}

	@Given("^this is a customer page test$")
	public void this_is_a_customer_page_test() {
		
	}

	@Given("^this is a calling page test$")
	public void this_is_a_calling_page_test() {
	}

	@Given("^this is a deals page test$")
	public void this_is_a_deals_page_test() {
	}
}
