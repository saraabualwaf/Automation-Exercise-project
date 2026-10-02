package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.CartPage;
import pages.ProductsPage;
import pages.LoginPage;
import pages.CheckoutPage;
import pages.SingupPage;


public class PurchaseProduct extends BaseClass{
	/*
	 * 
	 * singup → Search Product → Open Product → Verify Product Details → 
	 * Enter Quantity → Add to Cart → View Cart → Checkout → Enter Payment Details →
	 *  Place Order → Verify  

	 */
	
	 @Test
	    public void PurchaseProduct() {
		 
		//sing up
	    	SingupPage signupPage = new SingupPage(driver);

	        signupPage.signup( "Sara","abualwafasara@gmail.com");

	        signupPage.enterAccountInformation();

	        Assert.assertTrue(signupPage.isAccountCreatedDisplayed(),"Account Created!");
	        
	        
	      
	    
	        
            //search &Add product
			ProductsPage productsPage = new ProductsPage(driver);
			productsPage.ProductsSearch("Blue Top");
			productsPage.viewproduct ();
			// Verify product details
	        Assert.assertTrue( productsPage.isProductNameDisplayed() );

	        Assert.assertTrue(productsPage.isProductPriceDisplayed());
	                
	              
			//add quantity and add to cart
			
			productsPage.EnterQuantity("2");
			productsPage.addToCart();
			productsPage.openCart();
			
			
				//checkout & payment 
				CheckoutPage checkoutPage = new CheckoutPage(driver);
				checkoutPage.Checkout("sara","123456789","555","12","2028");
				
				  // Verify order placed
		        Assert.assertEquals(checkoutPage.sucssesMessage(),"ORDER PLACED!" ); 
		        
	    }
	}             
		               
		       
			 
	        
	        
	        
	        
	       