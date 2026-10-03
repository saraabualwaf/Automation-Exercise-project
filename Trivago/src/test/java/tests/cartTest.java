package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.ProductsPage;

public class cartTest extends BaseClass {
	
	@DataProvider(name = "product details")
	public Object[][] getdata() {

		return new Object[][] { 
			{ "Blue Top,2" },
			{ "Men Tshirt,1" }

		};
	}
  @Test
    public void deleteAllProductsFromCart(String productName,String quantity) {

		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.ProductsSearch(productName);
		productsPage.viewproduct (); 
		productsPage.EnterQuantity(quantity);
		productsPage.addToCart();
		productsPage.ProductsSearch("Men Tshirt");
		productsPage.viewproduct ();
		productsPage.EnterQuantity("1");
		productsPage.addToCart();
		productsPage.openCart();
		
        CartPage cartPage = new CartPage(driver);
        cartPage.deleteAllProducts();
        Assert.assertTrue(cartPage.isCartEmpty());
      

}}