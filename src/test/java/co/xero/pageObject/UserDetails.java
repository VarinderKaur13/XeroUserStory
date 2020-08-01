package co.xero.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import co.xero.testBase.TestBase;

public class UserDetails extends TestBase{
 
		@FindBy(xpath="//input[@id='accountname-1037-inputEl']")
		public WebElement AccountName;
		
		@FindBy(xpath="//div[@id='accounttype-1039-bodyEl']")
		public WebElement AccountType;
		
		@FindBy(xpath="/html/body/div[4]/div/ul")
	    public WebElement AccountTypeSelected;
		
		@FindBy(xpath="//input[@id='accountnumber-1068-inputEl']")
		public WebElement AccountNumber;
		
		@FindBy(xpath="//a[@id='common-button-submit-1015']")
	    public WebElement Submit;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/footer[1]/a[1]")
	    public WebElement GotForm;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/footer[1]/a[1]")
	    public WebElement Later;
		
		@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/main[1]/footer[1]/a[1]")
	    public WebElement Dashboard;
		
		
		public void Details(String name, String number ){
		
			AccountName.sendKeys(name);
			l.info("Entered Account Name");
			
			AccountType.click();
			l.info("clicked on Account Type");
			
			AccountTypeSelected.click();
			l.info("Selected Account Type");
			
			AccountNumber.sendKeys(number);
			l.info("Entered Account Number");
			
			Submit.click();
			l.info("Submit");
			
			Dashboard.click();
			l.info("Go to dashboard");
			
			
			
			
			
		}
}
