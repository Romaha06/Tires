package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class SearchFormCar {

    WebDriver driver;
    UIutilities uIutilities;


    private By selectWidth = By.xpath("//select[@name='Width']");
    private By selectHeight = By.xpath("//select[@name='CrossSections']");
    private By selectSize = By.xpath("//select[@name='Size']");


    public SearchFormCar() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    @Step
    public void width() {
        System.out.println("Choose from Widht.");
        uIutilities.click(selectWidth, 3, 10);
        uIutilities.click(By.xpath("//option[@value='205']"), 3, 10);
    }

    @Step
    public void height() {
        System.out.println("Choose from Height.");
        uIutilities.click(selectHeight, 3, 10);
        uIutilities.click(By.xpath("//option[@value='55']"), 3, 10);
    }

    @Step
    public void size() {
        System.out.println("Choose from Size.");
        uIutilities.click(selectSize, 3, 10);
        uIutilities.click(By.xpath("//option[@value='16']"), 3, 10);
    }

    public void selectionOfParameters() {
        width();
        height();
        size();
    }

}