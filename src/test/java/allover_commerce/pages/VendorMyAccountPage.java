package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorMyAccountPage {

    public VendorMyAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



















 //Mustafa=============================================================================================================

    @FindBy( linkText = "Store Manager") ////a[@href='https://allovercommerce.com/store-manager/']
    public WebElement storeMenagerButton;

    @FindBy( linkText = "Products")
    public WebElement productsButton;

    @FindBy( linkText = "Add New")
    public WebElement addNewButton;

    @FindBy( className = "page_collapsible_content_holder")
    public WebElement inventoryButton;






 //Mustafa=============================================================================================================








}
