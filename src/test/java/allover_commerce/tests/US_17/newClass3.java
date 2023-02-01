package allover_commerce.tests.US_17;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.pages.StoreManagerPageUS_17;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newClass3 { StoreManagerPageUS_17 storeManagerPageUS_17=new StoreManagerPageUS_17() ;
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
    public void test3() {



        //	Click on image display
        storeManagerPageUS_17.addDisplayPhotoIcon.click();

        //  Select an image file from computer
        String userHOME=System.getProperty("user.home");
        String pathOfFile = userHOME + "/Desktop/book.jpg";
        storeManagerPageUS_17.selectFilesButton.sendKeys(pathOfFile);

        //  Click on select button to complete uploading image
        ReusableMethods.waitFor(2);
        storeManagerPageUS_17.selectToUploadButton.click();

        // Verify image is displayed on the page
        Assert.assertTrue(storeManagerPageUS_17.removeImgButton.isDisplayed());

    }
}

