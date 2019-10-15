import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPagaTires {

    WebDriver driver;

    private By buttonCookies = By.xpath("//div[@class='block-cookies__button']");
    private By buttonPKW = By.xpath("//img[@alt='PKW']");
    private By buttonOffroad_SUV = By.xpath("//img[@alt='Offroad/SUV']");
    private By buttonLLKW_Transporterreifen = By.xpath("//img[@alt='Transporter']");
    private By buttonMotorradreifen = By.xpath("//img[@alt='Motorrad']");

    public MainPagaTires(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        System.out.println("Page was opened.");
        driver.get("https://reifen.pkwteile.de/");

    }

    public void cookiesButton() {

        System.out.println("Click Cookies button.");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='block-cookies__button']")));
            element.click();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    public void clickMenuButtonPKW() {
        System.out.println("Choosed type 'PKW'");
        driver.findElement(buttonPKW).click();
    }

    public void clickMenuButtonOffroadSuv() {
        System.out.println("Choosed type 'buttonOffroad_SUV'");
        driver.findElement(buttonOffroad_SUV).click();
    }

    public void clickMenubuttonLLKW() {
        System.out.println("Choosed type 'buttonOffroad_SUV'");
        driver.findElement(buttonLLKW_Transporterreifen).click();
    }

    public void clickMenubuttonbuttonMotorradreifen() {
        System.out.println("Choosed type 'buttonOffroad_SUV'");
        driver.findElement(buttonMotorradreifen).click();
    }
}
