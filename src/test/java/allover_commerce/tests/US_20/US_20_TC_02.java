package allover_commerce.tests.US_20;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.StoreManagerPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.tests.US_19.US_19_TC_02;
import allover_commerce.utilities.JSUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20_TC_02 {

    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    US_20_TC_01 us_20_tc_01 = new US_20_TC_01();
    HomePage homePage = new HomePage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();

    @Test
    public void addCouponDescriptionTest() {

        us_19_tc_02.vendorLogin();
        us_20_tc_01.addCoupon();

//        vendor add description in description box
        storeManagerPage.description.sendKeys("To be able to use the coupon, shop over $100");

//        verify description is displayed in the box
        String expectedText= "To be able to use the coupon,shop over $100";
        String actualText = JSUtils.getValueInStringByJS("description");
        Assert.assertEquals(actualText,expectedText);

    }
}
