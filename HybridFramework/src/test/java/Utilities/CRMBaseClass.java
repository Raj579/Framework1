package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class CRMBaseClass {
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public static void readExcel(){
		excel= new ExcelDataProvider();
	}
	
	@BeforeTest
	public static void startApp() {
		driver=BrowserFactory.startApplication(driver, "Chrome", "http://localhost:8080/streamline/login.do");
	}
	
	@AfterTest
	public static void quitApp() {
		driver=BrowserFactory.closeApplication(driver);
	}

}
