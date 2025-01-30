package stepdefinitions;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Hooks.myHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class editAccount {
	WebDriver driver;
	
	public editAccount() {
		
		this.driver=myHooks.getDriver();
	
		
	}
	
	 @Then("user click on edit account field")
	    public void userClickOnEditAccountField() {
		

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement editAccountField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Edit Account']")));
		 editAccountField.click();
	        //WebElement editAccountField = driver.findElement(By.xpath("//*[text()='Edit Account']")); // Update with the actual locator
	        
	    }

	    @Then("user should navigate to my account information page")
	    public void userShouldNavigateToMyAccountInformationPage() {
	        String currentUrl = driver.getCurrentUrl();
	        String A = "https://tutorialsninja.com/demo/index.php?route=account/edit";
	        Assert.assertTrue(currentUrl.equalsIgnoreCase(A));
//	        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='My Account Information']")).isDisplayed());
	    }

	    @When("user updated name field {string}")
	    public void userUpdatedNameField(String UpdatedName) {
	        WebElement nameField = driver.findElement(By.xpath("//*[@name='firstname']")); // Update with the actual locator
	        nameField.clear();
	        nameField.sendKeys(UpdatedName);
	    }

	    @Then("user click on continue button")
	    public void userClickOnContinueButton() {
	        WebElement continueButton = driver.findElement(By.xpath("//*[@type='submit' and @value='Continue']")); // Update with the actual locator
	        continueButton.click();
	    }
	    @Then("newly created account should updated properly")
	    public void newlyCreatedAccountShouldBeUpdatedProperly() {
	    	String confirmationMssage="Success: Your account has been successfully updated.";
	
	Assert.assertTrue(confirmationMssage.equalsIgnoreCase(driver.findElement(By.xpath("//*[text()='Success: Your account has been successfully updated.']")).getText()));
	}
	    
	    @Then("user should nevigate to change password page")
	    public void userShouldNavigateToChangePasswordPage() {
	        System.out.println("user nevigated to change pass page");}

	    @When("user enter new password in password field {string}")
	    public void userEnterNewPasswordInPasswordField(String string) {
	        // Code to enter a new password in the password field
	        WebElement passwordField = driver.findElement(By.id("password"));
	        passwordField.sendKeys(string);
	    }

	    @And("user re-enter new password in confirm password field {string}")
	    public void userReEnterNewPasswordInConfirmPasswordField(String string) {
	        // Code to re-enter the new password in the confirm password field
	        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));
	        confirmPasswordField.sendKeys(string);
	    }

	    @And("user click on enter button")
	    public void userClickOnEnterButton() {
	        // Code to click on the "Enter" or "Submit" button
	        WebElement submitButton = driver.findElement(By.xpath("//*[@value='Continue']"));
	        submitButton.click();
	    }

	    @Then("Password should updated successfully")
	    public void passwordShouldUpdatedSuccessfully() {
	    	
	    	WebElement r = driver.findElement(By.id("//*[text()='Success: Your password has been successfully updated.']"));
	        Assert.assertTrue(r.isDisplayed());
	    }
	    
	    @When("user click on password field")
	    public void userClickOnPasswordField() {
	        // Code to click on the password field
	        WebElement passwordField = driver.findElement(By.xpath("//*[@href='https://tutorialsninja.com/demo/index.php?route=account/password' and  text()='Password']"));
	        passwordField.click();
	    }

	
}
