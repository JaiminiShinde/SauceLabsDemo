package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLabs_Test_AddProduct {
	static String SelectProduct = "Light & T-Shirt";

	public static void addProduct(WebDriver driver) throws InterruptedException {
		// ADDED PRODUCT
		switch (SelectProduct) {
		case "BackPack":
			WebElement Productname = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			Productname.click();
			Thread.sleep(3000);
			System.out.println("" + Productname + "...............");
			break;
		case "Light & T-Shirt":
			WebElement Productname1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
			Thread.sleep(3000);
			Productname1.click();
			Thread.sleep(3000);
			WebElement Productname2 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
			Thread.sleep(3000);
			Productname2.click();
			Thread.sleep(3000);
			System.out.println("" + Productname1 + "\n" + Productname2 + "...............");
			break;
		case "Jacket & two other":

			WebElement Productname3 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
			Thread.sleep(3000);
			Productname3.click();
			Thread.sleep(3000);
			WebElement Productname4 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
			Thread.sleep(3000);
			Productname4.click();
			Thread.sleep(3000);
			WebElement Productname5 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
			Thread.sleep(3000);
			Productname5.click();
			Thread.sleep(3000);
			System.out.println("" + Productname3 + "\n" + Productname4 + "\n" + Productname5 + "................");
			break;

		}

	}

}
