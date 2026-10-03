package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logoutPage {
	
	By loginTitle = By.xpath("//h2[text()='Login to your account']");
	 By logout = By.xpath("//a[text()=' Logout']");	
	
	 WebDriver driver;
	 WebDriverWait wait;
	 
	  public logoutPage (WebDriver driver) {
		   this .driver=driver;
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
	   }
	  
	  public void logout() {
	    	wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
	       
	    } 
	  
	  public boolean islogout() {
		  
		    return wait.until(
		            ExpectedConditions.visibilityOfElementLocated(loginTitle)
		    ).isDisplayed();
		}
}
