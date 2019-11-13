package pagesPKW;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.WebDriverFactory;

import static org.testng.Assert.assertEquals;
import static pagesPKW.PageURLs.mainPageTYres;

public class MainPagaTires {

    WebDriver driver;
    UIutilities uIutilities;

    private By buttonCookies = By.xpath("//div[@class='block-cookies__button']");
    private By buttonPKW = By.xpath("//img[@alt='PKW']");
    private By buttonOffroad_SUV = By.xpath("//img[@alt='Offroad/SUV']");
    private By buttonLLKW_Transporterreifen = By.xpath("//img[@alt='Transporter']");
    private By buttonMotorradreifen = By.xpath("//img[@alt='Motorrad']");
    private By selectSeasonsWinter = By.xpath("//div[@class='season-tyre__label--winter']");
    private By selectSeasonsSummer = By.xpath("//div[@class='season-tyre__label--summer']");
    private By selectSeasonsAll = By.xpath("//div[@class='season-tyre__label--all-weather']");
    private By buttonTyresSearch = By.id("tyres_search");

    public MainPagaTires() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    @Step
    public void open() {
        driver.get(mainPageTYres);
        System.out.println("Page was opened.");

    }

    @Step
    public void clickCookiesButton() {
        System.out.println("Click Cookies button.");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonCookies));
            element.click();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Step
    public void clickMenuButtonPKW() {
        System.out.println("Choosed type 'PKW'");
        uIutilities.click(buttonPKW, 3, 10);
    }

    @Step
    public void clickMenuButtonOffroadSuv() {
        System.out.println("Choosed type 'buttonOffroad_SUV'");
        uIutilities.click(buttonOffroad_SUV, 3, 10);
    }

    @Step
    public void clickMenubuttonLLKW() {
        System.out.println("Choosed type 'buttonLLKW'");
        uIutilities.click(buttonLLKW_Transporterreifen, 3, 10);
    }

    @Step
    public void clickMenubuttonMotorrad() {
        System.out.println("Choossed type 'buttonMotorrad'");
        uIutilities.click(buttonMotorradreifen, 3, 10);
    }

    @Step
    public void formSeasonWinter() {
        System.out.println("Choose from Seasons: Winter");
        uIutilities.click(selectSeasonsWinter, 3, 10);
    }

    @Step
    public void formSeasonSummer() {
        System.out.println("Choose from Seasons: Summer");
        uIutilities.click(selectSeasonsSummer, 3, 10);
    }

    @Step
    public void formSeasonAll() {
        System.out.println("Choose from Seasons: Seasons-All");
        uIutilities.click(selectSeasonsAll, 3, 10);
    }

    @Step
    public void search() {
        System.out.println("Click button Search.");
        uIutilities.click(buttonTyresSearch, 3, 10);
    }

    @Step
    public void checkPageURL(String expectedURL) {
        uIutilities.waitLoadPageUsingScript();
        Assert.assertEquals(WebDriverFactory.getDriver().getCurrentUrl(), expectedURL);
    }

    @Step
    public void checkTitel(String expectedTitel) {
        uIutilities.waitLoadPageUsingScript();
        assertEquals(WebDriverFactory.getDriver().getTitle(), expectedTitel);
    }

}
