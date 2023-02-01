package allover_commerce.tests.US_06;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.HomePage06;
import allover_commerce.pages.LoginPage06;
import allover_commerce.pages.ShoppingCart06;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class US_06_TC_04 {

    HomePage06 homePage06 =new HomePage06();
    LoginPage06 loginPage06 =new LoginPage06();
    ShoppingCart06 shoppingCart06 = new ShoppingCart06();
    @Test
    public void TC_04() {
        Driver.getDriver().get(ConfigReader.getProperty("app_homepage_url"));
        homePage06.singInButton.click();
        loginPage06.usernameInput.sendKeys(ConfigReader.getProperty("app_valid_username"));
        loginPage06.passwordInput.sendKeys(ConfigReader.getProperty("app_valid_password"));
        loginPage06.signInButton.click();
        homePage06.signOutButton.click();

        ShoppingCart06 shoppingCart06 = new ShoppingCart06();
        shoppingCart06.searchBox.click();
        shoppingCart06.searchBox.sendKeys("shoes", Keys.ENTER);
        shoppingCart06.submitButton.click();
        shoppingCart06.clickedProductLink.click();
        shoppingCart06.addToCart.click();
        shoppingCart06.cartIcon.click();
        ReusableMethods.waitFor(2);
        shoppingCart06.viewCartIcon.click();
        ReusableMethods.waitFor(2);
        shoppingCart06.minusRadioButton.click();
        ReusableMethods.waitFor(2);
        shoppingCart06.plusRadioButton.click();
        ReusableMethods.waitFor(2);
        shoppingCart06.updateToCartButton.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(shoppingCart06.updateToCartButton.isEnabled());



    }
   @AfterMethod
   public void tearDown () {
       Driver.closeDriver();
}
}