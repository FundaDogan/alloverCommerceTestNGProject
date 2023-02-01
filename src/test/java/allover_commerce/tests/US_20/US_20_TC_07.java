package allover_commerce.tests.US_20;

import allover_commerce.pages.HomePage;
import allover_commerce.pages.StoreManagerPage;
import allover_commerce.pages.VendorMyAccountPage;
import allover_commerce.tests.US_19.US_19_TC_02;
import allover_commerce.utilities.JSUtils;
import allover_commerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_20_TC_07 {

    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    US_20_TC_01 us_20_tc_01 = new US_20_TC_01();
    HomePage homePage = new HomePage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();
    Faker faker = new Faker();

    @Test
    public void generateCoupon() {
        us_19_tc_02.vendorLogin();
        us_20_tc_01.addCoupon();

//        vendor writes a code in code box
        String code = faker.code().asin();
        storeManagerPage.code.sendKeys(code);

//        vendor add description in description box
        storeManagerPage.description.sendKeys("To be able to use the coupon, shop over $100");

//        vendor selects discount type
        JSUtils.scrollIntoViewJS(storeManagerPage.discount_type);
        Select select = new Select(storeManagerPage.discount_type);
        select.selectByIndex(0);

//        vendor enters coupon amount
        JSUtils.clickElementByJS(storeManagerPage.couponAmount);
        JSUtils.setValueByJS(storeManagerPage.couponAmount,"100");

//        vendor enters expiry date
        JSUtils.clickElementByJS(storeManagerPage.expiry_date);
        JSUtils.setValueByJS(storeManagerPage.expiry_date,"2023-03-11");
        JSUtils.getValueByJS("expiry_date");

//        vendor selects allow free shipping option
        if (!storeManagerPage.free_shipping.isSelected()){
            JSUtils.clickElementByJS(storeManagerPage.free_shipping);
        }

        Assert.assertTrue(storeManagerPage.free_shipping.isSelected());

//        vendor selects show on store option
        if (!storeManagerPage.show_on_store.isSelected()){
            JSUtils.clickElementByJS(storeManagerPage.show_on_store);
        }

        Assert.assertTrue(storeManagerPage.show_on_store.isSelected());

//        verify coupon is succesfully created message.
        JSUtils.scrollIntoViewJS(storeManagerPage.couponSubmitButton);
        JSUtils.clickElementByJS(storeManagerPage.couponSubmitButton);

        ReusableMethods.waitFor(2);

        ReusableMethods.verifyElementDisplayed(storeManagerPage.editCoupon);




    }
}
