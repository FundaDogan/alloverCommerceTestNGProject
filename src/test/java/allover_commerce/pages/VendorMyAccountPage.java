package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VendorMyAccountPage {


    public VendorMyAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //*******************HATICE US_12, US_13, US_14*******************
    @FindBy(xpath = "(//h2)[1]")
    public WebElement myAccountTitle;

    @FindBy(linkText = "Addresses")
    public WebElement addressesOption;

    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement editBillingAddressButton;
    @FindBy(id = "billing_first_name")
    public WebElement vendorFirstnameInput;

    @FindBy(id = "billing_last_name")
    public WebElement vendorLastnameInput;

    @FindBy(id = "billing_country")
    public WebElement countryDropdown;

    @FindBy(id = "billing_address_1")
    public WebElement streetInput;

    @FindBy(id = "billing_city")
    public WebElement cityInput;

    @FindBy(id = "billing_state")
    public WebElement stateDropdown;

    @FindBy(id = "billing_postcode")
    public WebElement zipcodeInput;

    @FindBy(id = "billing_phone")
    public WebElement vendorPhoneInput;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement saveAddressButton;

    @FindBy(xpath = "(//table[@class='address-table'])[1]//td")
    public List<WebElement> allBillingAddressTableElements;

    @FindBy(xpath = "//ul[@role='alert']")
    public WebElement invalidDataAlert;

    @FindBy(xpath = "//ul[@role='alert']//li")
    public List<WebElement> invalidDataAlertList; // all required address fields

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement addressChangeSuccessMessage;

//******************END*********************************************






























































































    //Mustafa US_15_TC_01=============================================================================================================

    @FindBy( linkText = "Store Manager") ////a[@href='https://allovercommerce.com/store-manager/']
    public WebElement storeMenagerButton;

    @FindBy( linkText = "Products")
    public WebElement productsButton;

    @FindBy( linkText = "Add New")
    public WebElement addNewButton1;

    @FindBy( className = "page_collapsible_content_holder")
    public WebElement inventoryButton;


    @FindBy( xpath = "//div[@class='page_collapsible_content_holder']")
    public List<WebElement> menuList;          //Inventory, Shipping, Attributes, Linked, Seo, Wholesale product display settings, Advanced menus

 //Mustafa US_15_TC_01=============================================================================================================

 // Mustafa US_15_TC_02=============================================================================================================

          @FindBy(id = "sku")
          public WebElement skuUnit;

          @FindBy(id= "manage_stock")
           public WebElement manageStockCheckbox;

          @FindBy(xpath = "//*[@id='stock_qty']")
          public WebElement stockQuantity;

          @FindBy(id = "sold_individually")
          public WebElement soldIndividuallyChekbox;

          @FindBy(id = "backorders")
           public WebElement allowBackordersDropDownMenu;
//Mustafa US_15_TC_02=============================================================================================================

    // Mustafa US_15_TC_03=============================================================================================================
            @FindBy(xpath= "//*[@id='wcfm_products_manage_form_shipping_head']")
            public WebElement shippingButton;

           @FindBy(id = "weight")
           public WebElement weight;

           @FindBy(id= "length")
           public WebElement length;

           @FindBy(id= "width")
           public WebElement width;

           @FindBy(id= "height")
           public WebElement height;

           @FindBy(id= "shipping_class")
           public WebElement shippingClasses;

           @FindBy(id= "_wcfmmp_processing_time")
           public WebElement proccesingTime;
//Mustafa US_15_TC_03=============================================================================================================

 //Mustafa US_15_TC_04=============================================================================================================




           @FindBy(className= "wcfmfa fa-arrow-alt-circle-right block-indicator")
           public WebElement attributesButton;





           @FindBy(xpath = "//*[@id='attributes_is_active_1']")
            public WebElement colorCheckbox;

            @FindBy(id= "attributes_is_visible_1")
            public WebElement visibleOnTheProductPageCheckbox;

            @FindBy(xpath= "//*[@id='attributes']/div[2]/button[3]")
            public WebElement selectAllButton;

            @FindBy(xpath= "//*[@id='attributes']/div[2]/button[2]")
            public WebElement selectNoneButton;

           @FindBy(linkText= "Add New")
            public WebElement addNewButton2;











//Mustafa US_15_TC_04=============================================================================================================

}
