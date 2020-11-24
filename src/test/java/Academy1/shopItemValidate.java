package Academy1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.shopItems;
import resources.base;

public class shopItemValidate extends base { 
	
	@Test
	public void pageNavigation() throws IOException
	{
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
		shopItems si=new shopItems(driver);
		si.getshop();
		
		
		
	}
	@AfterTest
	public void getclose()
	{
		driver.close();
	}

}
