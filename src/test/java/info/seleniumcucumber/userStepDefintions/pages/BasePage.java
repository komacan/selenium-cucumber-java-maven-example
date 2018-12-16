package info.seleniumcucumber.userStepDefintions.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public SearchPage navigateToHomePage(String url) {
		driver.get(url);
		return new SearchPage(driver);
		
	}
}