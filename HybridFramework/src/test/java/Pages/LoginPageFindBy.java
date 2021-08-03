package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPageFindBy{
	
	WebDriver driver;

	//Constructor name should be same as class name
	public LoginPageFindBy(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	@FindBy(name="username") WebElement Uname;
	@FindBy(name="password") WebElement Pword;
	@FindBy(id="company") WebElement cmpany;
	@FindBy(name="login") WebElement lgnbutton;
  //@FindBy(xpath="//span[@class='fa fa-power-off apptypesquare']") WebElement lgout;
	
	// By usernameLocator = By.name("username");
    // By passwordLocator = By.name("password");
   //  By selectorLocator = By.id("company");
   //  By loginButtonLocator = By.id("login");
	
	
	
	public void loginCRMApplication(String Usrname, String Pssword, String visibletext) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Uname.clear();
		Uname.sendKeys(Usrname);
		Pword.clear();
		Pword.sendKeys(Pssword);
		Select drop = new Select(cmpany);
		//handling drop downs in POM.
	    drop.selectByVisibleText(visibletext);
	    lgnbutton.click();
	    // lgout.click();
		//driver.findElement(usernameLocator).sendKeys(Usrname);
		//driver.findElement(passwordLocator).sendKeys(Pssword);
		//Select drop = new Select(cmpany); //handling drop downs in POM.
	   // drop.selectByIndex(2);
	   // driver.findElement(loginButtonLocator).click();
	}
}
