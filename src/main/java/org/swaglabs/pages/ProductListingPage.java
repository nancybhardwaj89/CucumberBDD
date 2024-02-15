package org.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListingPage {

    WebDriver driver;
    private By aadtoCartBtnLoc = By.id("add-to-cart-sauce-labs-backpack");
    private By carticonlocator = By.xpath("//a[@class='shopping_cart_link']");

    private By productnamelocator = By.xpath("//*[@id=\"item_4_img_link\"]/img");
    private By checkoutPageHeadingloc = By.xpath("//span[@class='title']");
    private By productdetailspageloc = By.id("add-to-cart-sauce-labs-backpack");
    private By prodloconCheckoutpage = By.xpath("//div[text()='Sauce Labs Backpack']");
    private By checkoutBtnLoc = By.xpath("//button[@class='btn btn_action btn_medium checkout_button ' and @id='checkout']");
    private By cartPagedisplayloc = By.xpath("//span[@class='title']");

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickonProduct() {
        WebElement productName = driver.findElement(productnamelocator);
        productName.click();
    }

    public boolean checkProdDetailsPageisDisaplyed() {
        return driver.findElement(productdetailspageloc).isDisplayed();
    }

    public String getProductListingTitle() {
        return driver.getTitle();
    }


    public void clickonAddtoCart() {
        WebElement addtocartBtn = driver.findElement(aadtoCartBtnLoc);
        addtocartBtn.click();
    }

    public void clickonCartIcon() {
        WebElement cartIcon = driver.findElement(carticonlocator);
        cartIcon.click();
    }

    public boolean correctprodcutIsDisplayed() {
        WebElement productname = driver.findElement(productnamelocator);
        return productname.isDisplayed();

    }

    public boolean IscheckoutPageheadingDisplayed() {
        return driver.findElement(checkoutPageHeadingloc).isDisplayed();
    }

    public boolean proDisplayedonCheckoutPage() {
        return driver.findElement(prodloconCheckoutpage).isDisplayed();
    }

    public boolean cartPageHeadingIsDisplayed() {
        return driver.findElement(cartPagedisplayloc).isDisplayed();
    }

    public void clickonCheckoutBtn() {
        WebElement checkoutBtn = driver.findElement(checkoutBtnLoc);
        checkoutBtn.click();
    }
}
