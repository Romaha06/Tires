package pagesPKW;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class ListingPage {

    WebDriver driver;
    UIutilities uIutilities;

    private By nextPage = By.xpath("//a[@rel='next']");
    private By summerTyres = By.xpath("//a[@data-ga-action='summer']");
    private By allSeasonTyres = By.xpath("//a[@data-ga-action='all_seasons']");
    private By winterTyres = By.xpath("//a[@data-ga-action='winter']");
    private By outOfStock = By.xpath("//div[@class='vers_box grey']");
    private By addToBasket = By.xpath("//div[@class='basket_btn button active_red_button ']");
    private By search = By.xpath("//form[@name='search_form']");
    private By searchButton = By.xpath("//a[@class='search_submit header__search-button form-submitter']");


    public ListingPage() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    public boolean checkForGrayButton() {
        System.out.println("Check for gray button");
        try {
            driver.findElement(By.xpath(String.valueOf(outOfStock)));
        }catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

}
