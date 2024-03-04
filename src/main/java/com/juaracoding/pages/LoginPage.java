package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement appLogo;
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    private WebElement userDropdown;
    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement txtInvalidCredentials;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement btnLogout;

    public void Login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

            public void inputUsername (String username){
                this.username.sendKeys(username);
            }

            public void inputPassword (String password){
                this.password.sendKeys(password);
            }

            public void clickBtnLogin () {
                btnLogin.click();
            }

            public String getTxtAppLogo () {
                return appLogo.getText();
            }

            public void logout () {
                userDropdown.click();
                btnLogout.click();
            }

            public String getTxtInvalidCredentials () {
                return txtInvalidCredentials.getText();
            }

        }

