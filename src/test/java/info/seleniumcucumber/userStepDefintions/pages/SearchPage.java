package info.seleniumcucumber.userStepDefintions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
	public SearchPage(WebDriver driver) {
	    super(driver);
	}
	
	public SearchPage enterSearchText(String searchText) {
		WebElement searchInput = driver.findElement(By.xpath("//input[@title='Search']"));
		searchInput.sendKeys(searchText);
		searchInput.sendKeys(Keys.TAB);
		
		return new SearchPage(driver);		
	}
	
	public SearchPage clickSearchButton() {
		WebElement googleSearchButton = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
		googleSearchButton.click();
		
		return new SearchPage(driver);
	}
	
}