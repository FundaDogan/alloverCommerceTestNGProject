package allover_commerce.tests.US_17;

import allover_commerce.pages.*;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;

import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static allover_commerce.utilities.ReusableMethods.waitFor;

public class US_17_TC_01 {
    /*
    Vendor should navigate to store manager url
    click on "All product type"
    select the "Variable Product'
    US14 and US15 should be done
    Verify that the selected color and size attributes are displayed on the product detail page
    Click on "Attributes"
     */
    StoreManager27 storeManager27=new StoreManager27() ;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @BeforeTest
        public void test() {

        //    Vendor should navigate to url https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        //    Click on sign in button
        homePage.singInButton.click();
        //    Enter username
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_email2"));
        //    Enter password
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_password2"));
        //    Click on sign in button
        loginPage.signInButton.click();
        //    Verify sign out is displayed on the website
        waitFor(2);
        homePage.signOutButton.click();
        storeManager27.storeManager.click();
    }
        @Test
        public void test1() {

            storeManager27.productsButton.click();

            Select select1 = new Select(storeManager27.allProductTypes);
            select1.selectByIndex(4);

            storeManager27.addNewButton1.click();

            ReusableMethods.waitFor(5);

            Select select2 = new Select(VendorMyAccountPage27.typeOfProduct);
            select2.selectByIndex(1);

            //JSUtils.scrollDownByJS();

            ReusableMethods.waitFor(5);

            //StoreManager27.attributesButton.click();

            JSUtils.clickElementByJS(storeManager27.attributesButton);

          //storeManager27.attributesButton.click();

        }}

