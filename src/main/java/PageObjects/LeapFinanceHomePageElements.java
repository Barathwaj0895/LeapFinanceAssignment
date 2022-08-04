package main.java.PageObjects;


/**
 * This class has been created by Barathwaj Ravisankar on May 21, 2022
 * This class contains all the necessary Page elements of Leap Finance Home Page.
 */
public class LeapFinanceHomePageElements {
    public static String homePageUrl = "https://staging.leapscholar.com/";
    public static String getSignInButton = "//*[text()='Sign In']";
    public static String getMobileNumberTextBox = "//input[@placeholder='Mobile Number']";
    public static String getOTPButton = "//*[text()='Get OTP']";
    public static String enterOTPTextBox = "//div[contains(@class,'mb-4')]";
    public static String getProceedButton = "//*[text()='Proceed']";
    public static String getProfilePageText = "//div[contains(@class, 'md:text')]";
}
