package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class registrationPage {
	
	public WebDriver driver;

	public registrationPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void getRegister()
	{
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("test234@test12345.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("abcd");
		driver.findElement(By.id("customer_lastname")).sendKeys("efgh");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		Select s=new Select(driver.findElement(By.id("days")));
		s.selectByIndex(3);
		Select s1=new Select(driver.findElement(By.id("months")));
		s1.selectByIndex(2);
		Select s2=new Select(driver.findElement(By.id("years")));
		s2.selectByIndex(5);
		driver.findElement(By.id("address1")).sendKeys("borabanda,hyderabad");
		driver.findElement(By.id("city")).sendKeys("Hitech");
		Select s3 =new Select(driver.findElement(By.id("id_state")));
		s3.selectByIndex(4);
		driver.findElement(By.id("postcode")).sendKeys("12345");
		Select s4=new Select(driver.findElement(By.id("id_country")));
		s4.selectByIndex(1);
		driver.findElement(By.id("phone_mobile")).sendKeys("9867542353");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("pqrst");
		driver.findElement(By.id("submitAccount")).click();
		String abc=driver.findElement(By.className("info-account")).getText();
		System.out.println(abc);
		//Assert.assertEquals(abc, "Welcome to your account. Here you can manage all of your personal information and orders.");
		
	}

}
