package test.java;

import main.java.PageEvents.LeapFinanceHomePageEvents;
import main.java.PageEvents.LeapFinanceSpotCounsellingPageEvents;
import org.testng.annotations.Test;

public class DisqualifiedUserSlot3UserType extends BaseTest {
    @Test
    public void testQC1 (){
        validateUser();
        statusOfIETLSOrTOEFL();
        validateThankYouModalWithCTA();
    }

    private void validateUser(){
        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
    }

    private void statusOfIETLSOrTOEFL(){
        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
    }

    private void validateThankYouModalWithCTA(){
        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
    }
}
