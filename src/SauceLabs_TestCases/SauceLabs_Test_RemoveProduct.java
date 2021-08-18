package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLabs_Test_RemoveProduct {
	static String RemoveProduct="light";
	public static void RemoveProduct(WebDriver driver) throws InterruptedException {
		//REMOVE PRODUCT
		switch(RemoveProduct) {
		case "backpack":
			WebElement RemoveProduct=driver.findElement(By.id("remove-sauce-labs-backpack"));
			Thread.sleep(3000);
			RemoveProduct.click();
			Thread.sleep(3000);
			System.out.println(""+RemoveProduct+"...............");
			Thread.sleep(3000);
			break;
		case "light":
			WebElement RemoveProduct1=driver.findElement(By.id("remove-sauce-labs-bike-light"));
			Thread.sleep(3000);
			RemoveProduct1.click();
			Thread.sleep(3000);
			System.out.println(""+RemoveProduct1+"...............");
			Thread.sleep(3000);
			break;
		case "onesie":
			WebElement RemoveProduct2=driver.findElement(By.id("remove-sauce-labs-onesie"));
			Thread.sleep(3000);
			RemoveProduct2.click();
			Thread.sleep(3000);
			System.out.println(""+RemoveProduct2+"...............");
			Thread.sleep(3000);
		
		}

		
//		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
//		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
//		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
//		
		
	}

}
