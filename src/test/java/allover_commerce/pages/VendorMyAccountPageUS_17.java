package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorMyAccountPageUS_17 {
    public VendorMyAccountPageUS_17() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributesButton;

    @FindBy(id = "attributes_is_visible_1")
    public WebElement visibleOnTheProductPageCheckbox;
    @FindBy(id = "product_type")
    public WebElement typeOfProduct;

    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[3]")
    public WebElement selectAllButton;

    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[2]")
    public WebElement selectNoneButton;

    @FindBy(linkText = "Add New")
    public WebElement addNewButton2;

    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
public WebElement textNewColor;

    @FindBy(id = "insert-media-button")
    public WebElement addMediaButton;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement selectFilesBtn;

    @FindBy(id= "attributes_is_active_1")
public WebElement colorCheckbox;

    @FindBy(id="attributes_is_active_2")
    public WebElement sizeCheckbox;











    @FindBy(id = "featured_img_display")
    public WebElement addDisplayPhotoIcon;

   @FindBy(id = "__wp-uploader-id-1")
   public WebElement selectFilesButton;

   // @FindBy(xpath = "//input[@type='file']")
   // public WebElement selectFilesButton;

    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectToUploadButton;


}
