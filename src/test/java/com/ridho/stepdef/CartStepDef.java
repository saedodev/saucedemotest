package com.ridho.stepdef;

import com.ridho.pages.CartPage;
import com.ridho.pages.InventoryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class CartStepDef {

    CartPage cartPage = new CartPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Then("User melihat item yang telah ditambahkan pada Cart")
    public void user_melihat_item_yang_telah_ditambahkan_pada_cart() {

        assertTrue(cartPage.isItemDisplayed());

    }

    @When("User menekan tombol Remove pada Cart")
    public void user_menekan_tombol_remove_pada_cart() {

        cartPage.removeItem();

    }

    @Then("Item berhasil dihapus dari Cart")
    public void item_berhasil_dihapus_dari_cart() {

        assertFalse(cartPage.isItemRemoved());

    }

    @When("User menekan tombol Continue Shopping")
    public void userMenekanTombolContinueShopping() {
        cartPage.setIsContinueShopDisplayed();
    }

    @Then("User kembali ke halaman Inventory")
    public void userKembaliKeHalamanInventory() {
        assertEquals("Products", inventoryPage.getTitle());
    }

    @When("User menekan tombol Checkout")
    public void user_checkout() {

        cartPage.checkoutBtn();

    }

    @Then("User diarahkan ke halaman Checkout")
    public void user_redirect_checkout() {

        assertTrue(cartPage.isCheckoutPage());

    }


}