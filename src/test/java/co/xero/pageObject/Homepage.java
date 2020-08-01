package co.xero.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import co.xero.testBase.TestBase;

public class Homepage extends TestBase{
	
	//driver.findElement(By.xpath(""));
	@FindBy(xpath="//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']") 
	public WebElement login;
	
	public void clickonlogin(){
		login.click();
		l.info("clicked on login button");
	}
	
}
