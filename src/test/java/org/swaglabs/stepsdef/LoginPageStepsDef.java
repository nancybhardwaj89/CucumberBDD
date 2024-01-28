package org.swaglabs.stepsdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.swaglabs.factory.DriverFactory;
import org.swaglabs.pages.LoginPage;
import org.testng.Assert;


public class LoginPageStepsDef {


    private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());


    @Given("I am on Login page of SwagLabs Website")
    public void i_am_on_the_login_page_of_swag_labs_Website() {

        DriverFactory.getDriver().get("https://www.saucedemo.com/");

    }

    @Given("I have entered a valid  username and password")
    public void i_have_entered_a_valid_username_password() {
        loginpage.enterUsername("standard_user");
        loginpage.enterPassword("secret_sauce");

    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String username, String password) {
        loginpage.enterUsername(username);
        loginpage.enterPassword(password);
    }


    @When("I click on login button")
    public void i_click_on_login_button() {
        loginpage.clickonLogin();
    }

    @Then("I will be able to logged in sucessfully")
    public void i_will_be_able_to_logged_in_successfully() {
        Assert.assertEquals(loginpage.landingPageHeadingIsDisplayed(), true);

    }

    @Then("I should see a error message indicating {string}")
    public void i_should_see_a_error_message_indicating(String errorMessage) {

        Assert.assertEquals(loginpage.errorMsgisDisplayed(), true);
    }


}
