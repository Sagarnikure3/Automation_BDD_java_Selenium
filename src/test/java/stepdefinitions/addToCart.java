package stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.myHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addToCart {

	 WebDriver driver ;
	
	 public addToCart() {
		
	 this.driver=myHooks.getDriver();
		
	}
	 
	  @When("user click on add to cart button")
	  public void user_click_on_add_to_cart_button()
	
	{
		driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
	}

	@Then("user should see available option")
	   public void user_should_see_available_option() 
	    {
		Assert.assertTrue(driver .findElement(By.xpath("//*[text()='Available Options']")).isDisplayed());
	    }

	@Then("user select date from calender")
	   public void user_select_date_from_calender() {
	    driver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
		WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]")));
		String actualdate= driver.findElement(By.className("picker-switch")).getText();
		while (!(actualdate.equals("May 2016")))
			
		{
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/thead/tr[1]/th[3]")).click();
			actualdate= driver.findElement(By.className("picker-switch")).getText();
		}
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//td[text()='11']")).click();//cliking date 11
		driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("4");//will select quetity
		
	}

	    @Then("click on add to cart button")
	    public void click_on_add_to_cart_button() {
	    driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	    @Then("product should be added succesfully")
	    public void product_should_be_added_succesfully() {
	    	String b = driver.findElement(By.xpath("//*[text()='Success: You have added ']")).getText();
	    	System.out.println(b);
	    Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Success: You have added ']")).isDisplayed());
	}
	    

	    @Then("user click on cart icon")
	    public void user_clicks_on_cart_icon() {
	        
	    }

	    @And("click on view cart option")
	    public void clicks_on_view_cart_option() {
	       
	    }

	    @When("user click on remove icon")
	    public void user_clicks_on_remove_icon() {
	      
	    }

	    @Then("product should removed succesfully")
	    public void product_removed_successfully() {
	       
	}

}
