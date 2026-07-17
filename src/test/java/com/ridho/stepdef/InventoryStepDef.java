package com.ridho.stepdef;

import com.ridho.pages.InventoryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryStepDef {

    InventoryPage inventoryPage = new InventoryPage();

    @When("User menekan detail item yang diberikan")
    public void user_menekan_detail_item() {

        inventoryPage.clickDetailProduct();

    }

    @Then("User redirect pada page detail inventory")
    public void user_redirect_detail_inventory() {

        inventoryPage.isBackButtonDisplayed();

    }

    @Then("User melihat item keranjang ditambah")
    public void user_melihat_item_keranjang_ditambah() {

        assertEquals("1", inventoryPage.getCartBadge());

    }

    @When("User menghapus item pada button remove")
    public void user_menghapus_item() {

        inventoryPage.clickRemove();

    }

    @Then("User melihat item keranjang dihapus")
    public void user_melihat_item_keranjang_dihapus() {

        assertFalse(inventoryPage.isCartBadgeDisplayed());

    }

}