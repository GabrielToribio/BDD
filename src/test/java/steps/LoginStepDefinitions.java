package steps;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.DatabasePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDefinitions {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardpage;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	}
	
	@Given ("^User is on the PHP login page$")
	public void User_is_on_the_PHP_login_page() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(2000);
	}
	
	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws ClassNotFoundException, SQLException {
		loginPage.enterUserName(DatabasePage.getData(username));
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws ClassNotFoundException, SQLException {
		loginPage.enterPassword(DatabasePage.getData(password));
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_Login_button() {
		loginPage.clickLoginButton();
	}
	
	@When ("^User enters username from database$")
	public void User_enters_username_from_database() {
		loginPage.enterUserName("admin@phptravels.com");
	}

	@When ("^User enters password from database$")
	public void User_enters_password_from_database() {
		loginPage.enterPassword("demoadmin");
	}
	
	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
	    dashboardpage.validateDashboardPage();
	    loginPage.takeScreenshotAtEndOfTest(driver);
	}
	
	@When ("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String username, String password) {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
