package allover_commerce.tests.US_19;

import allover_commerce.pages.*;
import allover_commerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_19_TC_04 {

    US_19_TC_02 us_19_tc_02 = new US_19_TC_02();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    VendorMyAccountPage vendorMyAccountPage = new VendorMyAccountPage();
    VendorShoppingPage vendorShoppingPage = new VendorShoppingPage();
    VendorCheckOutPage vendorCheckOutPage = new VendorCheckOutPage();

    @Test
    public void paymentOptionsTest() {

        us_19_tc_02.vendorLogin();
        us_19_tc_02.addMacBookIntoCart();

//        verify "Subtotal" text is visible

        ReusableMethods.verifyElementDisplayed(vendorCheckOutPage.subtotal);

    }
}
