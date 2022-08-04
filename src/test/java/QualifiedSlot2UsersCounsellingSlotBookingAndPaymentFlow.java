package test.java;

import main.java.PageEvents.LeapFinanceHomePageEvents;
import main.java.PageEvents.LeapFinanceSpotCounsellingPageEvents;
import org.testng.annotations.Test;

public class QualifiedSlot2UsersCounsellingSlotBookingAndPaymentFlow extends BaseTest{
    @Test
    public void testQC1 (){
        validateUser();
        meetingRequestBooking();
        paymentValidation();
    }

    private void validateUser(){
        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
    }

    private void meetingRequestBooking(){
        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
    }

    private void paymentValidation(){
        LeapFinanceHomePageEvents leapFinanceHomePageEvents = new LeapFinanceHomePageEvents();
        LeapFinanceSpotCounsellingPageEvents leapFinanceSpotCounsellingPageEvents = new LeapFinanceSpotCounsellingPageEvents();
    }
}
