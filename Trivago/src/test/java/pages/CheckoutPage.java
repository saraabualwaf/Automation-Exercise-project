package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

	 
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By checkoutButton = By.xpath("//a[text()='Proceed To Checkout']");
    By placeorderButton = By.xpath("//a[text()='Place Order']");
    
    By NameonCard= By.xpath("//input[@data-qa='name-on-card']");
    By CardNumber= By.xpath("//input[@data-qa='card-number']");
    By cvc= By.xpath("//input[@data-qa='cvc']");
    By MM= By.xpath("//input[@data-qa='expiry-month']");
    By yyyy= By.xpath("//input[@data-qa='expiry-year']");
    
    By paybutton =  By.xpath("//button[text()='Pay and Confirm Order']");
    By message = By.xpath("//b[text()='Order Placed!']");
    
   
    
    public void Checkout(String NameonCard1,String  CardNumber1,String  cvc1,String month,String year) { 
  
	    WebElement checkoutButton1 =wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
	    checkoutButton1.click();
	    
	    WebElement placeorderButton1 =wait.until(ExpectedConditions.elementToBeClickable(placeorderButton));
	    placeorderButton1.click();
	    
	   wait.until(ExpectedConditions.visibilityOfElementLocated(NameonCard)).sendKeys(NameonCard1);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(CardNumber)).sendKeys( CardNumber1); 
	   wait.until(ExpectedConditions.visibilityOfElementLocated(cvc)).sendKeys(cvc1); 
	   wait.until(ExpectedConditions.visibilityOfElementLocated(yyyy)).sendKeys(year); 
	   wait.until(ExpectedConditions.visibilityOfElementLocated( MM)).sendKeys(month); 
	   
	 wait.until(ExpectedConditions.elementToBeClickable(paybutton)).click();
    }    
	   
	   
	     
	public String sucssesMessage() {
	
		return wait.until(
	             ExpectedConditions.visibilityOfElementLocated(message)).getText();
		        
	} 	
    	
}   	
    	
    	
    	
    	
    	
    	
    	
    	
   
    
    
    
    

