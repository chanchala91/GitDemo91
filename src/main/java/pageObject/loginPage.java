package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	By login=By.xpath("//a[@title='Log in to your customer account']");
	By email=By.id("email");
	By password=By.id("passwd");
	By signin=By.name("SubmitLogin");
	
	
	
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getSign()
	{
		return driver.findElement(signin);
	}

}
