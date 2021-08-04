package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPageFindBy;
import Utilities.CRMBaseClass;

public class LoginCRMByExcelFindBy extends CRMBaseClass {
	
	@Test
	public void loginCRM() {
		
        //driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost:8080/streamline/login.do");
		
		//just to find out whether the test is working fine or not
		//driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost:8080/streamline/login.do");
		//System.out.println(driver.getTitle());
		
		//LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		LoginPageFindBy loginpage=PageFactory.initElements(driver, LoginPageFindBy.class);
		
		//loginpage.loginCRMApplication("su", "a", "TC-Vinayak");
		
		loginpage.loginCRMApplication(excel.getStringValue("Sheet1", 0, 0), excel.getStringValue("Sheet1", 0, 1), excel.getStringValue("Sheet1", 0, 2));
		loginpage.loginCRMApplication(excel.getStringValue("Sheet1", 1, 0), excel.getStringValue("Sheet1", 1, 1), excel.getStringValue("Sheet1", 1, 2));
		loginpage.loginCRMApplication(excel.getStringValue("Sheet1", 2, 0), excel.getStringValue("Sheet1", 2, 1), excel.getStringValue("Sheet1", 2, 2));
		
		//driver=BrowserFactory.closeApplication(driver);
		
         }

}
