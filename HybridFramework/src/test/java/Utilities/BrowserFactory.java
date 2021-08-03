package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	
	public static  WebDriver startApplication(WebDriver driver, String BrowserName, String AppURL) 
	{
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\10. Software\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\Latest Selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("We don't support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(AppURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static  WebDriver closeApplication(WebDriver driver) {
		
		try {
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#signout > a > table > tbody > tr > td > span")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		return driver;
	}
	
	
 
}
