import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchFormCar {

    WebDriver driver;

    private By selectSeasonsWinter = By.xpath("//div[@class='season-tyre__label--winter']");
    private By selectSeasonsSummer = By.xpath("//div[@class='season-tyre__label--summer']");
    private By selectSeasonsAll = By.xpath("//div[@class='season-tyre__label--all-weather']");
    private By selectWidth = By.xpath("//select[@name='Width']");
    private By selectHeight = By.xpath("//select[@name='CrossSections']");
    private By selectSize = By.xpath("//select[@name='Size']");
    private By buttonTyresSearch = By.id("tyres_search");

    public SearchFormCar(WebDriver driver) {
        this.driver = driver;
    }

    public void formSeasonWinter() {
        System.out.println("Choose from Seasons: Winter");
        driver.findElement(selectSeasonsWinter).click();
    }

    public void formSeasonSummer() {
        System.out.println("Choose from Seasons: Summer");
        driver.findElement(selectSeasonsSummer).click();
    }

    public void formSeasonAll() {
        System.out.println("Choose from Seasons: Seasons-All");
        driver.findElement(selectSeasonsAll).click();
    }

    public void width() {
        System.out.println("Choose from Widht.");
        driver.findElement(selectWidth).click();
        driver.findElement(By.xpath("//option[@value='255']")).click();
    }

    public void height() {
        System.out.println("Choose from Height.");
        driver.findElement(selectHeight).click();
        driver.findElement(By.xpath("//option[@value='65']")).click();
    }

    public void size() {
        System.out.println("Choose from Size.");
        driver.findElement(selectSize).click();
        driver.findElement(By.xpath("//option[@value='16']")).click();
    }

    public void search() {
        System.out.println("Click button Search.");
        driver.findElement(buttonTyresSearch).click();
    }

    public void checkPageURL(String expectedURL) {
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }
}