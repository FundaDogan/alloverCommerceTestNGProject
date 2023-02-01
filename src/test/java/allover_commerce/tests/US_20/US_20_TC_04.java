package allover_commerce.tests.US_20;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.StoreManagerPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.tests.US_19.US_19_TC_02;
import allover_commerce.utilities.JSUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20_TC_04 {

    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    US_20_TC_01 us_20_tc_01 = new US_20_TC_01();
    HomePage homePage = new HomePage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();

    @Test
    public void adCouponAmountTest() {
        us_19_tc_02.vendorLogin();
        us_20_tc_01.addCoupon();

       JSUtils.scrollIntoViewJS(storeManagerPage.couponAmount);

//        vendor enters coupon amount
        JSUtils.clickElementByJS(storeManagerPage.couponAmount);
        JSUtils.setValueByJS(storeManagerPage.couponAmount,"100");


//        verify amount is displayed in amount box

        String actualText =JSUtils.getValueInStringByJS("coupon_amount");
        Assert.assertTrue(actualText.contains("100"));



    }
}