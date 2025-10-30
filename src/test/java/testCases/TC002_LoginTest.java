package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	@Test(groups = {"Sanity","Master"})
	public void verifyLogin() {
		logger.info("........started Login Test Page.....");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			LoginPage lp = new LoginPage(driver);
			lp.email(pr.getProperty("email"));
			lp.password(pr.getProperty("password"));
			lp.login();
			MyAccountPage ma = new MyAccountPage(driver);
			boolean accountPageExists = ma.isMyAccountPageExists();
			Assert.assertTrue(accountPageExists);
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info(".......finished Login test page");

	}

}
