package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPageFindBy {
	
	WebDriver driver;

	//Constructor name should be same as class name
	public AccountPageFindBy(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//span[@id='2305_toggleTitle']") WebElement AccGroup;
	@FindBy(xpath="//a[@class='nButton'][contains(text(), 'Account')]") WebElement NewAccBtn;
	@FindBy(name="f[0].value") WebElement AccName;
	@FindBy(name="f[3].value") WebElement AccPhone;
	@FindBy(name="f[4].valueText") WebElement AccType;
	@FindBy(xpath="//a[@id='actBar_0_33_0_abr0']") WebElement AccSave;
	
	
	public void accountCreate(String Name, String Phone, String Type) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AccGroup.click();
		NewAccBtn.click();
		AccName.clear();
		AccName.sendKeys(Name);
		AccPhone.clear();
		AccPhone.sendKeys(Phone);
		//Select drop = new Select(AccType);
		//handling drop downs in POM.
	    //drop.selectByVisibleText(Type);
		AccType.clear();
		AccType.sendKeys(Type);
	    AccSave.click();
	}

}
