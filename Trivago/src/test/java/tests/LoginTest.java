package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;


@Test
public class LoginTest extends BaseClass {
	
	public void validlogin() {
	LoginPage loginPage = new LoginPage(driver);
	loginPage.Login("abualwafasara@gmail.com","Sara123456*");
	
	
	boolean result =loginPage.verifylogin().contains("Logged in as");
	Assert.assertTrue(result);
	
}
}