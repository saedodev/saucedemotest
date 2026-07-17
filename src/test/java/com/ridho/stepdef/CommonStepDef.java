package com.ridho.stepdef;

import com.ridho.pages.CartPage;
import com.ridho.pages.InventoryPage;
import com.ridho.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonStepDef {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    CartPage cartPage = new CartPage();

    @Given("User login sebagai {string} dengan password {string}")
    public void user_login_sebagai(String username, String password) {

        loginPage.login(username, password);

        assertEquals("Products", inventoryPage.getTitle());

    }

    @When("User menambahkan item pada button add to cart")
    public void user_menambahkan_item_pada_button_add_to_cart() {

        inventoryPage.clickAddToCart();

    }

    @When("User membuka halaman Cart")
    public void user_membuka_halaman_cart() {

        cartPage.openCart();

    }
}