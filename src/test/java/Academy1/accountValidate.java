package Academy1;

import java.io.IOException;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;



import pageObject.registrationPage;


import resources.base;

public class accountValidate extends base { 
	
	
	
	@Test
	public void pageNavigation() throws IOException
	{
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
		registrationPage rp=new registrationPage(driver);
		rp.getRegister();
		
		
		
	}
	@AfterTest
	public void getclose()
	{
		driver.close();
	}

}
