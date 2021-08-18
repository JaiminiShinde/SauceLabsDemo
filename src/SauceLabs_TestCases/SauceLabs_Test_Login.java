package SauceLabs_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLabs_Test_Login {
	public static void UserLogin(WebDriver driver) {
		//LOGIN
		WebElement usrNm=driver.findElement(By.id("user-name"));
		usrNm.sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
	}

}
