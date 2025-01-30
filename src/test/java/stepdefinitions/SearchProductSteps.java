package stepdefinitions;


import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.myHooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
public class SearchProductSteps {

	WebDriver driver;

	public SearchProductSteps() {
        this.driver = myHooks.getDriver();
    }
	
	@When("User enter valid product {string}")
	public void user_enter_valid_product(String validproduct) {
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(validproduct);
		
		
	    //System.out.println("Valid product got searched on search field");
	}

	@And("user click on search button")
	public void user_click_on_search_button() {
		
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-default btn-lg']")).click();
	    
	}

	@Then("Valid product should get displayed in search result")
	public void valid_product_should_get_displayed_in_search_result() {
	   Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a")).isDisplayed()) ;
	}

	@When("User enter non existing product {string}")
	public void user_enter_non_existing_product(String invalidproduct) {
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(invalidproduct);
	}

	@Then("Proper massage should get to user informing no such product")
	public void proper_massage_should_get_to_user_informing_no_such_product() {
	      WebElement el=driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]"));
	      String mssage=el.getText();
	      System.out.println(mssage);
	      Assert.assertTrue(mssage.equals("There is no product that matches the search criteria."));
	}

	@Given("user nevigate to search page")
	public void user_nevigate_to_search_page() {
	   System.out.println("user nevigated to searc page ");
	}

	@When("user dont enter any product on search field")
	public void user_dont_enter_any_product_on_search_field() {
	   System.out.println("user not entered anything in search field ");
	}

	@Then("User should get proper massage")
	public void user_should_get_proper_massage() {
	    System.out.println("user got proper error massage ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
