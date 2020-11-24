package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class searchItemValidate {
     public WebDriver driver;
	public searchItemValidate(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getsearch()
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.className("sf-with-ul"))).build().perform();
		driver.findElement(By.cssSelector("a[title='T-shirts']")).click();
		//String name=driver.findElement(By.xpath("//h5/a[contains(text(),'Faded Short Sleeve T-shirts')]")).getText();
		String name=driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).getText();
	    System.out.println(name);
	    a.moveToElement(driver.findElement(By.id("search_query_top"))).click().sendKeys(name).build().perform();;
	    driver.findElement(By.name("submit_search")).click();
	   // Assert.assertEquals(name,"Faded Short Sleeve T-shirts" );
	    
	    
	    
	    

	    
}
}