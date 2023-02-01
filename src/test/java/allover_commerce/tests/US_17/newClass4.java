package allover_commerce.tests.US_17;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.LoginPage;
import allover_commerce.pages.StoreManagerPageUS_17;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import allover_commerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newClass4 {
        StoreManagerPageUS_17 storeManagerPageUS_17 = new StoreManagerPageUS_17();
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
        public void test4() {


            //	Click on image display
            storeManagerPageUS_17.addDisplayPhotoIcon.click();

            //  Select an image file from computer
            String userHOME = System.getProperty("user.home");
            String pathOfFile = userHOME + "/Desktop/book.jpg";
            storeManagerPageUS_17.selectFilesButton.sendKeys(pathOfFile);

            //  Click on select button to complete uploading image
            ReusableMethods.waitFor(2);
            storeManagerPageUS_17.selectToUploadButton.click();


            //  Enter a product title
            storeManagerPageUS_17.productTitleInput.sendKeys("Kids Book");

            //  Enter a short description
            Driver.getDriver().switchTo().frame(0);
            JSUtils.scrollIntoViewJS(storeManagerPageUS_17.shortDescriptionInput);
            storeManagerPageUS_17.shortDescriptionInput.sendKeys("Kids Book");

            //  Verify data has been entered
            Assert.assertTrue(storeManagerPageUS_17.verifyTextOfDescription.getText().equals("Kids Book"));

            //  Enter a description
            Driver.getDriver().switchTo().defaultContent();
            Driver.getDriver().switchTo().frame("description_ifr");
            JSUtils.scrollIntoViewJS(storeManagerPageUS_17.descriptionInput);
            storeManagerPageUS_17.descriptionInput.sendKeys("Great book for kids");

            //Driver.getDriver().switchTo().defaultContent();

            //storeManagerPageUS_17.categoryCheckbox.click();

            //  Verify entered data is visible on the page
               //vendorMyAccountPageUS_17.attributesButton.click();
            //JSUtils.clickElementByJS(vendorMyAccountPageUS_17.attributesButton);
            //ReusableMethods.waitFor(3);

            //  vendorMyAccountPageUS_17.colorCheckbox.click();
           // JSUtils.clickElementByJS(vendorMyAccountPageUS_17.colorCheckbox);

           // ReusableMethods.waitFor(3);

            //JSUtils.clickElementByJS(vendorMyAccountPageUS_17.sizeCheckbox);
            //vendorMyAccountPageUS_17.addNewButton2.click();


        }

    }
