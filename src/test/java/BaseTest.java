import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.WebDriverFactory;

public class BaseTest {

    @BeforeTest(groups = "Regression")
    public void setUp() {
        WebDriverFactory.createInstance("chrome");
    }

    @AfterTest(groups = "Regression")
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }
}
