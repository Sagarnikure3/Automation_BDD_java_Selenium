package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
   

public  class myHooks {
	
	public static  WebDriver driver ;
	
	@Before
	public void setup ()
	       
	{   
		    driver = new ChromeDriver();
		    driver.get("https://tutorialsninja.com/demo/");
		    System.out.println("browser got open");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		
	}
	    
	/*@After
	public void close ()
	{
		System.out.println("browser got closed");
	driver.quit(); 
		
	}*/
	
    public  static  WebDriver getDriver() {
             return driver  ;
}
	
	
	}


