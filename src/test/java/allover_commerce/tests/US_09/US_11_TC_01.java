package allover_commerce.tests.US_09;

import allover_commerce.pages.HomePageUS_09;
import allover_commerce.pages.VendorMyAccountPageUS_09;
import allover_commerce.pages.VendorRegistrationPageUS_09;
        import allover_commerce.utilities.ConfigReader;
        import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class US_11_TC_01 {

    VendorRegistrationPageUS_09 vendorRegistrationPage = new VendorRegistrationPageUS_09();
    HomePageUS_09 homePage = new HomePageUS_09();
    VendorMyAccountPageUS_09 vendorMyAccountPage = new VendorMyAccountPageUS_09();
    Actions actions = new Actions(Driver.getDriver());


    @Test
    public void test_US_10_TC_01() throws IOException {

    // STEP: Email and password should be entered as 'Vendor' and My Account should be visible.

    //User should navigate to Allover Commerce url
    Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

    //Click on "Sign In" button
    homePage.singInButton.click();

    //Click on username text box and enter an exist username
    vendorRegistrationPage.existVendorUsername.sendKeys(ConfigReader.getProperty("exist_vendor_email"));

    //Click on password text box and enter a valid password
    vendorRegistrationPage.existVendorPassword.sendKeys(ConfigReader.getProperty("exist_vendor_password"));

    //Click on "Sign In" Button
    vendorRegistrationPage.existVendorSignInButton.click();

    //Click on "Sign Out" Button
    homePage.signOut.click();

    //Verify "My Account" text is visible
    Assert.assertTrue(vendorMyAccountPage.myAccountText.isDisplayed());
    ReusableMethods.getScreenshot("MyAccountIsVisible");



    }


    @Test
    public void test_US_10_TC_02() {

        // STEP: Email and password should be entered as 'Vendor' and My Account should be visible.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePage.singInButton.click();

        //Click on username text box and enter an exist username
        vendorRegistrationPage.existVendorUsername.sendKeys(ConfigReader.getProperty("exist_vendor_email"));

        //Click on password text box and enter a invalid password
        vendorRegistrationPage.existVendorPassword.sendKeys(ConfigReader.getProperty("invalid_password"));

        //Click on "Sign In" Button
        vendorRegistrationPage.existVendorSignInButton.click();

        //Verify "Wrong username or password." text is visible
        Assert.assertTrue(homePage.wrongUsernameOrPassword.isDisplayed());

        Driver.getDriver().close();

    }

    @Test
    public void test_US_10_TC_03() {

        // STEP: Email and password should be entered as 'Vendor' and My Account should be visible.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePage.singInButton.click();

        //Click on username text box and enter an invalid username
        vendorRegistrationPage.existVendorUsername.sendKeys(ConfigReader.getProperty("registration_invalid_email"));

        //Click on password text box and enter a password
        vendorRegistrationPage.existVendorPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click on "Sign In" Button
        vendorRegistrationPage.existVendorSignInButton.click();

        //Verify "Wrong username or password." text is visible
        Assert.assertTrue(homePage.wrongUsernameOrPassword.isDisplayed());
    }



    @Test
    public void test_US_10_TC_04() {

        // STEP: Orders, Downloads, Addresses, Account Details, Wishlist ve Logout should be visible.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePage.singInButton.click();

        //Click on username text box and enter an exist username
        vendorRegistrationPage.existVendorUsername.sendKeys(ConfigReader.getProperty("exist_vendor_email"));

        //Click on password text box and enter a valid password
        vendorRegistrationPage.existVendorPassword.sendKeys(ConfigReader.getProperty("exist_vendor_password"));

        //Click on "Sign In" Button
        vendorRegistrationPage.existVendorSignInButton.click();

        //Click on "Sign Out" Button
        homePage.signOut.click();

        //Verify "Orders" icon is visible
        Assert.assertTrue(vendorMyAccountPage.ordersIcon.isEnabled());

        //Verify "Downloads" icon is visible
        Assert.assertTrue(vendorMyAccountPage.downloadsIcon.isEnabled());

        //Verify "Addresses" icon is visible
        Assert.assertTrue(vendorMyAccountPage.addressesIcon.isEnabled());

        //Verify "Account Details" icon is visible
        Assert.assertTrue(vendorMyAccountPage.accountDetailsIcon.isEnabled());

        //Verify "Wishlist" icon is visible
        Assert.assertTrue(vendorMyAccountPage.wishListIcon.isEnabled());

        //Verify "Logout" icon is visible
        Assert.assertTrue(vendorMyAccountPage.logoutIcon.isEnabled());

    }


    @Test
    public void test_US_10_TC_05() {

        // STEP: Store manager, orders, downloads, addresses , account details, wishlist, Support tickets, followings ve logout should be visible in Dashboard.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePage.singInButton.click();

        //Click on username text box and enter an exist username
        vendorRegistrationPage.existVendorUsername.sendKeys(ConfigReader.getProperty("exist_vendor_email"));

        //Click on password text box and enter a valid password
        vendorRegistrationPage.existVendorPassword.sendKeys(ConfigReader.getProperty("exist_vendor_password"));

        //Click on "Sign In" Button
        vendorRegistrationPage.existVendorSignInButton.click();

        //Click on "Sign Out" Button
        homePage.signOut.click();

        //Verify "Store Manager" icon is visible
        Assert.assertTrue(vendorMyAccountPage.storeManagerIcon.isEnabled());

        //Verify "Orders" icon is visible
        Assert.assertTrue(vendorMyAccountPage.ordersLeft.isEnabled());

        //Verify "Downloads" icon is visible
        Assert.assertTrue(vendorMyAccountPage.downloadsLeft.isEnabled());

        //Verify "Addresses" icon is visible
        Assert.assertTrue(vendorMyAccountPage.addressesLeft.isEnabled());

        //Verify "Account Details" icon is visible
        Assert.assertTrue(vendorMyAccountPage.accountDetailsLeft.isEnabled());

        //Verify "Wishlist" icon is visible
        Assert.assertTrue(vendorMyAccountPage.wishlistLeft.isEnabled());

        //Verify "Support Tickets" icon is visible
        Assert.assertTrue(vendorMyAccountPage.supportTickets.isEnabled());

        //Verify "Followings" icon is visible
        Assert.assertTrue(vendorMyAccountPage.followings.isEnabled());

        //Verify "Logout" icon is visible
        Assert.assertTrue(vendorMyAccountPage.logoutLeft.isEnabled());

    }



    @Test
    public void saida() {

        // STEP: Email and password should be entered as 'Vendor' and My Account should be visible.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePage.singInButton.click();

        //Click on username text box and enter an exist username
        vendorRegistrationPage.existVendorUsername.sendKeys(ConfigReader.getProperty("exist_vendor_email"));

        //Click on password text box and enter a valid password
        vendorRegistrationPage.existVendorPassword.sendKeys(ConfigReader.getProperty("exist_vendor_password"));

        //Click on "Sign In" Button
        vendorRegistrationPage.existVendorSignInButton.click();

        //Click on "Sign Out" Button
        homePage.signOut.click();


        vendorMyAccountPage.addressesIcon.click();
        vendorMyAccountPage.shipping.click();

    }

}