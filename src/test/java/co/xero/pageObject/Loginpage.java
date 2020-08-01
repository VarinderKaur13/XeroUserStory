package co.xero.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import co.xero.testBase.TestBase;

public class Loginpage extends TestBase{
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@id='submitButton']")
	public WebElement loginin;
	
	public void login(String name,String pwd){
		email.sendKeys(name);
		l.info("Entered email id");
		password.sendKeys(pwd);
		l.info("Entered pwd");
		loginin.click();
		l.info("clicked on loginin");
	}
}
	
	
	
	
	
	
	



