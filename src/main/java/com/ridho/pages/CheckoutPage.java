package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(5));

    private final By firstName =
            By.id("first-name");

    private final By lastName =
            By.id("last-name");

    private final By postalCode =
            By.id("postal-code");

    private final By continueButton =
            By.id("continue");

    private final By finishButton =
            By.id("finish");

    private final By error =
            By.cssSelector("h3[data-test='error']");

    private final By complete =
            By.className("complete-header");

    public void inputFirstName(String value) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(firstName)
        ).sendKeys(value);

    }

    public void inputLastName(String value) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(lastName)
        ).sendKeys(value);

    }

    public void inputPostalCode(String value) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(postalCode)
        ).sendKeys(value);

    }

    public void clickContinue() {

        wait.until(
                ExpectedConditions.elementToBeClickable(continueButton)
        ).click();

    }

    public String getErrorMessage() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(error)
        ).getText();

    }

    public void clickFinish() {

        wait.until(
                ExpectedConditions.elementToBeClickable(finishButton)
        ).click();

    }

    public boolean isCheckoutComplete() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(complete)
        ).isDisplayed();

    }

}