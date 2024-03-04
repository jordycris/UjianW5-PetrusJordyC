package com.juaracoding;


import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private WebDriver driver;

    private LoginPage loginPage = new LoginPage();

    public LoginTest() {
        driver = Hooks.driver;
        //extend report
    }

    // scenario 1
    @Given("User mengakses halaman login")
    public void user_mengakses_halaman_login() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User memasukan username yang valid")
    public void user_memasukan_username_yang_valid() {
        loginPage.inputUsername("standard_user");

    }

    @And("User memasukan password yang valid")
    public void user_memasukan_password_yang_valid() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("User klik tombol login")
    public void user_klik_tombol_login() {
        loginPage.clickBtnLogin();
    }

    @Given("User berada di halaman login")
    public void user_berada_di_halaman_login() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User memasukan username yang salah")
    public void user_memasukan_username_yang_salah() {
        loginPage.inputUsername("standar_user");
    }

    @And("User memasukan password yang salah")
    public void user_memasukan_password_yang_salah() {
        loginPage.inputPassword("secret_saus");
    }

    @Then("User berhasil login dan diarahkan ke halaman utama atau dashboard setelah login")
    public void user_berhasil_login_dan_diarahkan_ke_halaman_utama_atau_dashboard_setelah_login() {
        Assert.assertEquals(loginPage.getTxtAppLogo(), "Swag Labs");

    }
}
