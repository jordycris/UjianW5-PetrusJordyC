package com.juaracoding;

import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.CheckoutPage;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckout {

    private static WebDriver driver;

    private static LoginPage loginPage = new LoginPage();

    private static CartPage addToCartPage = new CartPage();

    private static CheckoutPage checkoutPage = new CheckoutPage();

    public TestCheckout() {
        driver = Hooks.driver;
    }

    @When("User melakukan checkout")
    public void user_melakukan_checkout() {
        checkoutPage.clickBtnCheckout();
    }

    @And("User menambahkan firstname yang valid")
    public void user_menambahkan_firstname_yang_valid() {
        checkoutPage.inputFirstName("Jordy");
    }

    @And("User menambahkan lastname yang valid")
    public void user_menambahkan_lastname_yang_valid() {
        checkoutPage.inputLastName("Jacob");
    }

    @And("User menambahkan zip postal code yang valid")
    public void user_menambahkan_zip_postal_code_yang_valid() {
        checkoutPage.inputPostalCode("18181");
    }

    @And("User klik tombol continue")
    public void user_klik_tombol_continue() {
        checkoutPage.clickBtnContinue();
    }

    @And("User klik tombol finish")
    public void user_klik_tombol_finish() {
        checkoutPage.clickBtnFinish();
    }

    @Then("User berhasil melakukan checkout")
    public void user_berhasil_melakukan_checkout() {
        Assert.assertEquals(checkoutPage.getTxtThankYouForYourOrder(),"Thank you for your order!");
    }

}
