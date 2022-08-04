package main.java.PageEvents;


import main.java.PageObjects.LeapFinanceHomePageElements;
import main.java.PageObjects.LeapFinanceSpotCounsellingPageElements;
import main.java.Utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import static test.java.BaseTest.driver;

/**
 * This class has been created by Barathwaj Ravisankar on May 12, 2022
 * This class contains all the necessary Page events/method of Leap Finance Counselling Page.
 */
public class LeapFinanceSpotCounsellingPageEvents {
    ElementFetch elementFetch = new ElementFetch();

    public void getNewTab(int index) throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        //To switch to the new tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
    }

    public void getCounsellingUrl(int index) throws AWTException {
        getNewTab(index);
        driver.get(LeapFinanceSpotCounsellingPageElements.counsellingUrl);
    }

    public void selectCountry(String country) {
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getPursuingYearAndTypeOfCourse(country)).click();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getNextButton).click();
    }

    public void selectInTakeYear(String year) {
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getPursuingYearAndTypeOfCourse(year)).click();
    }

    public void selectTypeOfDegree(String degree) {
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getPursuingYearAndTypeOfCourse(degree)).click();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getNextButton).click();
    }

    public void selectHighestLevelOfEducation(String qualification) {
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getPursuingYearAndTypeOfCourse(qualification)).click();
    }

    public void selectPercentageAndYearOfGraduation(String percentage, String year) {
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getPercentageTxtBox).click();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getPercentageTxtBox).clear();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getPercentageTxtBox).sendKeys(percentage);
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getDropDown).click();
        Select passingYear = new Select(elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getDropDownList));
        passingYear.selectByVisibleText(year);
    }

    public void selectStatusOfExam(String status) {
        Select passingYear = new Select(elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getDropDownList));
        passingYear.selectByVisibleText(status);
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getNextButton).click();
    }

    public void enterNameAndEmailAddress(String name, String emailAddress) {
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getNameTxtBox).click();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getNameTxtBox).clear();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getNameTxtBox).sendKeys(name);
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getEmailTxtBox).click();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getEmailTxtBox).clear();
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.getEmailTxtBox).sendKeys(emailAddress);
        elementFetch.getWebElement("XPATH", LeapFinanceSpotCounsellingPageElements.completeButton).click();
    }

    public void selectMeetingFinder(int index) throws AWTException {
        getNewTab(index);
    }

    public void getChatWindow(int index) throws AWTException {
        getNewTab(index);
        driver.get(LeapFinanceSpotCounsellingPageElements.chatUrl);
    }

    public void getCounsellingScProfile(int index) throws AWTException {
        getNewTab(index);
        driver.get(LeapFinanceSpotCounsellingPageElements.paymentUrl);
    }

    public void openGoogleAndTypeGitInSearchBar(String searchTxt) throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title='Search']")).click();
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(searchTxt);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//cite[@class='iUh30 tjvcx']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[@aria-label='Homepage']")).isDisplayed();
    }

}
