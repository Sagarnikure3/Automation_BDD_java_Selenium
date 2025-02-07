package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
   

public  class myHooks {
	
	public static  WebDriver driver ;
	
	@Before
	public void setup ()
	       
	{   
		    driver = new ChromeDriver();
		    System.out.println("browser got open");
		    driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		
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


