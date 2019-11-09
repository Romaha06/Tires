package pages;

import org.openqa.selenium.By;
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

    public ListingPage() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    public void checkForGrayButton() {
    }
}
