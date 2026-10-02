package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ProductsPage;


public class ProductTest extends BaseClass  {
	 @Test 
	public void searchTest() {
		
		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.ProductsSearch("Blue Top");
		productsPage.viewproduct ();
		productsPage.EnterQuantity("2");
		productsPage.addToCart();
		productsPage.openCart();
		 Assert.assertTrue(
		            productsPage.isProductNameDisplayed()
		          
		        );

		        Assert.assertTrue(
		            productsPage.isProductPriceDisplayed()
		          
		        );
		
	}
}
