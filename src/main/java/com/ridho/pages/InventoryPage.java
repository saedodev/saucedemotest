package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import com.ridho.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    private final By title = By.className("title");

    // Produk pertama (Sauce Labs Backpack)
    private final By detailProduct = By.id("item_4_title_link");
    private final By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    private final By addToCart2 = By.id("add-to-cart-sauce-labs-bike-light");
    private final By addToCart3 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By removeButton = By.id("remove-sauce-labs-backpack");

    private final By cartBadge = By.className("shopping_cart_badge");
    private final By backButton = By.id("back-to-products");

    public String getTitle() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(title)
        ).getText();
    }

    public void clickDetailProduct() {
        wait.until(
                ExpectedConditions.elementToBeClickable(detailProduct)
        ).click();
        WaitUtil.pause(3000);
    }

    public void isBackButtonDisplayed() {
        wait.until(
                ExpectedConditions.elementToBeClickable(backButton)
        ).click();
        WaitUtil.pause(3000);
    }

    public void clickAddToCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(addToCart)
        ).click();
        WaitUtil.pause(3000);
    }

    public String getCartBadge() {
        WaitUtil.pause(3000);
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(cartBadge)
        ).getText();
    }

    public void clickRemove() {
        wait.until(
                ExpectedConditions.elementToBeClickable(removeButton)
        ).click();
        WaitUtil.pause(3000);
    }

    public boolean isCartBadgeDisplayed() {
        WaitUtil.pause(3000);
        return !driver.findElements(cartBadge).isEmpty();
    }
}
