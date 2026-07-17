package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import com.ridho.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    private final By openCart = By.className("shopping_cart_badge");
    private final By isItemDisplayed = By.id("item_4_title_link");
    private final By removeItem = By.id("remove-sauce-labs-backpack");
    private final By isContinueShopDisplayed = By.id("continue-shopping");
    private final By checkoutBtn = By.id("checkout");


    public void openCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(openCart)
        ).click();
        WaitUtil.pause(3000);
    }

    public boolean isItemDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(isItemDisplayed)
        ).isDisplayed();
    }

    public void removeItem() {
        wait.until(
                ExpectedConditions.elementToBeClickable(removeItem)
        ).click();
        WaitUtil.pause(3000);
    }

    public boolean isItemRemoved() {
        WaitUtil.pause(3000);
        return !driver.findElements(isItemDisplayed).isEmpty();
    }

    public void setIsContinueShopDisplayed() {

        wait.until(
                ExpectedConditions.elementToBeClickable(isContinueShopDisplayed)
        ).click();
        WaitUtil.pause(3000);
    }

    public void checkoutBtn() {
        wait.until(
                ExpectedConditions.elementToBeClickable(checkoutBtn)
        ).click();
        WaitUtil.pause(3000);
    }

    public boolean isCheckoutPage() {

        return driver.getCurrentUrl()
                .contains("checkout-step-one.html");

    }

}
