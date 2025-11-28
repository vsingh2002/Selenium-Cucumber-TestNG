package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement usernameField;
	@FindBy(id = "password")
	WebElement passwordField;
	@FindBy(id = "login-button")
	WebElement loginButton;

	public void enterUsername(String username) {

		usernameField.sendKeys(username);

	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

}
