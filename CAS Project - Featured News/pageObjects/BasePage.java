package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// Author: Nishchay

public class BasePage {
	protected WebDriver driver; // Initialize the driver

	// Constructor of the driver

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
