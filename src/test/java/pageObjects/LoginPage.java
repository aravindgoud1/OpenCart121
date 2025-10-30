package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement emailAddress;
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement inputAddress;
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement login;
	public void email(String emiall) {
		emailAddress.sendKeys(emiall);
	}
	public void password(String pswd) {
		inputAddress.sendKeys(pswd);
	}
	public void login() {
		login.click();
	}

}
