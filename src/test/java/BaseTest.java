import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.WebDriverFactory;

public class BaseTest {

    WebDriver driver;

    @BeforeTest(groups = "Regression")
    public void setUp() {
        WebDriverFactory.createInstance("Chrome");
    }

    @AfterTest(groups = "Regression")
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }
}
