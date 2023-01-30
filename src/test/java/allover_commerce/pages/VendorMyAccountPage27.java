package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorMyAccountPage27 {
    public VendorMyAccountPage27() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "product_type")
    public WebElement typeOfProduct;
    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
    public WebElement colorCheckbox;

    @FindBy(id = "attributes_is_visible_1")
    public WebElement visibleOnTheProductPageCheckbox;

    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[3]")
    public WebElement selectAllButton;

    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[2]")
    public WebElement selectNoneButton;

    @FindBy(linkText = "Add New")
    public WebElement addNewButton2;

}
