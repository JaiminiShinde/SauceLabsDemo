package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabs_Test_ContinueShopping {
	public static void ContinueShopping(WebDriver driver) throws InterruptedException {
		//CONTINUE SHOPPING
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(3000);
		System.out.println("Your Shopping is continued");
	}

}
