package matrixSmoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBase;

public class MatrixSmokeSuite extends TestBase {

    @Test
    public void createLeaveThroughCalendar(){
        WebElement leavesButton = Driver.getDriver().findElement(By.linkText("Leaves"));
        leavesButton.click();

        WebElement leaveRequestButton = Driver.getDriver().findElement(By.linkText
                ("Leaves Request"));
        leaveRequestButton.click();

        WebElement july31 = Driver.getDriver().findElement(By.xpath("(//div[@class='fc-bg'])[5]//td[5]"));
        july31.click();

        WebElement createLeaveRequestMenu = Driver.getDriver().findElement(By.xpath("//div[@class='o_form_sheet_bg']"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(createLeaveRequestMenu.isDisplayed(),"Create leave menu is not displayed");

        softAssert.assertAll();

    }

    @Test
    public void checkIfCalendarIsDisplayed(){
        WebElement leavesButton = Driver.getDriver().findElement(By.linkText("Leaves"));
        leavesButton.click();

        WebElement leaveRequestButton = Driver.getDriver().findElement(By.linkText
                ("Leaves Request"));
        leaveRequestButton.click();

        WebElement calendar = Driver.getDriver().findElement(By.xpath("//div[@class='o_main_content']"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(calendar.isDisplayed(),"Calendar is not displayed");

        softAssert.assertAll();
    }


}
