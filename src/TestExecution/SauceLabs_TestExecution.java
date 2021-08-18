package TestExecution;

import org.openqa.selenium.WebDriver;

import SauceLabs_TestCases.SauceLabs_Test_AddProduct;
import SauceLabs_TestCases.SauceLabs_Test_Cart;
import SauceLabs_TestCases.SauceLabs_Test_Checkout;
import SauceLabs_TestCases.SauceLabs_Test_ContinueShopping;
import SauceLabs_TestCases.SauceLabs_Test_HomePage;
import SauceLabs_TestCases.SauceLabs_Test_Login;
import SauceLabs_TestCases.SauceLabs_Test_Logout;
import SauceLabs_TestCases.SauceLabs_Test_RemoveProduct;
import SauceLabs_TestCases.SauceLabs_Test_orderComplete;

public class SauceLabs_TestExecution {
	public WebDriver driver;
	static String ExecutionType = "Add Product Case";

	public static void TestExecution(WebDriver driver) throws InterruptedException {

		if (ExecutionType == "Add Product Case") {
			System.out.println("Add Products to Checkout Process Initiated...");

			SauceLabs_Test_AddProduct.addProduct(driver);
			SauceLabs_Test_Cart.Cart(driver);
			SauceLabs_Test_Checkout.Checkout(driver);
			SauceLabs_Test_orderComplete.OrderComplete(driver);
			SauceLabs_Test_HomePage.BackToHomePage(driver);

		} else if (ExecutionType == "Remove Product Case") {
			System.out.println("Add Product to Remove to Checkout Process Initiated...");
			SauceLabs_Test_AddProduct.addProduct(driver);
			SauceLabs_Test_Cart.Cart(driver);
			SauceLabs_Test_RemoveProduct.RemoveProduct(driver);
			SauceLabs_Test_Checkout.Checkout(driver);
			SauceLabs_Test_orderComplete.OrderComplete(driver);
			SauceLabs_Test_HomePage.BackToHomePage(driver);

		} else {
			System.out.println("Removed Product and Continue Shopping Case Initiated...");
			SauceLabs_Test_AddProduct.addProduct(driver);
			SauceLabs_Test_Cart.Cart(driver);
			SauceLabs_Test_RemoveProduct.RemoveProduct(driver);
			SauceLabs_Test_ContinueShopping.ContinueShopping(driver);
			SauceLabs_Test_Cart.Cart(driver);
			SauceLabs_Test_Checkout.Checkout(driver);
			SauceLabs_Test_orderComplete.OrderComplete(driver);
			SauceLabs_Test_HomePage.BackToHomePage(driver);

		}

	}

}
