package gdfgd;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderssz {

	
	@DataProvider
	public Object[][] DATA1()
	{
		Object[] [] data= new Object[2][2];
		data[0][0] ="firstname1";
		data[0][1]="password1";
		
		data[1][0] ="firstname2";
		data[1][1]="password3";
		
		return data;
	}
	
	@Test(dataProvider="DATA1")
	public void DATA(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
}
