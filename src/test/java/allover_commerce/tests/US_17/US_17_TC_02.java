package allover_commerce.tests.US_17;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.pages.StoreManagerPageUS_17;
import allover_commerce.pages.VendorMyAccountPageUS_17;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static allover_commerce.utilities.ReusableMethods.waitFor;

public class US_17_TC_02 {
/*
    Vendor should navigate to store manager url
    click on "All product type"
    select the "Variable Product'
    US14 and US15 should be done
    Verify that the selected color and size attributes are displayed on the product detail page
    Click on "Attributes"
    click on "Color" checkbox on opened menu
    verify that color should be selectable
    click on "Size" checkbox on menu
    verify that size should be selectable
*/
    StoreManagerPageUS_17 storeManagerPageUS_17=new StoreManagerPageUS_17() ;
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    VendorMyAccountPageUS_17 vendorMyAccountPageUS_17  = new VendorMyAccountPageUS_17();


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

        storeManagerPageUS_17.productsButton.click();
        storeManagerPageUS_17.addNewButton1.click();


        Select select1 = new Select(storeManagerPageUS_17.allProductTypes);
        select1.selectByIndex(4);


        ReusableMethods.waitFor(5);
        // Click on image display
      vendorMyAccountPageUS_17.addDisplayPhotoIcon.click();

        //  Select an image file from computer
        String userHOME=System.getProperty("user.home");
        String pathOfFile = userHOME + "/Users/hyry/Desktop/book.jpg";
       // VendorMyAccountPageUS_17.selectFileBtn.sendKeys(pathOfFile);

        //  Click on select button to complete uploading image
        vendorMyAccountPageUS_17.selectToUploadButton.sendKeys();


        //Select select2 = new Select(storeManager27.typeOfProduct);
        //select2.selectByIndex(1);
        //JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(3);
        //vendorMyAccountPage27.pictureUpload.click();
       // ReusableMethods.waitFor(3);

        //vendorMyAccountPage27.selectFilesBtn.sendKeys("/Users/hyry/Desktop/book.jpg");

       // vendorMyAccountPage27.selectFilesBtn.click();


//        ReusableMethods.waitFor(3);
//        JSUtils.clickElementByJS(storeManager27.attributesButton);
//        ReusableMethods.waitFor(3);



    }}




