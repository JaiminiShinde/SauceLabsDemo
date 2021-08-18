package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabs_Test_Checkout {
	public static void Checkout(WebDriver driver) throws InterruptedException {
		
		//CHECKOUT BUTTON
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		
		//FILL CHECKOUT INFO FORM
				driver.findElement(By.id("first-name")).sendKeys("John");
				Thread.sleep(3000);
				driver.findElement(By.id("last-name")).sendKeys("Doe");
				Thread.sleep(3000);
				driver.findElement(By.id("postal-code")).sendKeys("24748");
				Thread.sleep(3000);
				driver.findElement(By.id("continue")).click();
				Thread.sleep(3000);
				
				//GET CHECKOUT OVERVIEW
				String checkoutTotal=driver.findElement(By.id("checkout_summary_container")).getText();
				Thread.sleep(3000);
				System.out.println("Your Cart OverView :\n"+checkoutTotal+"\n.........................");
				Thread.sleep(3000);
		
	}

}
