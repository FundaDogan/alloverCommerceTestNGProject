package allover_commerce.tests.US_10;

import allover_commerce.pages.HomePageUS_09;
import allover_commerce.pages.VendorRegistrationPageUS_09;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_10_TC_05 {

    /*
    US_10 : Password level chart should be visible (For Vendor Registration)
    too short
    weak
    good
    strong
     */

    VendorRegistrationPageUS_09 vendorRegistrationPageUS_09 = new VendorRegistrationPageUS_09();
    HomePageUS_09 homePageUS_09 = new HomePageUS_09();
    Actions actions = new Actions(Driver.getDriver());



    @Test
    public void test_US_10_TC_05(){

        // STEP: weak

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));


        //Click on "Sign In" button
        JSUtils.clickElementByJS(homePageUS_09.singInButton);


        //Click on "Sign up"
        JSUtils.clickElementByJS(homePageUS_09.singUpButton);

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        JSUtils.clickElementByJS(homePageUS_09.becomeAVendorButton);

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        JSUtils.clickElementByJS(vendorRegistrationPageUS_09.reSendCodeButton);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter a password with more than 5 characters, which contains numbers and   lowercase or uppercase alphabetical characters in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Verify "Weak"  text is not visible
        Assert.assertFalse(vendorRegistrationPageUS_09.passwordStrength.getText().contains("Weak"));

        Driver.getDriver().close();
    }




}
