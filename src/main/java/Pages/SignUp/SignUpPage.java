package Pages.SignUp;

import Pages.Base.DataClass;
import Pages.Base.ElementsActions;
import Pages.Base.Helper;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class SignUpPage {
    private static WebDriver driver;

    public SignUpPage(WebDriver driver) throws IOException, ParseException {
        SignUpPage.driver=driver;
    }

    // locators
    private By registerButton = By.xpath("//li/a[text() = 'Register']");
    private By gender = By.id("gender-male");
    private By fName = By.id("FirstName");
    private By lName = By.id("LastName");
    private By dateOfBirth_D = By.xpath("//select[@name = 'DateOfBirthDay']");
    private By dateOfBirth_M = By.xpath("//select[@name = 'DateOfBirthMonth']");
    private By dateOfBirth_Y = By.xpath("//select[@name = 'DateOfBirthYear']");
    private By email= By.id("Email");
    private By companyName = By.id("Company");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By confirmRegistrationButton = By.id("register-button");

    //password validation message
    public String validationMessage(WebDriver driver)
    {
        String message = driver.findElement(By.className("field-validation-error")).getText();
        return message;
    }
    //Actions

    public SignUpPage clickOnRegisterButton() throws IOException {
        Helper.waitForElement(driver,registerButton);
        ElementsActions.clicker(driver,registerButton);
        return  this;
    }

    public SignUpPage chooseYourGender()
    {
        Helper.waitForElement(driver,gender);
        ElementsActions.clicker(driver,gender);
        return this;
    }
    public SignUpPage enterYourFirstName(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,fName);
        ElementsActions.sendText(driver , fName , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public SignUpPage enterYourLastName(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,lName);
        ElementsActions.sendText(driver , lName , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public SignUpPage selectYourDateOfBirth_D(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,dateOfBirth_D);
        ElementsActions.selector(driver,dateOfBirth_D , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public SignUpPage selectYourDateOfBirth_M(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,dateOfBirth_M);
        ElementsActions.selector(driver,dateOfBirth_M , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public SignUpPage selectYourDateOfBirth_Y(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,dateOfBirth_Y);
        ElementsActions.selector(driver,dateOfBirth_Y , DataClass.jsonData(objectName , fieldName));
        return this;
    }

    public SignUpPage enterYourEmail(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,email);
        ElementsActions.sendText(driver,email,DataClass.jsonData(objectName , fieldName));
        return  this;
    }

    public SignUpPage enterCompanyName(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,companyName);
        ElementsActions.sendText(driver,companyName,DataClass.jsonData(objectName , fieldName));
        return  this;
    }

    public SignUpPage enterYourPassword(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,password);
        ElementsActions.sendText(driver,password,DataClass.jsonData(objectName , fieldName));
        return  this;
    }

    public SignUpPage enterConfirmPassword(String objectName , String fieldName) throws IOException, ParseException {
        Helper.waitForElement(driver,confirmPassword);
        ElementsActions.sendText(driver,confirmPassword,DataClass.jsonData(objectName , fieldName));
        return  this;
    }

    public SignUpPage clickOnConfirmRegistrationButton()
    {
        Helper.waitForElement(driver , confirmRegistrationButton);
        ElementsActions.clicker(driver , confirmRegistrationButton);
        return this;
    }




}
