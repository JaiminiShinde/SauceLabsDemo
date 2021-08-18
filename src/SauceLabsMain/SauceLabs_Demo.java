package SauceLabsMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SauceLabs_TestCases.SauceLabs_Test_Login;
import SauceLabs_TestCases.SauceLabs_Test_Logout;
import TestExecution.SauceLabs_TestExecution;

public class SauceLabs_Demo {
	public String websiteURL="https://www.saucedemo.com/";
	public WebDriver driver;
	String driverPath = "./Drivers/chromedriver.exe";
	
	@BeforeTest	
	public void LaunchBrowser() throws InterruptedException {
			System.out.println("Launching chrome browser");
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get(websiteURL);
			Thread.sleep(3000);
	}
	@Test
	public void SauceLabs() throws InterruptedException {
		SauceLabs_Test_Login.UserLogin(driver);
		SauceLabs_TestExecution.TestExecution(driver);
		SauceLabs_Test_Logout.Logout(driver);
		
	}
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
		System.out.println("Test Completed");
	}

}

