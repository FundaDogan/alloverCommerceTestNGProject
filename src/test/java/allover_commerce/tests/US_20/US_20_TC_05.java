package allover_commerce.tests.US_20;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.StoreManagerPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.tests.US_19.US_19_TC_02;
import allover_commerce.utilities.JSUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20_TC_05 {

    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    US_20_TC_01 us_20_tc_01 = new US_20_TC_01();
    HomePage homePage = new HomePage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();

    @Test
    public void setCouponExpiryDateTest() {
        us_19_tc_02.vendorLogin();
        us_20_tc_01.addCoupon();

        JSUtils.scrollIntoViewJS(storeManagerPage.expiry_date);

//        vendor enters expiry date

        JSUtils.clickElementByJS(storeManagerPage.expiry_date);
        JSUtils.setValueByJS(storeManagerPage.expiry_date,"2023-03-11");
        JSUtils.getValueByJS("expiry_date");

//        verify expiry date is displayed
        String actualText =JSUtils.getValueInStringByJS("expiry_date");
        Assert.assertTrue(actualText.contains("2023-03-11"));

    }
}
