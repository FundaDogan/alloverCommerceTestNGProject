package allover_commerce.tests.US_15;

import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US_15_TC_04 {


    VendorMyAccountPage vendorMyAccountPage=new VendorMyAccountPage();

    @BeforeTest
    public void test() {


        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

        Driver.getDriver().findElement(By.xpath("//i[@class='w-icon-account']")).click();

        ReusableMethods.waitFor(1);
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("fathermountain20@gmail.com");
        ReusableMethods.waitFor(1);
        Driver.getDriver().findElement(By.id("password")).sendKeys("Serinhisar20");

        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

        Driver.getDriver().findElement(By.linkText("Sign Out")).click();

        ReusableMethods.waitFor(1);
        vendorMyAccountPage.storeMenagerButton.click();

        vendorMyAccountPage.productsButton.click();


        vendorMyAccountPage.addNewButton1.click();
        ReusableMethods.waitFor(1);


    }

    @Test
    public void test1(){

   //   vendorMyAccountPage.attributesButton.click();
      JSUtils.clickElementByJS(vendorMyAccountPage.attributesButton);
        ReusableMethods.waitFor(3);
  //  vendorMyAccountPage.colorCheckbox.click();
      JSUtils.clickElementByJS(vendorMyAccountPage.colorCheckbox);

     // vendorMyAccountPage.visibleOnTheProductPageCheckbox.click();
      JSUtils.clickElementByJS(vendorMyAccountPage.visibleOnTheProductPageCheckbox);

//      vendorMyAccountPage.selectAllButton.click();
      JSUtils.clickElementByJS(vendorMyAccountPage.selectAllButton);

//    vendorMyAccountPage.selectNoneButton.click();
      JSUtils.clickElementByJS(vendorMyAccountPage.selectNoneButton);

//      vendorMyAccountPage.addNewButton2.click();
      JSUtils.clickElementByJS(vendorMyAccountPage.addNewButton2);


        System.out.println("pass");






    }








}
