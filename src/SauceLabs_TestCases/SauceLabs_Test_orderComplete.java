package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabs_Test_orderComplete {
	public static void OrderComplete(WebDriver driver) throws InterruptedException {
		//FINISH ORDER
		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000);
		String OrderCompleteMsg= driver.findElement(By.className("complete-header")).getText();
		Thread.sleep(3000);
		String orderCompleteMsg=driver.findElement(By.className("complete-text")).getText();
		Thread.sleep(3000);
		System.out.println(OrderCompleteMsg+"\n"+orderCompleteMsg+"---------*********---------");
		Thread.sleep(3000);
		
	}

}
