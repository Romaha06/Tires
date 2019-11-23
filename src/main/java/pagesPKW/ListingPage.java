package pagesPKW;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;
import static org.testng.Assert.*;


public class ListingPage {

    WebDriver driver;
    UIutilities uIutilities;

    private By nextPage = By.xpath("//a[@rel='next']");
    private By outOfStock = By.xpath("//div[@class='vers_box grey']");
    private By btnAddBasket = By.xpath("//div[@class='basket_btn button active_red_button ']");
    public By basket = By.xpath("//a[@data-gac='Go_to_basket']");
    public By priceInBasket = By.xpath("//td[@class='price']");
    private By prodPage = By.xpath("//a[@class='prod_link']");
    private By btnAddBasketProdPage = By.xpath("//button[@class='pkw-product__buy-btn basket_btn tires ']");
    private By closePopupProdPage = By.xpath("//span[@class='popup-related__close']");



    public ListingPage() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    @Step
    public void open(String url) {
        driver.get(url);
        System.out.println("Page was opened.");
    }

    @Step
    public void checkGrayBtnOnListing() {
        uIutilities.waitLoadPageUsingScript();
        while (checkElementIsDisplayed(nextPage)) {
            assertFalse(checkElementIsDisplayed(outOfStock), "Out of stock item displayed!");
            driver.findElement(nextPage).click();
            uIutilities.waitLoadPageUsingScript();
        }
    }

    public boolean checkElementIsDisplayed(By locator) {
        try {
            driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    @Step
    public void addToBasket() {
        System.out.println("Add item to basket from listing");
        uIutilities.click(btnAddBasket,3,10);
        uIutilities.click(basket, 3,10);
        assertTrue(checkElementIsDisplayed(priceInBasket),"Item added to Basket");
    }

    @Step
    public void addToBasketFromProdPage(){
        System.out.println("Add item to basket from product page");
        uIutilities.click(prodPage,3,10);
        uIutilities.click(btnAddBasketProdPage,3,10);
        uIutilities.click(closePopupProdPage,3,10);
        uIutilities.click(basket,3,10);
        assertTrue(checkElementIsDisplayed(priceInBasket),"Item added to Basket");
    }
}
