package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class StoreManagerPage {

    public StoreManagerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


































    @FindBy(linkText = "Store Manager")
    public WebElement storeManagerButton;
    @FindBy(linkText = "Products")
    public WebElement productsButton;
    @FindBy(linkText = "Add New")
    public WebElement addNewButton1;
    @FindBy(className = "page_collapsible_content_holder")
    public WebElement inventoryButton;
    @FindBy(xpath = "//div[@class='page_collapsible_content_holder']")
    public List<WebElement> menuList;
    @FindBy(id = "sku")
    public WebElement skuUnit;
    @FindBy(id = "manage_stock")
    public WebElement manageStockCheckbox;
    @FindBy(xpath = "//*[@id='stock_qty']")
    public WebElement stockQuantity;
    @FindBy(id = "sold_individually")
    public WebElement soldIndividuallyChekbox;
    @FindBy(id = "backorders")
    public WebElement allowBackordersDropDownMenu;
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_shipping_head']")
    public WebElement shippingButton;
    @FindBy(id = "weight")
    public WebElement weight;
    @FindBy(id = "length")
    public WebElement length;
    @FindBy(id = "width")
    public WebElement width;
    @FindBy(id = "height")
    public WebElement height;
    @FindBy(id = "shipping_class")
    public WebElement shippingClasses;
    @FindBy(id = "_wcfmmp_processing_time")
    public WebElement proccesingTime;
    @FindBy(className = "wcfmfa fa-arrow-alt-circle-right block-indicator")
    public WebElement attributesButton;
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
