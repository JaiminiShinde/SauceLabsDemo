package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabs_Test_HomePage {
	public static void BackToHomePage(WebDriver driver) throws InterruptedException {

		//BACK HOME PAGE
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		System.out.println("Back to HomePage");
		
	}

}
