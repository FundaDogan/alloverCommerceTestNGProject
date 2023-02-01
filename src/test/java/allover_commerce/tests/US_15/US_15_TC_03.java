package allover_commerce.tests.US_15;

import allover_commerce.pages.StoreManagerPage;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US_15_TC_03 {



    StoreManagerPage storeManagerPage=new StoreManagerPage() ;
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
        storeManagerPage.storeManagerButton.click();

        storeManagerPage.productsButton.click();

        storeManagerPage.addNewButton1.click();
        ReusableMethods.waitFor(1);


    }

    @Test
    public void test1(){

   //     vendorMyAccountPage.shippingButton.click();
        JSUtils.clickElementByJS(storeManagerPage.shippingButton);

        storeManagerPage.weight.sendKeys("3");

        storeManagerPage.length.sendKeys("50");
        storeManagerPage.width.sendKeys("40");
        storeManagerPage.height.sendKeys("30");

        Select select1=new Select(storeManagerPage.shippingClasses);
        select1.selectByIndex(0);

        Select select2=new Select(storeManagerPage.proccesingTime);
        select2.selectByIndex(5);

    }
}
