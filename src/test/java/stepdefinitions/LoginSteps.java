package stepdefinitions;
import java.time.Duration;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.myHooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import Page_Object.loginPage;


public class LoginSteps {
	
	WebDriver driver;
	 loginPage lgn;

	public LoginSteps() {
        this.driver = myHooks.getDriver();
         lgn=new loginPage (driver);
   	 
    }
	
	 //static Map<String, String> dataset ; 
	
      @Given("User navigate to login page")
      public void user_navigate_to_login_page()
       {

	    lgn.clickMYAccountButton();
	    lgn.clickLogin();
		
       }

	  @When("user enter valid email adress {string}")
      public void user_enter_valid_email(String stringg) 
	  {
		
		lgn.enterUsername(stringg);
	  }
	 //catch (NoSuchElementException e) {
      //  System.out.println("Erroruu: Element not found. " + e.getMessage());
        // Optional: Take a screenshot or log additional information
	
	//}}

	  @And("user enter valid password {string}")
	  public void user_enter_valid_password(String stringg) 
	  {
		
		lgn.enterPassword(stringg);
	  }

	  @And("^click on login buttion$")
	  public void click_on_login_buttion()
	  {
		lgn.clickLoginButton();
	  }

	@Then("^user should login succesfully$")
	public void user_should_login_succesfully() 
	  {
		//Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		lgn.AssertLogin();
		 
	   }

	@When("user enter invalid email {string}")
	public void user_enter_invalid_email(String stringgg) 
	
	{
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(stringgg);
		
	}

	@And("user enter invalid password {string}")
	public void user_enter_invalid_password(String stringgg) 
	{
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(stringgg);
		//System.out.println(" ==> User entered invalid password  succesfully ");
		
	}

	@And("user should not login succesfully")
	public void user_should_not_login_succesfully() 
	{
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		
		/* WebElement notLogged = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]"));
		String text_invalid = notLogged.getText();
		System.out.println(text_invalid);
	
		if(text_invalid.equals("Warning: No match for E-Mail Address and/or Password."))
	    {
			 System.out.println("testcases pass -->User got proper massage");
		}
		else 
		{
			 System.out.println("testcases fail -->User able to logged in using invalid creadential");
		}*/
		}
   }
