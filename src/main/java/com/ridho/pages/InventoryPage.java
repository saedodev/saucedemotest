package com.ridho.pages;

import com.ridho.driver.DriverFactory;
import com.ridho.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver = DriverFactory.getDriver();
    private WaitUtil wait = new WaitUtil(driver);

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
        return wait.waitUntilVisible(title).getText();
    }

    public void clickDetailProduct() {
        wait.waitUntilClickable(detailProduct).click();
    }

    public void isBackButtonDisplayed() {
        wait.waitUntilClickable(backButton).click();
    }

    public void clickAddToCart() {
        wait.waitUntilClickable(addToCart).click();
    }

    public void clickAddToCart2() {
        wait.waitUntilClickable(addToCart2).click();
        wait.waitUntilClickable(addToCart3).click();
    }

    public String getCartBadge() {
        return wait.waitUntilVisible(cartBadge).getText();
    }

    public void clickRemove() {
        wait.waitUntilClickable(removeButton).click();
    }

    public boolean isCartBadgeDisplayed() {
        return !wait.waitUntilInvisible(cartBadge);
    }
}
