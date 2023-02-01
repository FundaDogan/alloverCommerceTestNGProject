package allover_commerce.tests.US_20;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.StoreManagerPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.tests.US_19.US_19_TC_02;
import allover_commerce.utilities.JSUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20_TC_06 {

    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    US_20_TC_01 us_20_tc_01 = new US_20_TC_01();
    HomePage homePage = new HomePage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();

    @Test
    public void clickCouponDataTest() {

        us_19_tc_02.vendorLogin();
        us_20_tc_01.addCoupon();

        //        verify allow free shipping is clickable
        JSUtils.scrollIntoViewJS(storeManagerPage.free_shipping);

        if (!storeManagerPage.free_shipping.isSelected()){
            JSUtils.clickElementByJS(storeManagerPage.free_shipping);
        }

        Assert.assertTrue(storeManagerPage.free_shipping.isSelected());

        //        verify show on store is clickable
        JSUtils.scrollIntoViewJS(storeManagerPage.show_on_store);

        if (!storeManagerPage.show_on_store.isSelected()){
            JSUtils.clickElementByJS(storeManagerPage.show_on_store);
        }

        Assert.assertTrue(storeManagerPage.show_on_store.isSelected());

    }
}
