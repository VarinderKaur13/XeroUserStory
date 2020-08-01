package co.xero.pageObject;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import co.xero.testBase.TestBase;

public class AddAccount extends TestBase{ 
	
	@FindBy(xpath="//button[@name='navigation-menu/accounting']")
	public WebElement Accounting;
	
	@FindBy(xpath="//a[contains(text(),'Bank accounts')]")
	public WebElement BankAccounts;

	@FindBy(xpath="/html[1]/body[1]/div[2]/form[1]/div[1]/div[1]/div[2]/a[1]")
	public WebElement AddBankAccount;
	
	@FindBy(xpath="//li[contains(text(),'ANZ (NZ)')]")
	public WebElement SelectAnz;
	
	@FindBy(xpath="//li[contains(text(),'ANZ (NZ)')]")
	public WebElement AccountName;
	
	public void AddAnzAccount(){
		Accounting.click();
		l.info("Clicked on menu");
		BankAccounts.click();
		l.info("Clicked on Bank Accounts");
		AddBankAccount.click();
		l.info("clicked on AddBankAccount Button");
		SelectAnz.click();
		
		
		
	}
}
