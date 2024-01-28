package org.swaglabs.stepsdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.swaglabs.factory.DriverFactory;
import org.swaglabs.pages.LoginPage;
import org.swaglabs.pages.ProductListingPage;
import org.testng.Assert;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

public class ProductListingStepsDef {


    //DriverFactory df = new DriverFactory();
    // WebDriver driver = df.initializeDriver();

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


    private ProductListingPage prodListing;

    @Given("User has already logged into the system")
    public void user_has_already_logged_into_the_system(DataTable credTable) {

        List<Map<String, String>> credList = credTable.asMaps();
        String username = credList.get(0).get("username");
        String password = credList.get(0).get("password");

        DriverFactory.getDriver().get("https://www.saucedemo.com/inventory.html");

        prodListing = loginPage.Login(username, password);

    }


    @Given("User is on product listing page")
    public void user_is_on_product_listing_page() {

        String title = prodListing.getProductListingTitle();
        Assert.assertEquals(title, "Swag Labs");
        System.out.println("Product Listing Page Title is:" + title);
    }

    @When("clicks on product and product details page will display")
    public void clicks_on_product_and_product_details() {
        prodListing.clickonProduct();
    }

    @Then("On clicking on Add to cart button, product should be added in cart")

    public void on_clicking_on_add_to_cart_button_product_added_cart() {

        prodListing.clickonAddtoCart();
        prodListing.clickonCartIcon();
        Assert.assertEquals(prodListing.proDisplayedonCheckoutPage(),true);


    }

//    @Given("User is on the cart page")
//        public void user_is_on_cart_page()
//        {
//            Assert.assertEquals(prodListing.cartPageHeadingIsDisplayed(), true);
//
//        }
//
//        @When("User clicks on button Checkout")
//                public void user_clicks_on_button_checkout()
//        {
//            prodListing.clickonCheckoutBtn();
//        }
//
//        @Then("checkout page should display")
//    public void checkout_page_should_display()
//        {
//            Assert.assertEquals(prodListing.IscheckoutPageheadingDisplayed(),true);
//        }



}
