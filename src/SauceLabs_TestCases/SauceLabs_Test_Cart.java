package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabs_Test_Cart {
	public static void Cart(WebDriver driver) throws InterruptedException {
		//CLICK ON CART
				driver.findElement(By.id("shopping_cart_container")).click();
				Thread.sleep(3000);
				//GET CART CONTENTS
				String CartContents=driver.findElement(By.className("cart_list")).getText();
				Thread.sleep(3000);
				System.out.println("Your Cart:\n"+CartContents+"\n ........................");
				Thread.sleep(3000);
		
	}

}
