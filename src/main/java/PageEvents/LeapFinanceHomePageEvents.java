package main.java.PageEvents;


import main.java.PageObjects.LeapFinanceHomePageElements;
import main.java.Utils.ElementFetch;

import static test.java.BaseTest.driver;

/**
 * This class has been created by Barathwaj Ravisankar on May 12, 2022
 * This class contains all the necessary Page events/method of Leap Finance HomePage.
 */
public class LeapFinanceHomePageEvents {
    ElementFetch elementFetch = new ElementFetch();

    public void getLeapFinanceHomePage() {
        driver.get(LeapFinanceHomePageElements.homePageUrl);
    }

    public void login(String mobNumber, String otp) {
        elementFetch.getWebElement("XPATH", LeapFinanceHomePageElements.getSignInButton).click();
        elementFetch.getWebElement("XPATH", LeapFinanceHomePageElements.getMobileNumberTextBox).click();
        elementFetch.getWebElement("XPATH", LeapFinanceHomePageElements.getMobileNumberTextBox).sendKeys(mobNumber);
        elementFetch.getWebElement("XPATH", LeapFinanceHomePageElements.getOTPButton).click();
        elementFetch.getWebElement("XPATH", LeapFinanceHomePageElements.enterOTPTextBox).click();
        elementFetch.getWebElement("XPATH", LeapFinanceHomePageElements.enterOTPTextBox).sendKeys(otp);
        elementFetch.getWebElement("XPATH", LeapFinanceHomePageElements.getProfilePageText).getText().equalsIgnoreCase("Take the Leap");
    }
}
