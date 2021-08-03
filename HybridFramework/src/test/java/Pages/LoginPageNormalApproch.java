package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPageNormalApproch {
	
	WebDriver driver;

	//Constructor name should be same as class name
	public LoginPageNormalApproch(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	//@FindBy(name="username") WebElement Uname;
	//@FindBy(name="password") WebElement Pword;
	//@FindBy(id="company") WebElement cmpany;
	//@FindBy(name="login") WebElement lgnbutton;
	
	 By usernameLocator = By.name("username");
     By passwordLocator = By.name("password");
    By selectorLocator = By.id("company");
     By loginButtonLocator = By.id("login");
	By logoutbuttonLocator = By.xpath("//span[@class='fa fa-power-off apptypesquare darkHeaderIcon darkHeaderIcon-font-size']");
	
	
	public void loginCRMApplicationNormalApproch(String Usrname, String Pssword, String visibletext ) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Uname.sendKeys(Usrname);
		//Pword.sendKeys(Pssword);
		//Select drop = new Select(cmpany); //handling drop downs in POM.
	    // drop.selectByIndex(2);
	    //lgnbutton.click();
		
		driver.findElement(usernameLocator).sendKeys(Usrname);
		driver.findElement(passwordLocator).sendKeys(Pssword);
		Select drop = new Select(driver.findElement(selectorLocator)); //handling drop downs in POM.
	    drop.selectByVisibleText(visibletext);
	    driver.findElement(loginButtonLocator).click();
	    driver.findElement(logoutbuttonLocator).click();
	}
}
