package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class shopItems {
     public WebDriver driver;
	public shopItems(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getshop()
	{
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.className("sf-with-ul"))).build().perform();
		driver.findElement(By.cssSelector("a[title='T-shirts']")).click();
		driver.findElement(By.cssSelector("a[title='View']")).click();
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		Select s=new Select(driver.findElement(By.id("group_1")));
		s.selectByVisibleText("M");
		driver.findElement(By.cssSelector("a[title='Blue']")).click();
		driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
		driver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
		driver.findElement(By.cssSelector("a[href*='controller=order&step=1']")).click();
	}
	

}
