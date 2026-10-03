package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver;


    @BeforeMethod
    public void setUp() {
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();				
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String url="https://automationexercise.com/";
		 driver.get(url); 
		 } 
		 

    @AfterMethod
    public void tearDown() {

     driver.quit();
    }
    
}
