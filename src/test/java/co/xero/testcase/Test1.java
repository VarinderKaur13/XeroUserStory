package co.xero.testcase;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import co.xero.pageObject.AddAccount;
import co.xero.pageObject.Homepage;
import co.xero.pageObject.Loginpage;
import co.xero.pageObject.UserDetails;
import co.xero.testBase.TestBase;

public class Test1 extends TestBase {
	@Test
	public void testCase1() throws Throwable{
		setUp();
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
		AddAccount addAccount = PageFactory.initElements(driver, AddAccount.class);
		UserDetails userdetails = PageFactory.initElements(driver, UserDetails.class);
		
		homepage.clickonlogin();
		loginpage.login("varinderkaor1313@gmail.com", "xero@7890");
		addAccount.AddAnzAccount();
		userdetails.Details("kaorvarinder","4242424242424242");
		
		tearDown();
		
	}

}
