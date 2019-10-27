package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.WebDriverFactory;

public class SearchFormCar {

    WebDriver driver = null;
    UIutilities uIutilities;

    private By selectSeasonsWinter = By.xpath("//div[@class='season-tyre__label--winter']");
    private By selectSeasonsSummer = By.xpath("//div[@class='season-tyre__label--summer']");
    private By selectSeasonsAll = By.xpath("//div[@class='season-tyre__label--all-weather']");
    private By selectWidth = By.xpath("//select[@name='Width']");
    private By selectHeight = By.xpath("//select[@name='CrossSections']");
    private By selectSize = By.xpath("//select[@name='Size']");
    private By buttonTyresSearch = By.id("tyres_search");

    public SearchFormCar() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    @Step
    public void formSeasonWinter() {
        System.out.println("Choose from Seasons: Winter");
        uIutilities.click(selectSeasonsWinter, 3,10);
    }

    @Step
    public void formSeasonSummer() {
        System.out.println("Choose from Seasons: Summer");
        uIutilities.click(selectSeasonsSummer, 3,10);
    }

    @Step
    public void formSeasonAll() {
        System.out.println("Choose from Seasons: Seasons-All");
        driver.findElement(selectSeasonsAll).click();
    }

    @Step
    public void width() {
        System.out.println("Choose from Widht.");
        uIutilities.click(selectWidth,3,10);
        uIutilities.click(By.xpath("//option[@value='255']"),3,10);
    }

    @Step
    public void height() {
        System.out.println("Choose from Height.");
        uIutilities.click(selectHeight,3,10);
        uIutilities.click(By.xpath("//option[@value='65']"),3,10);
    }

    @Step
    public void size() {
        System.out.println("Choose from Size.");
        uIutilities.click(selectSize,3,10);
        uIutilities.click(By.xpath("//option[@value='17']"),3,10);
    }

    public void selectionOfParameters(){
        width();
        height();
        size();
    }

    @Step
    public void search() {
        System.out.println("Click button Search.");
        uIutilities.click(buttonTyresSearch,3,10);
    }

    @Step
    public void checkPageURL(String expectedURL) {
        uIutilities.waitLoadPageUsingScript();
        Assert.assertEquals(WebDriverFactory.getDriver().getCurrentUrl(),expectedURL);
    }

}