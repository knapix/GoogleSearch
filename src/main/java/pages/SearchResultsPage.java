package pages;

import assertions.SearchAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends MainPage {



    public SearchResultsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        searchAssertion = new SearchAssertion(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public SearchAssertion searchAssertion;
}
