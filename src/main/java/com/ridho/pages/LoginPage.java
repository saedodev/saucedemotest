package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import com.ridho.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver = DriverFactory.getDriver();

    private final By txtUsername = By.id("user-name");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.id("login-button");
    private final By lblError = By.cssSelector("h3[data-test='error']");

    public void openWebsite() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtUsername))
                .clear();

        driver.findElement(txtUsername).sendKeys(username);

        WaitUtil.pause(3000);

    }

    public void inputPassword(String password) {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword))
                .clear();

        driver.findElement(txtPassword).sendKeys(password);

        WaitUtil.pause(3000);
    }

    public void clickLogin() {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogin));

        driver.findElement(btnLogin).click();

        WaitUtil.pause(3000);
    }

    public String getErrorMessage() {
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(5));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        lblError
                )
        ).getText();
    }

    public void login(String username, String password){

        openWebsite();
        inputUsername(username);
        inputPassword(password);
        clickLogin();

        WaitUtil.pause(1000);
    }
}
