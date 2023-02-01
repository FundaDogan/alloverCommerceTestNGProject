package allover_commerce.tests.US_17;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.pages.StoreManagerPageUS_17;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
Vendor should navigate to store manager url
click on "All product type"
select the "Variable Product'
US14 and US15 should be done
Verify that the selected color and size attributes are displayed on the product detail page
Click on "Attributes"

 */

public class newClass2 {
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
        ReusableMethods.waitFor(3);
        homePage.signOutButton.click();

        storeManagerPageUS_17.storeManager.click();

        storeManagerPageUS_17.productsButton.click();

        storeManagerPageUS_17.addNewButton1.click();
        ReusableMethods.waitFor(3);
    }
    @Test
    public void test2() {
        //  Click on a space field to collapse dropdown menu
        storeManagerPageUS_17.spaceDropdown.click();

        //  Verify dropdown menu has collapsed
        ReusableMethods.waitFor(2);
        Select select = new Select(storeManagerPageUS_17.productTypeDropdown);
       // Assert.assertTrue(select.getThirdSelectedOption().getText().equals("Variable Product"));


    }

}

