package info.seleniumcucumber.userStepDefintions;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.userStepDefintions.pages.SearchPage;

public class UserStepDefinitions {

	WebDriver driver = DriverUtil.getDefaultDriver();
	SearchPage search;

	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String arg1) throws Throwable {
		search = new SearchPage(driver);
		search.navigateToHomePage(arg1);
	}

	@And("^I enter \"([^\"]*)\" into input field$")
	public void iEnterIntoInputField(String arg1) throws Throwable {
		search.enterSearchText(arg1);
	}

	@When("^I click search$")
	public void iClickSearch() throws Throwable {
		search.clickSearchButton();
	}

	@Then("^I should get results for \"([^\"]*)\"$")
	public void iShouldGetSomeResults(String arg1) throws Throwable {
		assertTrue(driver.getTitle().contains(arg1));
		
	}

	@Before
	public void startUp() {
		//driver.
	}

	@After
	public void tearDown() {
		driver.quit();
	}


}
