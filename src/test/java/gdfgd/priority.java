package gdfgd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class priority {

	
	@Test(priority = 1)
	public void t1()
	{
		System.out.println("priority 1");
	}
	
	@Test(priority = 0, alwaysRun = true)
	public void t3()
	{
		System.out.println("priority 0");
	}
	
	@Test(priority = 2)
	public void t2()
	{
		System.out.println("priority 2");
	}
	
	
	@BeforeTest
	public void t8()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void t9()
	{
		System.out.println("After test");
	}
	
	@BeforeMethod
	public void t7()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void t6()
	{
		System.out.println("After Method");
	}
	
	@BeforeSuite
	public void s()
	{
		System.out.println("Beforesuite");
	}
	
	@AfterSuite
	public void j()
	{
		System.out.println("Aftersuite");
	}
	
	@AfterClass
	public void k()
	{
		System.out.println("Afterclasse");
	}
	
	@BeforeClass
	public void l()
	{
		System.out.println("Beforeclass");
	}
	
	@Test(dependsOnMethods= {"z"},priority = 6)
	public void u()
	{
		System.out.println("method on method fg");
	}
	
	
	@Test(priority=4)
	public void z()
	{
		System.out.println("i am method fg");
	}
	
	@Test(priority=5)
	@Parameters({"URL"})
	public void D(String username)
	{
		System.out.println(username);
	}
	
	
	
}
