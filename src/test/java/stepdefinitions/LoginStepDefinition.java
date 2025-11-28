//package stepdefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.LoginPage;
//
//public class LoginStepDefinition {
//	WebDriver driver;
//	LoginPage page;
//
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_username_and_password(String username, String password) {
//		page = new LoginPage(driver);
//		page.enterUsername(username);
//		page.enterPassword(password);
//
////		driver.findElement(By.id("user-name")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@And("User clicks on login button")
//	public void user_clicks_on_login_button() {
//		page.clickLoginButton();
////		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("User navigated to homepage")
//	public void user_navigated_to_homepage() {
//		page.logoVerify();
////		Assert.assertTrue(driver.findElements(By.xpath("//div[text()='Swag Labs']")).size() > 0, "Login ");
//
//	}
//
//	@And("Close the browser")
//	public void close_the_browser() {
//		driver.quit();
//	}
//}
