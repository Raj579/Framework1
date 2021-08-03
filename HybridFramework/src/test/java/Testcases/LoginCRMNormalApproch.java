package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.LoginPageNormalApproch;
import Utilities.BrowserFactory;

public class LoginCRMNormalApproch {
	WebDriver driver;
	
	@Test
	public void loginCRM() {
		
		driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost:8080/streamline/login.do");
		
		//just to find out whether the test is working fine or not
		//driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost:8080/streamline/login.do");
		//System.out.println(driver.getTitle());
		
		LoginPageNormalApproch loginpage=PageFactory.initElements(driver, LoginPageNormalApproch.class);
		
		loginpage.loginCRMApplicationNormalApproch("su", "centra5", "TC-Calculations-Rules (0H0) ");
		
         }
	
}
	
	
