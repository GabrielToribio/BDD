package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[2]/p")
	WebElement DASHBOARD_ELEMENT_LOCATOR;

	// Interactive Methods
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT_LOCATOR.getText(), "DASHBOARD");
	}

}
