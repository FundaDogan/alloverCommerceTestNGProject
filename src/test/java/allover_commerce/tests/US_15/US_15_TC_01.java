package allover_commerce.tests.US_15;


import allover_commerce.pages.StoreManagerPage;
import allover_commerce.utilities.ConfigReader;
import allover_commerce.utilities.Driver;
import allover_commerce.utilities.JSUtils;
import allover_commerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US_15_TC_01  {






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


    }

    @Test
    public void test1(){
        StoreManagerPage storeManagerPage=new StoreManagerPage() ;
        ReusableMethods.waitFor(5);

        ReusableMethods.waitFor(5);
        //Driver.getDriver().findElement(By.linkText("Store Manager")).click();


      JSUtils.clickElementByJS(storeManagerPage.storeManagerButton);
        ReusableMethods.waitFor(5);
        storeManagerPage.productsButton.click();

        storeManagerPage.addNewButton1.click();
        ReusableMethods.waitFor(3);


//        int flag=0;
//        for(WebElement w:storeManagerPage.menuList){
//
//
//           if(w.getText().contains("Inventory") || w.getText().contains("Shipping") || w.getText().contains("Attributes") || w.getText().contains("Linked")
//                   || w.getText().contains("SEO")
//                   || w.getText().contains("Toptan Ürün Gösterme Ayarları")
//                   || w.getText().contains("Advanced")) {
//
//               flag++;
//             System.out.println(w.getText());
//             Assert.assertTrue(w.isDisplayed());
//           }

          }


//        System.out.println(flag);
//        Assert.assertEquals(7,flag);



        }






