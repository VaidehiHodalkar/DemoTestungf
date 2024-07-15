package gdfgd;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class xa {

	
	@Test(groups= {"Smoke"})
	public void n()
	{
		System.out.println("This is the smoke test2");
	}
	
	@AfterTest
	public void a()
	{
		System.out.println("AfterTest");
	}
	
	@BeforeGroups
	@Test(groups= {"Smoke"})
	public void m()
	{
		System.out.println("Before groups");
	}
	
	@AfterGroups
	@Test(groups= {"Smoke"})
	public void q()
	{
		System.out.println("After groups");
	}

	
	
}
