package co.xero.testBase;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static  WebDriver driver;
	public static String Browser;
	public static Properties prop;
	public static FileInputStream fip;
	public static Logger l;
	

	public static void setUp() throws Throwable{
		l=Logger.getLogger("devpinoyLogger");
		fip=new FileInputStream(".\\src\\test\\java\\co\\xero\\configuration\\config.properties");
	
		prop=new Properties();
		prop.load(fip);
		Browser=prop.getProperty("Browser");
		l.info("Browser chooosen is "+Browser);
		if(Browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(); //OpenBrowser
			l.info("chrome browser is launched...");
		}else if(Browser.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			 driver=new InternetExplorerDriver();
			 l.info("IE browser is launched...");
		}else if(Browser.equalsIgnoreCase("mozilla")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			l.info("FF browser is launched...");
		}
		driver.get("https://www.xero.com/nz/"); //open url
		l.info("Opened url");
		driver.manage().window().maximize();//maximize browser window
		l.info("Browser window maximized...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		l.info("Implicit wait is set...");
	}    

	public static void tearDown(){
		driver.quit();
		l.info("Closed browser...");
	}
}
