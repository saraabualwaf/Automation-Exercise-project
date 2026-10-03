package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;
    
    By SignupLogin=By.xpath("//a[text()=' Signup / Login']"); 
    By Email=By.xpath("//input[@data-qa='login-email']"); 
    By Password=By.xpath("//input[@data-qa='login-password']"); 
    By login=By.xpath("//button[@data-qa='login-button']");
    By loginsuccses=By.xpath("//a[text()=' Logged in as ']");
   
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));}
    
    
    
    public void  Login(String email,String password) {
        
	    WebElement singin =wait.until(ExpectedConditions.elementToBeClickable(SignupLogin));

	    singin.click();
	    
	    WebElement Email1 =wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
	    Email1.sendKeys(email);
	    
	    
	    WebElement password1 =wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
	    password1.sendKeys(password);
	    
	    
	    WebElement login1 =wait.until(ExpectedConditions.elementToBeClickable(login));

	    login1.click();    
	    
    }
    
    
    public String verifylogin() {
    	
         return wait.until(
             ExpectedConditions.visibilityOfElementLocated(loginsuccses)
         ).getText();
    }    
    
    
    
}