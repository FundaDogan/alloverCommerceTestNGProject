package allover_commerce.tests.US_06;

import allover_commerce.pages.HomePage06;
import allover_commerce.pages.LoginPage06;
import allover_commerce.pages.ShoppingCart06;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class US_06_TC_01 {
    /*
 Given  User should land on https://allovercommerce.com/ url
 And Click on 'Sign In' icon
 And Enter a valid user name
 And Enter a valid password
 And Click on 'SIGN IN' button
 And Go to  the  search box
 And Enter  the name of desired product
 And Click the "submit" button
 And Click product link
 Then Verify to find the desired product when clicked in the search box.
     */
 HomePage06 homePage06 = new HomePage06();
 LoginPage06 loginPage06 = new LoginPage06();
 ShoppingCart06 shoppingCart06 = new ShoppingCart06();
    @Test
    public void TC_01(){
       //Go to "https://allovercommerce.com/"
        Driver.getDriver().get(ConfigReader.getProperty("app_homepage_url"));
        homePage06.singInButton.click();
        loginPage06.usernameInput.sendKeys(ConfigReader.getProperty("app_valid_username"));
        loginPage06.passwordInput.sendKeys(ConfigReader.getProperty("app_valid_password"));
        loginPage06.signInButton.click();
        homePage06.signOutButton.click();
        //Enter  the name of desired product
        shoppingCart06.searchBox.click();
        shoppingCart06.searchBox.sendKeys("shoes");
        shoppingCart06.submitButton.click();

        ReusableMethods.waitFor(2);
        shoppingCart06.clickedProductLink.click();

        //Verify to find the desired product when clicked in the search box.
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(shoppingCart06.selectedDesiredProduct);


    }
    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();
    }



}


