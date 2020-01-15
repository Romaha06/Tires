package pagesPKW;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.WebDriverFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;


public class ListingPage {

    WebDriver driver;
    UIutilities uIutilities;
    MainPageTyres mainPagaTyres;

    private By nextPage = By.xpath("//a[@rel='next']");
    private By outOfStock = By.xpath("//div[@class='vers_box grey']");
    private By btnAddBasket = By.xpath("//div[@class='basket_btn button active_red_button ']");
    public By basket = By.xpath("//a[@data-gac='Go_to_basket']");
    public By priceInBasket = By.xpath("//td[@class='price']");
    private By prodPageLink = By.xpath("//a[@class='prod_link']");
    private By btnAddBasketProdPage = By.xpath("//button[@class='pkw-product__buy-btn basket_btn tires ']");
    private By closePopupProdPage = By.xpath("//span[@class='popup-related__close']");
    private  By labelPrice = By.xpath("//div[@class='price']/span");





    public ListingPage() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    public void checkSortingByPrice(boolean naturalOrder){
        System.out.println("Price Sort Check");
        List<WebElement> pricesWebElements = driver.findElements(labelPrice);
        //получаем текст цены, парсим цифры, превращаем в Double и записываем в список pricesFromSite
        List<Double> pricesFromSite = new ArrayList<>();
        for(WebElement element : pricesWebElements){
            Double price = Double.parseDouble(
                    element.getText().replaceAll("(\\d+)[,]{1}(\\d*).*","$1.$2"));
            pricesFromSite.add(price);
        }

        //делаем копию списка pricesFromSite и сортируем список sortedPrices
        List<Double> sortedPrices = new ArrayList<>(pricesFromSite);
        if (naturalOrder == true) {
            Collections.sort(sortedPrices);  //по возростанию
        } else {
            Collections.sort(sortedPrices,Collections.reverseOrder()); //по убыванию
        }

        Assert.assertEquals(pricesFromSite,sortedPrices);
    }


    @Step
    public void checkGrayBtnOnListing() {
        uIutilities.waitLoadPageUsingScript();
        while (checkElementIsDisplayed(nextPage)) {
            assertFalse(checkElementIsDisplayed(outOfStock), "Items not in stock, not on listings!");
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
        mainPagaTyres = new MainPageTyres();
        uIutilities.click(prodPageLink,3,10);
        uIutilities.click(btnAddBasketProdPage,3,10);
        mainPagaTyres.closePopup(closePopupProdPage);
        uIutilities.click(basket,3,10);
        assertTrue(checkElementIsDisplayed(priceInBasket),"Item added to Basket");
    }
}
