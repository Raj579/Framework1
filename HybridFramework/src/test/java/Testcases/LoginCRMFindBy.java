package Testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.LoginPageFindBy;
import Utilities.CRMBaseClass;


public class LoginCRMFindBy extends  CRMBaseClass {

	@Test
	public void loginCRM() {
		
        //driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost:8080/streamline/login.do");
		
		//just to find out whether the test is working fine or not
		//driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost:8080/streamline/login.do");
		//System.out.println(driver.getTitle());
		
		//LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
		
		LoginPageFindBy loginpage=PageFactory.initElements(driver, LoginPageFindBy.class);
		
		loginpage.loginCRMApplication("su", "a", "TC-Multi-Selection (0Z0)");
		
		//driver=BrowserFactory.closeApplication(driver);
		
         }
	
}
	
	
