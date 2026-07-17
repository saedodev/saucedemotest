package com.ridho.stepdef;

import com.ridho.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutStepDef {

    CheckoutPage checkoutPage = new CheckoutPage();

    @When("User memasukkan First Name {string}")
    public void input_first_name(String firstname) {

        checkoutPage.inputFirstName(firstname);

    }

    @And("User memasukkan Last Name {string}")
    public void input_last_name(String lastname) {

        checkoutPage.inputLastName(lastname);

    }

    @And("User memasukkan Zip atau Postal Code {string}")
    public void input_postal_code(String zip) {

        checkoutPage.inputPostalCode(zip);

    }

    @And("User menekan tombol Continue Checkout")
    public void continue_checkout() {

        checkoutPage.clickContinue();

    }

    @Then("Muncul pesan error blank")
    public void error_blank() {

        assertTrue(checkoutPage.getErrorMessage().contains("Error"));

    }

    @And("User melakukan checkout overview")
    public void checkout_overview() {

        checkoutPage.clickFinish();

    }

    @Then("Checkout berhasil!")
    public void checkout_success() {

        assertTrue(checkoutPage.isCheckoutComplete());

    }
}