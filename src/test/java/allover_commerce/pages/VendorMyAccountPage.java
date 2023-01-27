package allover_commerce.pages;

import allover_commerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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



}
