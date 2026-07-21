package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import com.ridho.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver = DriverFactory.getDriver();
    private WaitUtil wait = new WaitUtil(driver);

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
        wait.waitUntilVisible(firstName).sendKeys(value);
    }

    public void inputLastName(String value) {
        wait.waitUntilVisible(lastName).sendKeys(value);
    }

    public void inputPostalCode(String value) {
        wait.waitUntilVisible(postalCode).sendKeys(value);
    }

    public void clickContinue() {
        wait.waitUntilVisible(continueButton).click();
    }

    public String getErrorMessage() {
        return wait.waitUntilVisible(error).getText();
    }

    public void clickFinish() {
        wait.waitUntilVisible(finishButton).click();
    }

    public boolean isCheckoutComplete() {
        return wait.waitUntilVisible(complete).isDisplayed();
    }

}