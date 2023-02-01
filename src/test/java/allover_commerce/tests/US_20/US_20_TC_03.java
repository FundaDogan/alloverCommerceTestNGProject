package allover_commerce.tests.US_20;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.StoreManagerPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.tests.US_19.US_19_TC_02;
import allover_commerce.utilities.JSUtils;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20_TC_03 {
    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    US_20_TC_01 us_20_tc_01 = new US_20_TC_01();
    HomePage homePage = new HomePage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();

    @Test
    public void selectCouponDiscountTypeTest() {
        us_19_tc_02.vendorLogin();
        us_20_tc_01.addCoupon();

        JSUtils.scrollIntoViewJS(storeManagerPage.discount_type);

//        vendor selects "percentage discount" type
        Select select = new Select(storeManagerPage.discount_type);
        select.selectByIndex(0);

//        verify discount types are selectable
        String actualSelectedOption = select.getFirstSelectedOption().getText();
        String expectedSelectedOption = "Percentage discount";
        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);

//      vendor selects "fixed product discount" type
        select.selectByIndex(1);

//      verify second option is selected
        String actualSelectedOption2 = select.getFirstSelectedOption().getText();
        String expectedSelectedOption2 = "Fixed Product Discount";
        Assert.assertEquals(actualSelectedOption2,expectedSelectedOption2);
    }
}
