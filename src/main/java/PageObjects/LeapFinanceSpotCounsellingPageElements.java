package main.java.PageObjects;

public class LeapFinanceSpotCounsellingPageElements {
    public static String counsellingUrl = "https://staging.leapscholar.com/spot-counselling";
    public static String getCountry = "//p[contains(@class, 'jsx-3ccc5950bb0751c5')]";
    public static String getNextButton = "//p[contains(@class, 'pr-2')]";

    public static String getPursuingYearAndTypeOfCourse(String text) {
        String getPursuingYearAndTypeOfCourse = "//p[contains(@class, 'jsx-3ccc5950bb0751c5') and contains(text(), " + text + ")]";
        return getPursuingYearAndTypeOfCourse;
    }

    public static String getPercentageTxtBox = "//input[contains(@class, 'jsx-c600baefe02bf65')]";

    public static String getDropDown = "//div[contains(@class, 'css-1uth16-control')]";

    public static String getDropDownList = "//div[contains(@class, 'css-oktlcb-menu')]";

    public static String getNameTxtBox = "//input[contains(@placeholder, 'Name')]";

    public static String getEmailTxtBox = "//input[contains(@name, 'email')]";

    public static String completeButton = "//button[contains(@class, 'py-3')]";
    public static String chatUrl = "https://staging.leapscholar.com/profile/chat";
    public static String paymentUrl = "https://staging.leapscholar.com/profile/counselling/sc_profile";
}
