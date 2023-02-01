package allover_commerce.tests.US_18;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.pages.StoreManagerPageUS_17;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static allover_commerce.utilities.ReusableMethods.waitFor;

public class US_15 {
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
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_email2"));
        //    Enter password
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("app_vendor_valid_password2"));
        //    Click on sign in button
        loginPage.signInButton.click();
        //    Verify sign out is displayed on the website
        waitFor(2);
        homePage.signOutButton.click();
        storeManagerPageUS_17.storeManager.click();
    }

    @Test

    public void test1() {



        storeManagerPageUS_17.storeManager.click();

        storeManagerPageUS_17.productsButton.click();

        storeManagerPageUS_17.addNewButton1.click();

              Assert.assertTrue(storeManagerPageUS_17.attributesButton.isDisplayed());
             Assert.assertTrue(storeManagerPageUS_17.attributesButton.isDisplayed());

    }}
