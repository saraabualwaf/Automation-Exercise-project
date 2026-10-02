package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.SingupPage;

public class SingupTest extends BaseClass {

    @Test
    public void validSignup() {

    	SingupPage signupPage = new SingupPage(driver);

        signupPage.signup( "Sara","abualwafasara@gmail.com");

        signupPage.enterAccountInformation();

        Assert.assertTrue(
            signupPage.isAccountCreatedDisplayed(),
            "Account Created!"
        );
    }
}