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

@Test
public void searchFilterByApproved()throws InterruptedException{
    WebElement leavesKey=Driver.getDriver().findElement(By.xpath("//*[@id='oe_main_menu_navbar']//ul/li[12]"));
    leavesKey.click();
    WebElement addSearchFilter=Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/div/span"));
    addSearchFilter.click();
    Thread.sleep(2000);
    WebElement filterButton=Driver.getDriver().findElement(By.xpath("//div[3]/div[1]/div[1]/button"));
    filterButton.click();
    WebElement approvedFilterButton=Driver.getDriver().findElement(By.xpath("//div[1]/div[3]/div[1]/div[1]//li[2]/a"));
    approvedFilterButton.click();
    WebElement search=Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/div"));
    String expected="Approved Leaves";
    String actual=search.getText();
    Assert.assertTrue(actual.contains(expected));
    Assert.assertTrue(approvedFilterButton.isDisplayed());
}
}
