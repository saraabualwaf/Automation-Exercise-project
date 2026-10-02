package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.ProductsPage;

public class cartTest extends BaseClass {

  @Test
    public void deleteAllProductsFromCart() {

		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.ProductsSearch("Blue Top");
		productsPage.viewproduct ();
		productsPage.EnterQuantity("2");
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