package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerPageUS_17 {
    public StoreManagerPageUS_17() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Store Manager")
    public WebElement storeManager;
    @FindBy(linkText = "Products")
    public WebElement productsButton;

    @FindBy(linkText = "Add New")
    public WebElement addNewButton1;

    @FindBy(id = "dropdown_product_type")
    public WebElement allProductTypes;



    @FindBy(id = "attributes_is_visible_1")
    public WebElement visibleOnTheProductPageCheckbox;
    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[3]")
    public WebElement selectAllButton;
    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[2]")
    public WebElement selectNoneButton;
    @FindBy(linkText = "Add New")
    public WebElement addNewButton2;


}
//*[@id="wcfm_products_manage_form_attribute_head"]
