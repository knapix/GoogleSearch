import io.github.bonigarcia.wdm.WebDriverManager;
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
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 30);
        indexPage = new IndexPage(driver, wait, url);

    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
