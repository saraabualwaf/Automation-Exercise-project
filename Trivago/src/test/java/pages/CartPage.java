package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	 By cart=By.xpath("//u[text()='View Cart']");

	 By deleteIcon = By.xpath("//a[@class='cart_quantity_delete']");
	 By cartEmptyMessage = By.xpath("//b[text()='Cart is empty!']");
	 
	 
	 
	 WebDriver driver;
	    public CartPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void deleteAllProducts() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        while (true) {

	            List<WebElement> deleteList =
	                    driver.findElements(deleteIcon);

	            if (deleteList.isEmpty()) {
	                break;
	            }

	            WebElement deleteButton = deleteList.get(0);

	            new Actions(driver).moveToElement(deleteButton).click().perform();
	            wait.until(ExpectedConditions.stalenessOf(deleteButton));
	        }
	    }
	        
	    public boolean isCartEmpty() {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    	return wait.until(ExpectedConditions.elementToBeClickable(cartEmptyMessage)).isDisplayed();
		   
		    
	    
	    }
	    
	  
	    
}
