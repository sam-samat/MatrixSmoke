package leavesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LandingPage {

    WebDriver driver;

    public LandingPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    @FindBy (linkText = "Leaves")
    public WebElement leavesButton;
}