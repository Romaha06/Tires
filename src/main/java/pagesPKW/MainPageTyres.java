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
import static org.testng.Assert.assertTrue;

public class MainPageTyres {

    WebDriver driver;
    UIutilities uIutilities;
    ListingPage listingPage;

    public By btnCookies = By.xpath("//div[@class='block-cookies__button']");
    private By btnPKW = By.xpath("//img[@alt='PKW']");
    private By btnSUV = By.xpath("//img[@alt='Offroad/SUV']");
    private By btnLLKW = By.xpath("//img[@alt='Transporter']");
    private By btnMotoTyres = By.xpath("//img[@alt='Motorrad']");
    private By selectSeasonsWinter = By.xpath("//div[@class='season-tyre__label--winter']");
    private By selectSeasonsSummer = By.xpath("//div[@class='season-tyre__label--summer']");
    private By selectSeasonsAll = By.xpath("//div[@class='season-tyre__label--all-weather']");
    private By btnTyresSearch = By.id("tyres_search");
    private By btnAddBasketTop = By.xpath("//div[@class='basket_btn button active_red_button']");


    public MainPageTyres() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
        listingPage = new ListingPage();
    }


    @Step
    public void addToBasketFromBlockTop(){
        System.out.println("Add item to basket from block top");
        uIutilities.click(btnAddBasketTop,3,10);
        uIutilities.click(listingPage.basket,3,10);
        assertTrue(listingPage.checkElementIsDisplayed(listingPage.priceInBasket), "Item added to basket");
    }

    @Step
    public void closePopup(By locator) {
        System.out.println("Close popup.");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.click();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Step
    public void clickMenuBtnPKW() {
        System.out.println("Choose type 'PKW'");
        uIutilities.click(btnPKW, 3, 10);
    }

    @Step
    public void clickMenuBtnSUV() {
        System.out.println("Choose type 'button Off-Road_SUV'");
        uIutilities.click(btnSUV, 3, 10);
    }

    @Step
    public void clickMenuBtnLLKW() {
        System.out.println("Choose type 'button LLKW'");
        uIutilities.click(btnLLKW, 3, 10);
    }

    @Step
    public void clickMenuBtnMoto() {
        System.out.println("Choose type 'button moto'");
        uIutilities.click(btnMotoTyres, 3, 10);
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
        uIutilities.click(btnTyresSearch, 3, 10);
    }

    @Step
    public void checkPageURL(String expectedURL) {
        uIutilities.waitLoadPageUsingScript();
        Assert.assertEquals(WebDriverFactory.getDriver().getCurrentUrl(), expectedURL);
    }

    @Step
    public void checkTitle(String expectedTitle) {
        uIutilities.waitLoadPageUsingScript();
        assertEquals(WebDriverFactory.getDriver().getTitle(), expectedTitle);
    }
}
