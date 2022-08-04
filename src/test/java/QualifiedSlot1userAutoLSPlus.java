package test.java;

import main.java.PageEvents.LeapFinanceHomePageEvents;
import main.java.PageEvents.LeapFinanceSpotCounsellingPageEvents;
import org.testng.annotations.Test;

/**
 * This class has been created by Barathwaj Ravisankar on May 12, 2022
 */

public class QualifiedSlot1userAutoLSPlus extends BaseTest {
    @Test
    public void testQC1 () throws InterruptedException {
//        validateUser();
//        validateProfileChatDashboard();
//        validateBackToHomePage();
        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
        leapFinanceSpotCounsellingPageEvents.openGoogleAndTypeGitInSearchBar("Github");
    }

//    private void validateUser(){
//        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
//        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
//    }
//
//    private void validateProfileChatDashboard(){
//        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
//        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
//    }
//
//    private void validateBackToHomePage(){
//        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
//        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
//    }
}
