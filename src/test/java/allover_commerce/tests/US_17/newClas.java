package allover_commerce.tests.US_17;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.pages.StoreManagerPageUS_17;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class newClas {
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
    public void test1() {
        //  Verify Simple Product, Variable Product, Grouped Product, External - Affiliate Product options are available
        Select select = new Select(storeManagerPageUS_17.productTypeDropdown);
        List<WebElement> allOptions = select.getOptions();
        List<String> optionsNames =new ArrayList<>(Arrays.asList("Simple Product", "Variable Product", "Grouped Product", "External/Affiliate Product"));
        boolean isAllOptionsExist=false;
        int idx = 0;
        for (WebElement eachOption : allOptions){
            if (eachOption.getText().equals(optionsNames.get(idx))){
                isAllOptionsExist=true;
                idx++;
            }
        }
        Assert.assertTrue(isAllOptionsExist);

    }}






