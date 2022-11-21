package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Find_A_Cause;
import utility.BaseUtil;
import utility.Constants;

public class Find_A_Cause_Test extends BaseUtil{
	private BaseUtil base;
	public Find_A_Cause_Test(BaseUtil base) {
		this.base=base;
	}
	
	@Given("user is able to navigate to  https:\\/\\/www.easyfundraising.org.uk\\/")
	public void user_is_able_to_navigate_to_https_www_easyfundraising_org_uk() {
		base.driver.get(Constants.URL);
		
	}

	@And("user clicks on Find a cause")
	public void user_clicks_on_find_a_cause() {
		base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Find_A_Cause cause = new Find_A_Cause(base);
		cause.Click_Find_A_Cause();
	}

	@When("user enters three characters letter in the search box,and selects third cause from list")
	public void user_enters_three_characters_letter_in_the_search_box_and_selects_third_cause_from_list() {
		
		Find_A_Cause cause = new Find_A_Cause(base);
		cause.Input_Chars(Constants.CHARACTERS);
	}	

	@And("clicks search")
	public void clicks_search() {
		Find_A_Cause cause = new Find_A_Cause(base);
		cause.clickSearch();

	}

	@Then("confirm with a message if the cause exists")
	public void confirm_with_a_message_to_if_the_cause_exists() {
		Find_A_Cause cause = new Find_A_Cause(base);
		cause.confirmCause();

	}


}
