package allover_commerce.tests.US_09;

import allover_commerce.pages.FakeMailPageUS_09;
import allover_commerce.pages.HomePageUS_09;
import allover_commerce.pages.VendorRegistrationPageUS_09;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_09_TC_01 {

    VendorRegistrationPageUS_09 vendorRegistrationPageUS_09 = new VendorRegistrationPageUS_09();
    HomePageUS_09 homePageUS_09 = new HomePageUS_09();
    Actions actions = new Actions(Driver.getDriver());


    // I dont use it
    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

    }

    @Test
    public void test_US_09_TC_01(){

        // STEP: It should be possible to log in using the "Become a Vendor" link on the Sign Up screen.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Verify "Become a Vendor" text is displayed on the website
        Assert.assertTrue(homePageUS_09.becomeAVendorButton.isDisplayed());

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Verify user is on Vendor Registration Page
        homePageUS_09.VendorRegistrationText.isDisplayed();


        Driver.getDriver().close();

    }


    @Test
    public void test_US_09_TC_02(){

        // STEP: User should enter email address.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Verify user is on Vendor Registration Page
        homePageUS_09.VendorRegistrationText.isDisplayed();

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        // Verify "Verification code sent to your email:" text is visible
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(10);
        Assert.assertTrue(vendorRegistrationPageUS_09.verificationCodeText.isDisplayed());

        Driver.getDriver().close();
    }



    @Test
    public void test_US_09_TC_03(){

        // STEP: User should enter email address.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Verify user is on Vendor Registration Page
        homePageUS_09.VendorRegistrationText.isDisplayed();

        //Enter a invalid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_invalid_email"));

        // Verify "Please provide a valid email address." text is visible
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(10);
        Assert.assertTrue(vendorRegistrationPageUS_09.provideValidEmailText.isDisplayed());

        Driver.getDriver().close();
    }



    @Test
    public void test_US_09_TC_04(){

        // STEP: User should enter email address.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Verify user is on Vendor Registration Page
        homePageUS_09.VendorRegistrationText.isDisplayed();

        //Click on password without writing email address.
        actions.click(vendorRegistrationPageUS_09.registrationEmail).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(10);
        
        // Verify "Email: This field is required." text is visible

        Assert.assertTrue(vendorRegistrationPageUS_09.emailIsRequiredText.isDisplayed());

        Driver.getDriver().close();
    }



    @Test
    public void test_US_09_TC_05(){

        // STEP: Verification code sent to your email: abc@abc.com." should be visible.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));


        //Verify "Verification code sent to your email:" text is visible
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(10);
        Assert.assertTrue(vendorRegistrationPageUS_09.verificationCodeText.isDisplayed());

        Driver.getDriver().close();
    }


    @Test
    public void test_US_09_TC_06(){

        // STEP: Verification code sent to your email: abc@abc.com." should be visible.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a invalid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_invalid_email"));


        //Verify "Verification code sent to your email:" text is not visible
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(10);
        Assert.assertFalse(vendorRegistrationPageUS_09.provideValidEmailText.getText().contains("Verification code sent to your email:"));

        Driver.getDriver().close();
    }



    @Test
    public void test_US_09_TC_07(){

        // STEP: The code received via email should be entered in the verification code text box.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPageUS_09 fakemailPage = new FakeMailPageUS_09();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPageUS_09.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(verificationCode);

        //Verify Re-Send Code is entered in the verification code text box
        Assert.assertFalse(Driver.getDriver().getPageSource().contains(verificationCode));

        Driver.getDriver().close();
    }


    @Test
    public void test_US_09_TC_08(){

        // STEP: The code received via email should be entered in the verification code text box.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();

        //Enter invalid Re-Send Code in "Verification Code" box.
        String resendCode = ConfigReader.getProperty("re_send_invalid_code");
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(resendCode);
        vendorRegistrationPageUS_09.registerButton.click();

        //Verify when user does not enter Re-Send Code "Email Verification Code: This field is required." text is  visible
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Email Verification Code: This field is required."));

        Driver.getDriver().close();

    }


    @Test
    public void test_US_09_TC_09(){

        // STEP: Password should be entered and it should contain uppercase, lowercase, digit and special char.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();

        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("strong_password"));

        //Verify "Good" or "Strong"  text is visible
        String passwordRules =  vendorRegistrationPageUS_09.passwordStrength.getText();
        Assert.assertTrue(passwordRules.contains("Good") || passwordRules.contains("Strong"));

        Driver.getDriver().close();
    }


    @Test
    public void test_US_09_TC_10(){

        // STEP: Password should be entered and it should contain uppercase, lowercase, digit and special char.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter invalid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("weak_password"));

        //Verify "Weak" or "Too short" text is visible
        String passwordRules =  vendorRegistrationPageUS_09.passwordStrength.getText();
        Assert.assertTrue(passwordRules.contains("Weak") || passwordRules.contains("Too short"));

        Driver.getDriver().close();
    }


    @Test
    public void test_US_09_TC_11(){

        // STEP: User should enter password again.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the password again in the  "Confirm Password" text box
        vendorRegistrationPageUS_09.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));
        vendorRegistrationPageUS_09.registerButton.click();

        //Verify "Confirm Password: This field is required." text is not visible
        Assert.assertFalse(vendorRegistrationPageUS_09.errorMessage.getText().contains("Confirm Password: This field is required."));

    }


    @Test
    public void test_US_09_TC_12(){

        // STEP: User should enter password again.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPageUS_09 fakemailPage = new FakeMailPageUS_09();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPageUS_09.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(verificationCode);

        //Enter valid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter different password  in "Confirm Password" text box
        vendorRegistrationPageUS_09.confirmPassword.sendKeys(ConfigReader.getProperty("weak_password"));
        vendorRegistrationPageUS_09.registerButton.click();

        //Verify "Password and Confirm-password are not same." text is visible
        Assert.assertTrue(vendorRegistrationPageUS_09.errorMessage.isDisplayed());


    }



    @Test
    public void test_US_09_TC_13(){

        // STEP: User should enter password again.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPageUS_09 fakemailPage = new FakeMailPageUS_09();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPageUS_09.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(verificationCode);

        //Enter invalid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("weak_password"));

        //Enter the same invalid password  in "Confirm Password" text box
        vendorRegistrationPageUS_09.confirmPassword.sendKeys(ConfigReader.getProperty("weak_password"));
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPageUS_09.registerButton);

        //Verify "Password strength should be atleast "Good"." text is visible
        Assert.assertTrue(vendorRegistrationPageUS_09.passwordRules.isDisplayed());

        Driver.getDriver().close();

    }


    @Test
    public void test_US_09_TC_14(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPageUS_09 fakemailPage = new FakeMailPageUS_09();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPageUS_09.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(verificationCode);

        //Enter valid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPageUS_09.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPageUS_09.registerButton);

        //Verify "Welcome to Allover Commerce!" text is visible
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals("https://allovercommerce.com/vendor-register/"));



    }



    @Test
    public void test_US_09_TC_15(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPageUS_09 fakemailPage = new FakeMailPageUS_09();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPageUS_09.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);


        //Enter invalid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_invalid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPageUS_09.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPageUS_09.registerButton);

        //Verify "Email verification code invalid." text is visible

        Assert.assertTrue(vendorRegistrationPageUS_09.errorMessage.isDisplayed());

    }


    @Test
    public void test_US_09_TC_16(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid email address
        vendorRegistrationPageUS_09.registrationEmail.sendKeys(ConfigReader.getProperty("registration_valid_email"));

        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();
        ReusableMethods.waitFor(5);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(ConfigReader.getProperty("re_send_valid_code"));

        //Enter valid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("strong_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPageUS_09.confirmPassword.sendKeys(ConfigReader.getProperty("strong_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPageUS_09.registerButton);


        //Verify "This Email already exists. Please login to the site and apply as vendor." text is visible
        Assert.assertTrue(vendorRegistrationPageUS_09.errorMessage.getText().equals("This Email already exists. Please login to the site and apply as vendor."));


    }


    @Test
    public void test_US_09_TC_17(){

        // STEP: Registration as a Vendor should be completed by clicking on the Register button.

        //User should navigate to Allover Commerce url
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
        String alloverCommerceWebSite = Driver.getDriver().getWindowHandle();

        //Click on "Sign In" button
        homePageUS_09.singInButton.click();


        //Click on "Sign up"
        homePageUS_09.singUpButton.click();

        //Click on "Become a Vendor" to navigate Vendor Registration Page
        homePageUS_09.becomeAVendorButton.click();

        //Enter a valid not regestered email adress
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakemail_url"));
        String fakeEmailWebSite = Driver.getDriver().getWindowHandle();


        FakeMailPageUS_09 fakemailPage = new FakeMailPageUS_09();
        String email = fakemailPage.email.getText();
        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        vendorRegistrationPageUS_09.registrationEmail.sendKeys(email);


        //Click on Re-Send Code
        vendorRegistrationPageUS_09.reSendCodeButton.click();
        ReusableMethods.waitFor(5);
        Driver.getDriver().switchTo().window(fakeEmailWebSite);

        ReusableMethods.waitFor(5);

        String verificationCodeText = fakemailPage.verificationCodeText.getText();      //[Allover Commerce] Email Verification Code - 435657
        System.out.println(verificationCodeText);

        String verificationCode = verificationCodeText.substring(45);           //435657
        System.out.println(verificationCode);

        Driver.getDriver().switchTo().window(alloverCommerceWebSite);

        //Enter valid Re-Send Code in "Verification Code" box.
        vendorRegistrationPageUS_09.reSendCodeInput.sendKeys(verificationCode);

        //Enter valid password in "Password" text box
        vendorRegistrationPageUS_09.password.sendKeys(ConfigReader.getProperty("good_password"));

        //Enter the same valid password  in "Confirm Password" text box
        vendorRegistrationPageUS_09.confirmPassword.sendKeys(ConfigReader.getProperty("good_password"));

        //Click "Registrer" button
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(vendorRegistrationPageUS_09.registerButton);

        //Verify "This Email already exists. Please login to the site and apply as vendor." text is not visible
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("This Email already exists. Please login to the site and apply as vendor."));

    }
}


