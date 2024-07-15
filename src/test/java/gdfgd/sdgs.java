package gdfgd;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sdgs {

	
	@Test
	public void n2()
	{
		System.out.println("launching the tetng 1 folder class sdgs");
	}
	
	@Test(groups= {"Smoke"})
	public void n3()
	{
		System.out.println("This is the smoke test");
	}
	
	@BeforeMethod
	public void a()
	{
		System.out.println("Beforemethod");
	}
	
	
}
