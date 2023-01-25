package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
