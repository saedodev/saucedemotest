package com.ridho.stepdef;

import com.ridho.pages.InventoryPage;
import com.ridho.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Given("User berada pada halaman login")
    public void user_berada_pada_halaman_login() {

        loginPage.openWebsite();

    }

    @When("User memasukkan username {string}")
    public void user_memasukkan_username(String username) {

        loginPage.inputUsername(username);

    }

    @And("User memasukkan password {string}")
    public void user_memasukkan_password(String password) {

        loginPage.inputPassword(password);

    }

    @And("User menekan tombol Login")
    public void user_menekan_tombol_login() {

        loginPage.clickLogin();

    }

    @Then("User berhasil masuk ke Dashboard")
    public void user_berhasil_masuk_ke_dashboard() {

        assertEquals("Products", inventoryPage.getTitle());

    }

    @Then("Muncul pesan error")
    public void muncul_pesan_error() {

        assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));

    }

}