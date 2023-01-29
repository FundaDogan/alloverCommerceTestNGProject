package allover_commerce.tests;

import allover_commerce.utilities.Driver;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VendorProductAddNew {

   VendorMyAccountPage vendorMyAccountPage=new VendorMyAccountPage();




    @BeforeTest
     public void testx(){

         Driver.getDriver().get("https://allovercommerce.com");

         Driver.getDriver().findElement(By.xpath("//i[@class='w-icon-account']")).click();

        ReusableMethods.waitFor(3);
         Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("fathermountain20@gmail.com");
        ReusableMethods.waitFor(3);
         Driver.getDriver().findElement(By.id("password")).sendKeys("Serinhisar20");

         Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

        Driver.getDriver().findElement(By.linkText("Sign Out")).click();





    }

    @Test
    public void test1(){
     ReusableMethods.waitFor(5);
     vendorMyAccountPage.storeMenagerButton.click();


     vendorMyAccountPage.productsButton.click();

     vendorMyAccountPage.addNewButton1.click();
        ReusableMethods.waitFor(3);
     String inventoryText = vendorMyAccountPage.inventoryButton.getText();
        System.out.println(inventoryText);
        Assert.assertEquals(inventoryText, "Inventory");


     }


}
