package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import com.ridho.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver = DriverFactory.getDriver();
    private WaitUtil wait = new WaitUtil(driver);
    private final By openCart = By.className("shopping_cart_badge");
    private final By isItemDisplayed = By.id("item_4_title_link");
    private final By removeItem = By.id("remove-sauce-labs-backpack");
    private final By isContinueShopDisplayed = By.id("continue-shopping");
    private final By checkoutBtn = By.id("checkout");


    public void openCart() {
        wait.waitUntilClickable(openCart).click();
    }

    public boolean isItemDisplayed() {
        return wait.waitUntilVisible(isItemDisplayed).isDisplayed();
    }

    public void removeItem() {
        wait.waitUntilClickable(removeItem).click();
    }

    public boolean isItemRemoved() {
        return !wait.waitUntilInvisible(isItemDisplayed);
    }

    public void setIsContinueShopDisplayed() {
        wait.waitUntilVisible(isContinueShopDisplayed).click();
    }

    public void checkoutBtn() {
        wait.waitUntilVisible(checkoutBtn).click();
    }

    public boolean isCheckoutPage() {

        return driver.getCurrentUrl()
                .contains("checkout-step-one.html");

    }

}
