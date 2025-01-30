package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver ;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='form-control']")  // Locator for the username field
   private WebElement emailField;

    @FindBy(xpath = "//input[@id='input-password']")  // Locator for the password field
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")  // Locator for the login button
    private WebElement submitButton;
	
	@FindBy(xpath="//span[text()='My Account']")
    private WebElement MyAccountField;
	
	@FindBy(linkText="Login") 
	private WebElement LoginField;
	
	@FindBy(linkText="Edit your account information")
	private WebElement AssertLoginSMSField;
	
	
	public void clickMYAccountButton() {
	    MyAccountField.click(); }
	    
	public void clickLogin() {
	    LoginField.click(); }
    
    public void enterUsername(String username) {
    	emailField.sendKeys(username);
    }

    // Method to enter the password
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Method to click the login button
    public void clickLoginButton() {
    	submitButton.click();
    }
    
    public void AssertLogin() {
    	AssertLoginSMSField.isDisplayed();
    }
    
    
   
    
    
    
	}


