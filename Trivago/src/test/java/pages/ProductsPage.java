package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	 WebDriver driver;
    
	    By Productslink=By.xpath("//a[text()=' Products']"); 
	    By Searchfield=By.xpath("//input[@id='search_product']"); 
	    By SearchButton=By.xpath("//button[@id='submit_search']");
	    
	    By viewproduct=By.xpath("//a[text()='View Product']"); 
	    By addtocart=By.xpath("//button[@class='btn btn-default cart']");
	    By quantityfield=By.xpath("//input[@id='quantity']");
	    By cart=By.xpath("//u[text()='View Cart']");
	    By productName = By.xpath("//div[@class='product-information']/h2");
	    By productPrice = By.xpath("//div[@class='product-information']/span/span");
	    
	    WebDriverWait wait ;  
	    
	   public ProductsPage (WebDriver driver) {
		   this .driver=driver;
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
		   
	   }
	   
	   public void ProductsSearch (String product) {
		 
		   WebElement Productslinkpage =wait.until(ExpectedConditions.elementToBeClickable(Productslink));
		   Productslinkpage.click();   
		    
		   WebElement Searchproduct =wait.until(ExpectedConditions.visibilityOfElementLocated(Searchfield));
		   Searchproduct.sendKeys(product);
		    
		    
		    WebElement SearchButton1 =wait.until(ExpectedConditions.elementToBeClickable(SearchButton));
		    SearchButton1.click();   
		    
		   
	   }
	    
	   public void  viewproduct () { 
		    WebElement view =wait.until(ExpectedConditions.elementToBeClickable( viewproduct));
		    view.click(); 
	   }
	   
	   public void EnterQuantity(String quantity) {
		   
		   WebElement QUN =wait.until(ExpectedConditions.visibilityOfElementLocated(quantityfield));
		   QUN.clear();
	
		   QUN.sendKeys(quantity);
		}
	   public void  addToCart()  { 
		    WebElement view =wait.until(ExpectedConditions.elementToBeClickable( addtocart));
		    view.click(); 
	   }
	   
	  
	    
	   public void openCart() {
		    WebElement cartopen =wait.until(ExpectedConditions.elementToBeClickable( cart));
		    cartopen.click(); 
	   }
	   
	   public boolean isProductNameDisplayed() {
	        return wait.until(ExpectedConditions.elementToBeClickable( productName)).isDisplayed();
	    }

	    public boolean isProductPriceDisplayed() {
	        return wait.until(ExpectedConditions.elementToBeClickable( productPrice)).isDisplayed(); 
	    }
   
	   
	   
	   
}
