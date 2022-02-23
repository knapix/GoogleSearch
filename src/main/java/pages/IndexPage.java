package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends MainPage {

    @FindBy(css = "input[class=gNO89b]")
    private WebElement searchButton;

    @FindBy(css = "input[type=text]")
    private WebElement searchText;

    @FindBy(css = "button[id='L2AGLb']")
    private WebElement agreeButton;

    public IndexPage(WebDriver driver, WebDriverWait wait, String url) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
        this.url = url;
    }

    public IndexPage openIndexPage() {
        driver.get(url);
        return this;
    }

    public IndexPage clickAllowCookies() {
        waitForElementToBeClickableAndClick(agreeButton);
        return this;
    }

    public IndexPage setString(String name) {
        wait.until(ExpectedConditions.visibilityOfAllElements(searchText));
        searchText.sendKeys(name);
        return this;
    }

    public SearchResultsPage clickSearchButton() {
        searchButton.submit();
        return new SearchResultsPage(driver, wait);
    }


}
