package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.WebDriverFactory;

public class MainPagaTires {

    WebDriver driver;
    UIutilities uIutilities;

    private By buttonCookies = By.xpath("//div[@class='block-cookies__button']");
    private By buttonPKW = By.xpath("//img[@alt='PKW']");
    private By buttonOffroad_SUV = By.xpath("//img[@alt='Offroad/SUV']");
    private By buttonLLKW_Transporterreifen = By.xpath("//img[@alt='Transporter']");
    private By buttonMotorradreifen = By.xpath("//img[@alt='Motorrad']");

    public MainPagaTires() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    @Step
    public void open() {
        System.out.println("Page was opened.");
        driver.get("https://reifen.pkwteile.de/");

    }

    @Step
    public void cookiesButton() {
        System.out.println("Click Cookies button.");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonCookies));
            element.click();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Step
    public void clickMenuButtonPKW() {
        System.out.println("Choosed type 'PKW'");
       uIutilities.click(buttonPKW,3,10);
    }

    @Step
    public void clickMenuButtonOffroadSuv() {
        System.out.println("Choosed type 'buttonOffroad_SUV'");
        uIutilities.click(buttonOffroad_SUV,3,10);
    }

    @Step
    public void clickMenubuttonLLKW() {
        System.out.println("Choosed type 'buttonOffroad_SUV'");
        uIutilities.click(buttonLLKW_Transporterreifen,3,10);
    }

    public void clickMenubuttonbuttonMotorradreifen() {
        System.out.println("Choosed type 'buttonOffroad_SUV'");
        uIutilities.click(buttonMotorradreifen,3,10);
    }
}
