package Academy1;

import java.io.IOException;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;


import pageObject.loginPage;

import resources.base;

public class homePage extends base { 
	
	
	
	@Test
	public void pageNavigation() throws IOException
	{
		
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
		loginPage lp=new loginPage(driver);
		lp.getLogin().click();
		lp.getEmail().sendKeys("abc@gmail.com");
		lp.getPassword().sendKeys("12345678");
		lp.getSign().click();
		
		
	}
	@AfterTest
	public void getclose()
	{
		driver.close();
	}

}
