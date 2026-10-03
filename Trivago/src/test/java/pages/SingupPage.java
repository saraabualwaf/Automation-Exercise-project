package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SingupPage {

WebDriver driver;
WebDriverWait wait;
public SingupPage(WebDriver driver) {
	this.driver=driver;
	 wait= new WebDriverWait(driver, Duration.ofSeconds(10));

	System.out.println("PAGE DRIVER = " + this.driver);
}
    
  By SignupLogin=By.xpath("//a[text()=' Signup / Login']");
  By SignupName=By.xpath("//input[@data-qa='signup-name']");
  By SignupEmail=By.xpath("//input[@data-qa='signup-email']");
  By SignupButton=By.xpath("//button[@data-qa='signup-button']");
  
  By MRButton=By.xpath("//input[@value='Mr']");
  By MRsButton=By.xpath("//input[@value='Mrs']");
  By Name=By.xpath("//input[@data-qa='name']");
  By Password=By.xpath("//input[@type='password']");
  By Day=By.xpath("//select[@id='days']");
  By Month=By.xpath("//select[@id='months']");
  By Year=By.xpath("//select[@id='years']");
  By newsletter=By.xpath("//input[@id='newsletter']");
  By specialoffers=By.xpath("//input[@id='optin']");
  
  By FirstName=By.xpath("//input[@data-qa='first_name']");
  By LasttName=By.xpath("//input[@data-qa='last_name']");
  By Company=By.xpath("//input[@data-qa='company']"); 
  By Address=By.xpath("//input[@data-qa='address']"); 
  By Address2=By.xpath("//input[@data-qa='address2']"); 
  By state=By.xpath("//input[@id='state']"); 
  By city=By.xpath("//input[@data-qa='city']"); 
  By ZipCode=By.xpath("//input[@data-qa='zipcode']"); 
  By mobilenumber=By.xpath("//input[@data-qa='mobile_number']");
  By createaccount=By.xpath("//button[text()='Create Account']");
  By country=By.xpath("//select[@id='country']"); 
  By message=By.xpath("//b[text()='Account Created!']"); 
  
 
  public void clickSignupLogin() {

	   wait.until(ExpectedConditions.elementToBeClickable(SignupLogin)).click();   
  }

  public void enterName(String name) {
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(SignupName)).sendKeys(name);
	    
  }

  public void enterEmail(String email) {
	
		 wait.until(ExpectedConditions.visibilityOfElementLocated(SignupEmail)).sendKeys(email);
		    
  }

  public void clickSignup() {
	
	   wait.until(ExpectedConditions.elementToBeClickable(SignupButton)).click();

  }

  public void signup(String name, String email) {
      clickSignupLogin();
      enterName(name);
      enterEmail(email);
      clickSignup();
  }
  
	
	
  public void enterAccountInformation() {

	   wait.until(ExpectedConditions.elementToBeClickable(MRsButton)).click();

	   wait.until(ExpectedConditions.visibilityOfElementLocated(Password)).sendKeys("Sara123456*");
		    
      

      Select daySelect = new Select(driver.findElement(Day));
      daySelect.selectByVisibleText("10");

      Select monthSelect = new Select(driver.findElement(Month));
      monthSelect.selectByVisibleText("October");

      Select yearSelect = new Select(driver.findElement(Year));
      yearSelect.selectByVisibleText("1999");

      
      wait.until(ExpectedConditions.elementToBeClickable(newsletter)).click();
      wait.until(ExpectedConditions.elementToBeClickable(specialoffers)).click();
     
      wait.until(ExpectedConditions.visibilityOfElementLocated(FirstName)).sendKeys("Sara");
      wait.until(ExpectedConditions.visibilityOfElementLocated(LasttName)).sendKeys("Abualwafa");  
      wait.until(ExpectedConditions.visibilityOfElementLocated(Company)).sendKeys("QA");  
      wait.until(ExpectedConditions.visibilityOfElementLocated(Address)).sendKeys("Jenin");  
      wait.until(ExpectedConditions.visibilityOfElementLocated(Address2)).sendKeys("Palestine");  

      Select countrySelect = new Select(driver.findElement(country));
      countrySelect.selectByVisibleText("India");
      wait.until(ExpectedConditions.visibilityOfElementLocated(state)).sendKeys("Jenin");  
      wait.until(ExpectedConditions.visibilityOfElementLocated(city)).sendKeys("Jenin");
      wait.until(ExpectedConditions.visibilityOfElementLocated(ZipCode)).sendKeys("00000");  
      wait.until(ExpectedConditions.visibilityOfElementLocated(mobilenumber)).sendKeys("0590000000");
     
      wait.until(ExpectedConditions.visibilityOfElementLocated(createaccount)).click();  


  }	
	
  public boolean isAccountCreatedDisplayed() {
	    return driver.findElement(message).isDisplayed();
	}	
  }
