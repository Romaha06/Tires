package pagesPKW;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class SearchFormMoto {

    WebDriver driver;
    UIutilities uIutilities;


    private By selectWidthMoto = By.xpath("//select[@name='Width']");
    private By selectHeightMoto = By.xpath("//select[@name='CrossSections']");
    private By selectTypMoto = By.xpath("//select[@id='form_R_ZR']");
    private By selectSizeMoto = By.xpath("//select[@name='Size']");

    public SearchFormMoto() {
        this.driver = WebDriverFactory.getDriver();
        uIutilities = new UIutilities(driver);
    }

    @Step
    public void widthMoto() {
        System.out.println("Choose from Widht Moto.");
        uIutilities.click(selectWidthMoto, 3, 10);
        uIutilities.click(By.xpath("//option[@value='140']"), 3, 10);
    }

    @Step
    public void heightMoto() {
        System.out.println("Choose from Height Moto.");
        uIutilities.click(selectHeightMoto, 3, 10);
        uIutilities.click(By.xpath("//option[@value='80']"), 3, 10);
    }

    @Step
    public void typMoto() {
        System.out.println("Choose from Typ Moto.");
        uIutilities.click(selectTypMoto, 3, 10);
        uIutilities.click(By.xpath("//option[@value='-']"), 3, 10);
    }

    @Step
    public void sizeMoto() {
        System.out.println("Choose from Size Moto.");
        uIutilities.click(selectSizeMoto, 3, 10);
        uIutilities.click(By.xpath("//option[@value='17']"), 3, 10);
    }

    public void selectionOfParametersMoto() {
        widthMoto();
        heightMoto();
        typMoto();
        sizeMoto();
    }
}
