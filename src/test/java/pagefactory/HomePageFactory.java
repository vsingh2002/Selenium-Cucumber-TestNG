package pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageFactory {
	WebDriver driver;

	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Products']")
	WebElement verifyHomepage;

	public void isHomePageDisplay() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		verifyHomepage.isDisplayed();
		WebElement verify = wait.until(ExpectedConditions.visibilityOf(verifyHomepage));
		verify.isDisplayed();

	}
}
