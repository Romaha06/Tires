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
    private By addToBasket = By.xpath("//div[@class='basket_btn button active_red_button ']");
    private By basket = By.xpath("//a[@data-gac='Go_to_basket']");
    private By priceInBasket = By.xpath("//td[@class='price']");



    public ListingPage() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
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

    private boolean checkElementIsDisplayed(By locator) {
        try {
            driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    @Step
    public void addToBasket() {
        System.out.println("Add product to basket");
        uIutilities.click(addToBasket,3,10);
        uIutilities.click(basket, 3,10);
        assertTrue(checkElementIsDisplayed(priceInBasket));
    }
}
