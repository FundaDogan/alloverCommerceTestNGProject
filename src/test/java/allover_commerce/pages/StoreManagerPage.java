package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StoreManagerPage {

    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}