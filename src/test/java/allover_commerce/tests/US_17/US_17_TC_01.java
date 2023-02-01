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
    select the "Variable Product"
    US14 and US15 should be done
    Verify that the selected color and size attributes are displayed on the product detail page
    Click on "Attributes"
     */
    StoreManagerPageUS_17 storeManagerPageUS_17=new StoreManagerPageUS_17() ;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeTest
        public void test() {

        //    Vendor should navigate to url https://allovercommerce.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        //    Click on sign in button
        homePage.singInButton.click();
        //    Enter username
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("app_user_username"));
        //    Enter password
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("app_user_valid_password"));
        //    Click on sign in button
        loginPage.signInButton.click();
        //    Verify sign out is displayed on the website
        ReusableMethods.waitFor(3);
        homePage.signOutButton.click();

        storeManagerPageUS_17.storeManager.click();

        storeManagerPageUS_17.productsButton.click();

        storeManagerPageUS_17.addNewButton1.click();
        ReusableMethods.waitFor(3);
    }
        @Test
        public void test1() {
         // storeManagerPageUS_17.productsButton.click();
            ReusableMethods.waitFor(5);

            Select select1 = new Select(storeManagerPageUS_17.productTypeDropdown);
            select1.selectByIndex(4);

           //JSUtils.clickElementByJS(storeManagerPageUS_17.addNewButton1);

            ReusableMethods.waitFor(5);

            //   vendorMyAccountPageUS_17.attributesButton.click();
            JSUtils.clickElementByJS(storeManagerPageUS_17.attributesButton);
            ReusableMethods.waitFor(3);

            //  vendorMyAccountPageUS_17.colorCheckbox.click();
            JSUtils.clickElementByJS(storeManagerPageUS_17.colorCheckbox);

            ReusableMethods.waitFor(3);
            //storeManagerPageUS_17.addNewButton2.click();


            ReusableMethods.waitFor(3);

            JSUtils.clickElementByJS(storeManagerPageUS_17.sizeCheckbox);



            //Driver.getDriver().switchTo().alert().dismiss();

            //Select select2 = new Select(storeManagerPageUS_17.allProductTypes);
            //select2.selectByIndex(1);

            // vendorMyAccountPage.visibleOnTheProductPageCheckbox.click();

            //vendorMyAccountPageUS_17.addNewButton2.click();

            //vendorMyAccountPageUS_17.textNewColor.click();

            //vendorMyAccountPageUS_17.textNewColor.sendKeys("hyry");

        }}

