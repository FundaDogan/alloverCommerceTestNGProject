package allover_commerce.tests.US_20;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.StoreManagerPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.tests.US_19.US_19_TC_02;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20_TC_01 {

    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    HomePage homePage = new HomePage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();

    public void addCoupon(){
        //        Vendor clicks "My Account" button
        JSUtils.clickElementByJS(homePage.MyAccountLink);

//        verify "Hello sasusa.odupog (not sasusa.odupog? Log out)"  message is displayed
        Assert.assertTrue(vendorMyAccountPage.greetingMessage.isDisplayed());

//        vendor clicks on store manager link
        vendorMyAccountPage.storeManager.click();

//        verify the url is https://allovercommerce.com/store-manager/
        String expectedUrl = "https://allovercommerce.com/store-manager/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedUrl);

//        vendor clicks coupon link
        JSUtils.clickElementByJS(storeManagerPage.coupons);

//        verify  Coupons Listing text is displayed
        Assert.assertTrue(storeManagerPage.couponsListing.isDisplayed());

//        vendor clicks add new button
        storeManagerPage.addNewCouponButton.click();
//        verify Add Coupon text is visible
        Assert.assertTrue(storeManagerPage.addCouponText.isDisplayed());

    }

    @Test
    public void addCouponCodeTest() {

        us_19_tc_02.vendorLogin();
        addCoupon();


//        vendor writes a code in code box
            storeManagerPage.code.sendKeys("xyz03");

//        verify code is displayed in the box
        String expectedText= "xyz03";
        String actualText = JSUtils.getValueInStringByJS("title");
        Assert.assertEquals(actualText,expectedText);

    }
}
