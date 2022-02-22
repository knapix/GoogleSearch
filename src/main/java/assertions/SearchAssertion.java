package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.MainPage;

public class SearchAssertion extends MainPage {

    @FindBy(css = "div[class=MUFPAc]")
    private WebElement resultsReady;

    @FindBy(css = "div[class='v7W49e']")
    //@FindBy(css = "div[id='search']")
    private WebElement searchResults;

    public SearchAssertion(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public void isResultsVisible() {
        wait.until(ExpectedConditions.visibilityOf(resultsReady));
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='v7W49e']")).isDisplayed());
    }
}
