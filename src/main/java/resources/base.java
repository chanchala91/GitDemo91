package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fs=new FileInputStream("D:\\workspaces\\E2EProgect\\src\\main\\java\\resources\\data.properties");
		prop.load(fs);
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D://work//chromedriver.exe");
			 driver=new ChromeDriver();
			
			
		}
		else if(browsername.equals("firefox"))
		{
			
		}
		else if(browsername.equals("IE"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
