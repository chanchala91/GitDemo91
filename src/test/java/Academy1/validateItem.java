package Academy1;

import java.io.IOException;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;



import pageObject.searchItemValidate;


import resources.base;

public class validateItem extends base {
	
	
	
	@Test
	public void pageNavigation() throws IOException
	{
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
		searchItemValidate sv=new searchItemValidate(driver);
		sv.getsearch();
		
		
		
	}
	@AfterTest
	public void getclose()
	{
		driver.close();
	}

}
