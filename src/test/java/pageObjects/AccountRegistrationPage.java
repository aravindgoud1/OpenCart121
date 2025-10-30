package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id=\"input-firstname\"]")
	WebElement firstName;
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	WebElement lastName;
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement email;
	@FindBy(xpath="//input[@id=\"input-telephone\"]")
	WebElement telephone;
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement password;
	@FindBy(xpath="//input[@id=\"input-confirm\"]")
	WebElement confPassword;
	@FindBy(xpath="//input[@name=\"agree\"]")
	WebElement checkBox; 
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuee;
	@FindBy(xpath="//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement confirmMessage;
	 public void setFirstName(String fname) {
		 firstName.sendKeys(fname);
		 
	 }
	 public void setLastName(String lname) {
		 lastName.sendKeys(lname);
	 }
	 public void setEmail(String mail) {
		 email.sendKeys(mail);
	 }
	 public void setTelephone(String telephonee) {
		 telephone.sendKeys(telephonee);
	 }
	 public void setPassword(String pwd) {
		password.sendKeys(pwd); 
	 }
	 public void setConfiPassword(String pwd) {
		 confPassword.sendKeys(pwd);
	 }
	 public void privacyPolicy() {
		 checkBox.click();
	 }
	 public void setContinue() {
		 continuee.click(); 
	 }

		public String getConifrmsg() {
		 try {
		 return confirmMessage.getText() ;
		 }
		 catch (Exception e) {
			return (e.getMessage());
		}
	 }
	
	

}
