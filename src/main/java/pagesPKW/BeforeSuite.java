package pagesPKW;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class BeforeSuite {

    WebDriver driver;

    public BeforeSuite() {
        this.driver = WebDriverFactory.getDriver();
    }

    @Step
    public void open(String URL) {
        driver.get(URL);
        System.out.println("Page was opened.");
    }
}