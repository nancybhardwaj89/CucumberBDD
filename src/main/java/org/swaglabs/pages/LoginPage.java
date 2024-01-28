package org.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    private By usernamelocator = By.name("user-name");

    private By passwrdinputlocator = By.name("password");

    private By loginbuttonlocator = By.xpath("//input[@id='login-button']");

    private By landingpageheadinglocator = By.xpath("//div[@class='app_logo']");

    private  By errormsglocator = By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement usernameinput = driver.findElement(usernamelocator);
        usernameinput.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordinput = driver.findElement(passwrdinputlocator);
        passwordinput.sendKeys(password);
    }

    public void clickonLogin() {
        WebElement loginbutton = driver.findElement(loginbuttonlocator);
        loginbutton.click();
    }

    public boolean landingPageHeadingIsDisplayed() {
        return driver.findElement(landingpageheadinglocator).isDisplayed();
    }

    public ProductListingPage Login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickonLogin();
        return new ProductListingPage(driver);
    }

    public boolean errorMsgisDisplayed()
    {
        return driver.findElement(errormsglocator).isDisplayed();
    }

}


