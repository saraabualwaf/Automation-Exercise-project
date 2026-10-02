package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.logoutPage;
public class RemoveAllProducts extends BaseClass {
	/*
	 * Login → Add 3 Products to Cart → View Cart → Get Delete Icons using List → 
	 * Hover → Click Delete → Verify “Cart is empty!” → Logout→ Logout verify 
	 */
@Test
	public void RemoveAllProducts() {
		
		//login
	LoginPage loginPage = new LoginPage(driver);
	loginPage.Login("abualwafasara@gmail.com","Sara123456*");
	
	boolean result =loginPage.verifylogin().contains("Logged in as");
	Assert.assertTrue(result);
	
	//Add multi product to cart 
	ProductsPage productsPage = new ProductsPage(driver);
	productsPage.ProductsSearch("Blue Top");
	productsPage.viewproduct ();
	productsPage.EnterQuantity("2");
	productsPage.addToCart();
	
	productsPage.ProductsSearch("Men Tshirt");
	productsPage.viewproduct ();
	productsPage.EnterQuantity("1");
	productsPage.addToCart();

	
	productsPage.ProductsSearch("Sleeveless Dress");
	productsPage.viewproduct ();
	productsPage.EnterQuantity("3");
	productsPage.addToCart();
	
	productsPage.openCart();
	
	//delete all products from cart 
	CartPage cartPage = new CartPage(driver);
    cartPage.deleteAllProducts();
    
      Assert.assertTrue(cartPage.isCartEmpty());
      
      //logout
      logoutPage logoutPage1 =new logoutPage (driver);
      logoutPage1.logout();
      
      Assert.assertTrue( logoutPage1.islogout());
    		    
    		   
    		

}
}