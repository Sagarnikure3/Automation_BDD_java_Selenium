package stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.myHooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



  public class Register_2  {
	
	
	 WebDriver driver;

	public Register_2() {
        this.driver = myHooks.getDriver();
    }
	
	 static Map<String, String> dataset ;
	
	@Given("User nevigate to registerr page")
	public void User_nevigate_to_registerr_page() {	
		
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
	}
	
	       @When("user enters below detail fields")
   	       public void When_user_enters_below_detail_fields(DataTable datatable) {
		
	 Map<String, String> dataset = datatable.asMap(String.class,String.class);
		  
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(dataset.get("Firstname"));
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(dataset.get("LastName"));
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(dataset.get("Email"));
	  driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(dataset.get("Telephone"));
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataset.get("Password"));
	  driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys(dataset.get("Password")); 
	
	   }

          @And("select privecy policy field")
           public void select_privecy_policy_field()  {
		  
		    driver.findElement(By.xpath("//input[@name='agree']")).click();  
		  
		    //System.out.println(">> User has selected privacy policy field " );
	  	
	  }
	  
	        @And("click on continue button")
	         public void click_on_continue_button() 
	  
	  {
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
	  	       //System.out.println(">> User has clicked on  continue button " );
	  }
	  
	 @Then("account should get succesfully created")
	        public void account_should_get_succesfully_created()
	        
	   {
	      Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed());
	        	
	        	//System.out.println(">> Account created succesfully ");
	   }

	  
	    @And("user select newsletter yes")
	public void user_select_newsletter_yes()
	
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
		
	}
	@And("account should get proper warning massage duplicate email") 
   public void account_should_get_proper_warning_massage_duplicate_email()
   {
	
		String a=driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]")).getText();
		Assert.assertTrue(a.equals("Warning: E-Mail Address is already registered!"));
   }
	@And("user dont select any fields")
	public void user_dont_select_any_fields()
	
	{
		/*driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(dataset.get("Firstname"));
		  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(dataset.get("LastName"));
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(dataset.get("Email"));
		  driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(dataset.get("Telephone"));
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataset.get("Password"));
		  driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys(dataset.get("Password"));
		
	*/}
	@Then("account should get proper warning massage")
	public void account_should_get_proper_warning_massage()
	
	{
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]")).isDisplayed());
		
	}
	
	}
	
	

