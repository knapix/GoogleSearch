import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.IndexPage;

public class MainTest {

    WebDriver driver;
    WebDriverWait wait;
    IndexPage indexPage;

    @BeforeTest
    @Parameters({"url"})
    public void before(String url) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

        //prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 30);
        indexPage = new IndexPage(driver, wait, url);


    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
