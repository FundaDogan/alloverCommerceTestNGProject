package allover_commerce.tests.US_15;

import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static allover_commerce.utilities.JSUtils.clickElementByJS;

public class US_15_TC_02 {

    VendorMyAccountPage vendorMyAccountPage=new VendorMyAccountPage();

    @BeforeTest
    public void test() {

        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        Driver.getDriver().findElement(By.xpath("//i[@class='w-icon-account']")).click();

        ReusableMethods.waitFor(3);
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("fathermountain20@gmail.com");
        ReusableMethods.waitFor(3);
        Driver.getDriver().findElement(By.id("password")).sendKeys("Serinhisar20");

        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

        Driver.getDriver().findElement(By.linkText("Sign Out")).click();

        ReusableMethods.waitFor(5);
        vendorMyAccountPage.storeMenagerButton.click();

        vendorMyAccountPage.productsButton.click();

        vendorMyAccountPage.addNewButton1.click();
        ReusableMethods.waitFor(3);


    }

      @Test
      public void test1(){

     // vendorMyAccountPage.inventoryButton.click();
          ReusableMethods.waitFor(3);
         vendorMyAccountPage.skuUnit.sendKeys("item");
          ReusableMethods.waitFor(3);

         clickElementByJS(vendorMyAccountPage.manageStockCheckbox);

    // vendorMyAccountPage.manageStockCheckbox.click();
          ReusableMethods.waitFor(3);
          vendorMyAccountPage.stockQuantity.sendKeys("46");
          ReusableMethods.waitFor(3);


          Select select=new Select(vendorMyAccountPage.allowBackordersDropDownMenu);
          select.selectByIndex(2);

         // vendorMyAccountPage.soldIndividuallyChekbox.click();
          clickElementByJS(vendorMyAccountPage.soldIndividuallyChekbox);





      }














}
