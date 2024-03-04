package com.juaracoding;

import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddCartTest {
    private static WebDriver driver;

    private static LoginPage loginPage = new LoginPage();

    private static CartPage cartPage = new CartPage();

    public AddCartTest() {
        driver = Hooks.driver;
        // exte report
    }
    public void user_login() {
        loginPage.Login("standard_user", "secret_sauce");
    }

    @When("User menambahkan produk ke keranjang")
    public void user_menambahkan_produk_ke_keranjang() {
        cartPage.clickButtonAddToCart();
    }

    @And("User melihat melihat produk dalam keranjang")
    public void user_melihat_melihat_produk_dalam_keranjang() {
        cartPage.clickLinkShoppingCart();
    }

    @Then("User berhasil menambahkan produk ke dalam keranjang dan diarahkan ke checkout")
    public void user_berhasil_menambahkan_produk_ke_dalam_keranjang_dan_diarahkan_ke_checkout() {
        Assert.assertEquals(cartPage.getTxtYourCart(),"Your Cart");
    }
}
