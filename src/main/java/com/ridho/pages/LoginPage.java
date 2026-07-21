package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import com.ridho.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver = DriverFactory.getDriver();
    private WaitUtil wait = new WaitUtil(driver);

    private final By txtUsername = By.id("user-name");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.id("login-button");
    private final By lblError = By.cssSelector("h3[data-test='error']");

    public void openWebsite() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        wait.waitUntilVisible(txtUsername).clear();
        wait.waitUntilVisible(txtUsername).sendKeys(username);

    }

    public void inputPassword(String password) {
        wait.waitUntilVisible(txtPassword).clear();
        wait.waitUntilVisible(txtPassword).sendKeys(password);
    }

    public void clickLogin() {
        wait.waitUntilClickable(btnLogin).click();
    }

    public String getErrorMessage() {
        return wait.waitUntilVisible(lblError).getText();
    }

    public void login(String username, String password){

        openWebsite();
        inputUsername(username);
        inputPassword(password);
        clickLogin();
    }
}
