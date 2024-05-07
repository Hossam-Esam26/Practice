package Pages.CheckOut;

import Pages.Base.DataClass;
import Pages.Base.ElementsActions;
import Pages.Base.Helper;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class FormPage {
    private WebDriver driver;

    //constructor
    public FormPage (WebDriver driver)
    {
        this.driver = driver;
    }

    //locators
   // private By billingAddress_ContinueButton = By.xpath("//div[@id='billing-buttons-container']/button[@class = 'new-address-next-step-button']");
   // private By shippingMethod_ContinueButton = By.xpath("//div[@id='shipping-method-buttons-container']/button[@class = 'shipping-method-next-step-button']");
    private By country = By.id("BillingNewAddress_CountryId");
    private By cityField = By.id("BillingNewAddress_City");
    private By addressField = By.id("BillingNewAddress_Address1");
    private By postalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    private By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    private By billingAddress_ContinueButton = By.cssSelector("#billing-buttons-container .new-address-next-step-button");
    private By shippingMethod_ContinueButton = By.cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button");
    private By paymentMethod_ContinueButton = By.className("payment-method-next-step-button");
    private By paymentInformation_ContinueButton = By.className("payment-info-next-step-button");
    private By confirmOrder_ContinueButton = By.className("confirm-order-next-step-button");
    private By orderCompleted_ContinueButton = By.className("order-completed-continue-button");

    //Actions

    public FormPage selectCountry(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver , country);
        ElementsActions.selector(driver , country , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public FormPage enterYourCity(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver , cityField);
        ElementsActions.sendText(driver , cityField , DataClass.jsonData(objectName , fieldName));
        return this;
    }


    public FormPage enterYourAddress(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver , addressField);
        ElementsActions.sendText(driver , addressField , DataClass.jsonData(objectName , fieldName));
        return this;
    }


    public FormPage enterYourPostalCode(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver , postalCodeField);
        ElementsActions.sendText(driver , postalCodeField , DataClass.jsonData(objectName , fieldName));
        return this;
    }


    public FormPage enterYourPhoneNumber(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver , phoneNumberField);
        ElementsActions.sendText(driver , phoneNumberField , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public FormPage clickOnBillingAddress_ContinueButton()
    {
        Helper.waitForElement(driver , billingAddress_ContinueButton);
        ElementsActions.clicker(driver , billingAddress_ContinueButton);
        return this;
    }

    public FormPage clickOnShippingMethod_ContinueButton()
    {
        Helper.waitForElement(driver , shippingMethod_ContinueButton);
        ElementsActions.clicker(driver , shippingMethod_ContinueButton);
        return this;
    }

    public FormPage clickOnPaymentMethod_ContinueButton()
    {
        Helper.waitForElement(driver , paymentMethod_ContinueButton);
        ElementsActions.clicker(driver , paymentMethod_ContinueButton);
        return this;
    }

    public FormPage clickOnPaymentInformation_ContinueButton()
    {
        Helper.waitForElement(driver , paymentInformation_ContinueButton);
        ElementsActions.clicker(driver , paymentInformation_ContinueButton);
        return this;
    }

    public FormPage clickOnConfirmOrder_ContinueButton()
    {
        Helper.waitForElement(driver , confirmOrder_ContinueButton);
        ElementsActions.clicker(driver , confirmOrder_ContinueButton);
        return this;
    }

    public FormPage clickOnOrderCompleted_ContinueButton()
    {
        Helper.waitForElement(driver , orderCompleted_ContinueButton);
        ElementsActions.clicker(driver , orderCompleted_ContinueButton);
        return this;
    }

}
