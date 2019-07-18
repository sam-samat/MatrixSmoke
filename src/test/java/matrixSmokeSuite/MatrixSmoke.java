package matrixSmokeSuite;

import leavesPages.LandingPage;
import leavesPages.LeavesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class MatrixSmoke extends TestBase {

    @Test
    public void checkIfCalendarIsDisplayed()throws InterruptedException{

        LandingPage ERPLandingPage = new LandingPage();
        Thread.sleep(1000);
        ERPLandingPage.leavesButton.click();

        LeavesPage leaves = new LeavesPage();
        leaves.leaveRequestButton.click();

        Assert.assertTrue(leaves.calendar.isDisplayed(),"Calendar is not displayed");

    }

    @Test
    public void createLeaveThroughCalendar()throws InterruptedException{
        LandingPage ERPLandingPage = new LandingPage();
        Thread.sleep(3000);
        ERPLandingPage.leavesButton.click();

        LeavesPage leaves = new LeavesPage();
        leaves.leaveRequestButton.click();
        leaves.july31.click();

        Assert.assertTrue(leaves.july31DateInput.getAttribute("value").contains("07/31/2019"),"Leaves date verification failed");
        Assert.assertTrue(leaves.leavesRequestMenu.isDisplayed(),"Leaves request menu verification failed");

    }
}
