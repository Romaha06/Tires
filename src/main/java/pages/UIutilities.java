package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class UIutilities {
    WebDriver driver;
    private WebDriverWait wait;

    public UIutilities(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    protected void click(By element, int retry, int timeoutSeconds) {

        // If the item is not found, try to find again
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = retry; i > 0; i--) {
            try {
                System.out.println("Searching element" + element.toString() + ". Retry - " + (retry - i));
                driver.findElement(element).click();
                break;
            } catch (NoSuchElementException | StaleElementReferenceException | ElementNotInteractableException ex) {
                try {
                    System.out.println("Searching element" + element.toString() + ". Retry - " + (retry - i));
                    Thread.sleep(TimeUnit.SECONDS.toMillis(timeoutSeconds));
                    driver.findElement(element).click();
                    break;
                } catch (NoSuchElementException | StaleElementReferenceException | ElementNotInteractableException | InterruptedException ex2) {
                    if (i == 0) {
                        try {
                            throw new Exception("Failed to find element " + element.toString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    continue;
                }
            }
        }
    }

    public void waitLoadPageUsingScript() {
        System.err.println("Wait load page using javascript");
        ExpectedCondition<Boolean> expectation =
                driver -> ((JavascriptExecutor) driver)
                        .executeScript("return document.readyState").toString().equals("complete");
        try {
            Thread.sleep(500);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}

