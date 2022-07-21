package stepdefination_sample;

import io.cucumber.java.en.*;

public class Sample 
{
	@Given("launch browser")
	public void launch_browser() {
	  System.out.println("BROWSER LAUNCHED");
	}

	@When("enter url")
	public void enter_url() {
	    System.out.println("URL Entered");
	}

	@Then("search for Samsung Mobile")
	public void search_for_samsung_mobile() {
	    System.out.println("Search done for Samsung Phone");
	}

	@Then("close broswer")
	public void close_broswer() {
	 System.out.println("browser closed");
	}

	@Then("search for Samsung TV {string}")
	public void search_for_samsung_tv(String string) {
	   System.out.println("");
	}
	
	@Then("search for MI TV {string}")
	public void search_for_mi_tv(String string) {
	   System.out.println("MI TV");
	}

}
