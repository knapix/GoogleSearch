import org.testng.annotations.Test;

public class SearchTest extends MainTest {

String searchKey = "Paweł Knap";

    @Test
    public void shouldSearchMyName() {

        indexPage.openIndexPage()
                .clickAllowCookies()
                .setString(searchKey)
                .clickSearchButton()
                .searchAssertion.isResultsVisible();


    }

}
