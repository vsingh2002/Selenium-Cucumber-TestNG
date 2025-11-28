package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePageFactory;
import pagefactory.LoginPageFactory;
import pages.LoginPage;

public class PageFactoryLoginStepDefinition {
	WebDriver driver;
	LoginPageFactory loginPage;
	HomePageFactory homePage;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		loginPage = new LoginPageFactory(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLoginButton();
	}

	@Then("User navigated to homepage")
	public void user_navigated_to_homepage() {
		homePage = new HomePageFactory(driver);
		homePage.isHomePageDisplay();
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}
}
