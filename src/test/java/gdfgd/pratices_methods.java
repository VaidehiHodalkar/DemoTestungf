package gdfgd;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.openqa.selenium.By;  

public class pratices_methods {
	
	@Test
	public void InitailDriver() throws IOException
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");   
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		 WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	          
		  
}
	
    // declaration and instantiation of objects/variables  

          
}