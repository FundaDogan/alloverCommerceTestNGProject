package allover_commerce.tests.US_19;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.pages.VendorShoppingPage;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import allover_commerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_19_TC_02 {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    VendorShoppingPage vendorShoppingPage = new VendorShoppingPage();

    public void vendorLogin(){
        //        Vendor goes to "https://allovercommerce.com/ url"
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        ReusableMethods.waitFor(3);

//        Vendor clicks on "Sign in" button
        homePage.singInButton.click();
        ReusableMethods.waitFor(3);
//        Vendor enters valid email address
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_email4"));
//        Vendor enters valid password
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_password4"));
//        Vendor clicks "sing in" button
        loginPage.signInButton.click();
//        Verify "sign out" button is visible
        Assert.assertTrue(homePage.signOutButton.isDisplayed());

    }

    public void addMacBookIntoCart(){

        //        Vendor clicks "My Account" button
        JSUtils.clickElementByJS(homePage.MyAccountLink);

//        Vendor clicks Orders button
        vendorMyAccountPage.orders.click();

//        Vendor clicks "BROWSER PRODUCTS" button
        vendorMyAccountPage.browseProducts.click();
        ReusableMethods.waitFor(4);

//        Verify the url is "https://allovercommerce.com/shop/"
        String expectedUrlShop = "https://allovercommerce.com/shop/";
        String actualUrlShop = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrlShop,expectedUrlShop);

//        Vendor clicks "16 ” MacBook Pro" product
        JSUtils.clickElementByJS(vendorShoppingPage.macbookLink);
        ReusableMethods.waitFor(4);

//        Verify the url is "https://allovercommerce.com/urun/16-macbook-pro/#
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("16-macbook-pro"));

//        Vendor clicks on "ADD TO CART"  button
        JSUtils.clickElementByJS(vendorShoppingPage.macBookAddToCart);
        ReusableMethods.waitFor(3);

//        click on shopping cart image
        vendorShoppingPage.cart.click();
        ReusableMethods.waitFor(2);

//        click on checkout button
        vendorShoppingPage.checkoutButton.click();
        ReusableMethods.waitFor(3);
    }

    @Test
    public void itemsVisibleInCartTest() {
        vendorLogin();
        addMacBookIntoCart();

        //        verify "Macbook Pro product" is visible  in shopping cart

         ReusableMethods.verifyElementDisplayed(vendorShoppingPage.macbook16InCart);

    }
}
