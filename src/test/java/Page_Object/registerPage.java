package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
	
		WebDriver driver ;
		
		public registerPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//span[text()='My Account']") private WebElement  myAccountField;
		@FindBy(linkText="Register") private WebElement clickRegister;
		@FindBy(xpath="//input[@name='firstname']") private WebElement firstName;
		@FindBy(xpath="//input[@name='lastname']") private WebElement lastName;
		@FindBy(xpath="//input[@name='email']") private WebElement email;
		@FindBy(xpath="//input[@name='telephone']") private WebElement telePhone;
		@FindBy(xpath="//input[@name='password']") private WebElement password;
		@FindBy(xpath="//input[@name='confirm']") private WebElement ConfirmPassword;
		@FindBy(xpath="//input[@name='agree']") private WebElement privecyPolicy;
		@FindBy(xpath="//input[@type='submit']") private WebElement continew;
		@FindBy(xpath="//*[@id=\\\"content\\\"]/h1") private WebElement AssertRegistration;
		
		public void clickOnMyAccount() {
			myAccountField.click();
		}
	    public void clickOnRegister() {
	    	clickRegister.click();
		}
	    public void entermandatFields(String FirstName,String LastName,String Email, String telephone,String Password,String cnPassword)
	    {
	    	firstName.sendKeys(FirstName);
	    	lastName.sendKeys(LastName);
	    	email.sendKeys(Email);
	    	telePhone.sendKeys(telephone);
	    	password.sendKeys(Password);
	    	ConfirmPassword.sendKeys(cnPassword);
	    	
		}
		
	    public void ClickOnprivecyPolicy() {
	    	privecyPolicy.click();
	    }
	    
	    public void clickOnContinew() {
	    	continew.click();
		
}

	    public boolean AssertRegistrationSuccessfull() {
	    	
	    	return AssertRegistration.isDisplayed();
	    }
	    }