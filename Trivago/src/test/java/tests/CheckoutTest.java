package tests;



import org.testng.annotations.Test;
import base.BaseClass;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest  extends BaseClass{
	
	@Test
	public void ordertest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.Login("abualwafasara@gmail.com","Sara123456*");

		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.ProductsSearch("Blue Top");
		
		productsPage.viewproduct ();
		productsPage.EnterQuantity("2");
		productsPage.addToCart();
		productsPage.openCart();
		
	CheckoutPage checkoutPage = new CheckoutPage(driver);
	checkoutPage.Checkout("sara","123456789","555","12","2028");
	
	
	}
}
