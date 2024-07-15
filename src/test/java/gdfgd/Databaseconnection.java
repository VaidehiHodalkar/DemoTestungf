package gdfgd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Databaseconnection {
		
    		
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// TODO Auto-generated method stub

		String host="localhost";

		String port= "3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "root", "vaidehi123");

		Statement s=con.createStatement();

		ResultSet rs=s.executeQuery("Select name from Employeeinfo where location ='newjersey'");
		
		System.out.println(rs);

		while(rs.next())

		{

		//WebDriver driver= new FirefoxDriver();
			 WebDriver driver=new ChromeDriver();  
		     
		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("java");

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(rs.getString("name"));

		}

		}

}
