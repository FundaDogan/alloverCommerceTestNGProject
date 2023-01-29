package allover_commerce.tests.US_17;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_17_TC_01 {
    @Test
        public void test(){

        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
    //    User should navigate to url https://allovercommerce.com/
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
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.signOutButton.isDisplayed());


/*

 */


    }


}
