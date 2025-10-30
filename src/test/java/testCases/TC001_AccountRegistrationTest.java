package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups = { "Regression", "Master" })
	public void verify_account_registration() {
		logger.info("**** starting AccountRegistrationTest *****");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on clickMyAccount link");

			hp.clickRegister();
			logger.info("clicked on clickRegister link ");

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			logger.info("providing Customer details");
			regpage.setFirstName(randomeString().toUpperCase());
			regpage.setLastName(randomeString().toUpperCase());
			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email
			regpage.setTelephone(randomeNumber());

			String password = randomeAlphaNumberic();

			regpage.setPassword(password);
			regpage.setConfiPassword(password);

			regpage.privacyPolicy();
			regpage.setContinue();
			logger.info("validating expected message");

			String confmsg = regpage.getConifrmsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");

		} catch (Exception e) {
			logger.info("Test Failed...");
			logger.debug("Debug logs....");

			Assert.fail("Test failed: " + e.getMessage());

		}
	}
}
